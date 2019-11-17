package cn.edu.ncst.car.service.impl;

import cn.edu.ncst.car.common.api.InformEnum;
import cn.edu.ncst.car.mbg.mapper.MessageInformMapper;
import cn.edu.ncst.car.mbg.model.MessageInform;
import cn.edu.ncst.car.mbg.model.MessageInformExample;
import cn.edu.ncst.car.service.GetCurrentUserNameService;
import cn.edu.ncst.car.service.SystemInformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SystemInformServiceImpl implements SystemInformService {

    @Autowired
    MessageInformMapper messageInformMapper;
    @Autowired
    GetCurrentUserNameService getCurrentUserNameService;

    @Override
    public MessageInform insertAccountInform(int result, int uId, Date dealTime) {


        MessageInform messageInform = new MessageInform();
        messageInform.setFlag(0);
        messageInform.setUserId(uId);
        messageInform.setCreateTime(dealTime);
        if(result==1){
            messageInform.setMessage(InformEnum.ACCOUNT_SUCCESS.getMessage());
        }else{
            messageInform.setMessage(InformEnum.ACCOUNT_FAILED.getMessage());
        }
        messageInformMapper.insert(messageInform);
        return messageInform;

    }

    @Override
    public MessageInform insertLicenseInform(int result, int uId, Date dealTime) {

        MessageInform messageInform = new MessageInform();
        messageInform.setFlag(0);
        messageInform.setUserId(uId);
        messageInform.setCreateTime(dealTime);
        if(result==1){
            messageInform.setMessage(InformEnum.LICENSE_SUCCESS.getMessage());
        }else{
            messageInform.setMessage(InformEnum.LICENSE_FAILED.getMessage());
        }
        messageInformMapper.insert(messageInform);
        return messageInform;
    }

    @Override
    public List<MessageInform> listInform() {

        String userName = getCurrentUserNameService.getCurrentUserName();
        Integer userId = getCurrentUserNameService.getIdByUserName(userName);
        MessageInformExample messageInformExample = new MessageInformExample();
        messageInformExample.setOrderByClause("create_time desc");
        MessageInformExample.Criteria criteria = messageInformExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<MessageInform> messageInforms = messageInformMapper.selectByExample(messageInformExample);
        return messageInforms;
    }


    @Override
    public MessageInform updateInform(int id) {

        MessageInform messageInform = messageInformMapper.selectByPrimaryKey(id);
        if(messageInform.getFlag()==1){
            return messageInform;
        } else {
            messageInform.setFlag(0);
            return messageInform;
        }

    }

    @Override
    public void deleteInform(int id) {
        messageInformMapper.deleteByPrimaryKey(id);
    }
}
