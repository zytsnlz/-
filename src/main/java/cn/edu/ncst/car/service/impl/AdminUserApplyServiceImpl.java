package cn.edu.ncst.car.service.impl;

import cn.edu.ncst.car.common.utils.JwtTokenUtil;
import cn.edu.ncst.car.mbg.mapper.AccountIdentifyinfoMapper;
import cn.edu.ncst.car.mbg.mapper.AuthUserRoleRelationMapper;
import cn.edu.ncst.car.mbg.mapper.MessageInformMapper;
import cn.edu.ncst.car.mbg.model.*;
import cn.edu.ncst.car.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class AdminUserApplyServiceImpl implements AdminUserApplyService {

    @Autowired
    AccountIdentifyinfoMapper identifyinfoMapper;
    @Autowired
    JwtTokenUtil tokenUtil;
    @Autowired
    AdminUserApplyServiceImpl adminUserApplyService;
    @Autowired
    AuthUserRoleRelationMapper userRoleRelationMapper;
    @Autowired
    UpdateUserRoleByUid updateUserRoleByUid;
    @Autowired
    GetCurrentUserNameService userNameService;
    @Autowired
    MessageInformMapper messageInformMapper;
    @Autowired
    SystemInformService systemInformService;



    @Override
    public List<AccountIdentifyinfo> selectAll() {

        AccountIdentifyinfoExample identifyinfoExample = new AccountIdentifyinfoExample();
        identifyinfoExample.setOrderByClause("id desc");
        AccountIdentifyinfoExample.Criteria criteria = identifyinfoExample.createCriteria();
        List<AccountIdentifyinfo> identifyinfos = identifyinfoMapper.selectByExample(identifyinfoExample);
        return identifyinfos;
    }

    @Override
    public List<AccountIdentifyinfo> selectByName(String name) {

        AccountIdentifyinfoExample identifyinfoExample = new AccountIdentifyinfoExample();
        identifyinfoExample.setOrderByClause("id desc");
        AccountIdentifyinfoExample.Criteria criteria = identifyinfoExample.createCriteria();
        criteria.andNameEqualTo(name);
        List<AccountIdentifyinfo> identifyinfos = identifyinfoMapper.selectByExample(identifyinfoExample);
        return identifyinfos;
    }

    @Override
    public List<AccountIdentifyinfo> selectByStatus(Integer status) {

        AccountIdentifyinfoExample identifyinfoExample = new AccountIdentifyinfoExample();
        AccountIdentifyinfoExample.Criteria criteria = identifyinfoExample.createCriteria();
        criteria.andStatusEqualTo(status);
        List<AccountIdentifyinfo> identifyinfos = identifyinfoMapper.selectByExample(identifyinfoExample);
        return identifyinfos;
    }

    @Override
    public List<AccountIdentifyinfo> selectPersonApply(){

        AccountIdentifyinfoExample identifyinfoExample = new AccountIdentifyinfoExample();
        identifyinfoExample.setOrderByClause("id desc");
        AccountIdentifyinfoExample.Criteria criteria = identifyinfoExample.createCriteria();
        criteria.andUserTypeEqualTo(0);
        List<AccountIdentifyinfo> accountIdentifyinfos = identifyinfoMapper.selectByExample(identifyinfoExample);
        return accountIdentifyinfos;
    }

    @Override
    public List<AccountIdentifyinfo> selectCompanyApply(){

        AccountIdentifyinfoExample identifyinfoExample = new AccountIdentifyinfoExample();
        identifyinfoExample.setOrderByClause("id desc");
        AccountIdentifyinfoExample.Criteria criteria = identifyinfoExample.createCriteria();
        criteria.andUserTypeEqualTo(1);
        List<AccountIdentifyinfo> accountIdentifyinfos = identifyinfoMapper.selectByExample(identifyinfoExample);
        return accountIdentifyinfos;
    }

    @Override
    public AccountIdentifyinfo selectOneApplyInfoById(Integer id) {

        AccountIdentifyinfo identifyinfo = identifyinfoMapper.selectByPrimaryKey(id);
        return identifyinfo;
    }

    @Override
    public void updateUserStatus(Integer id,Integer userId,Integer status,String comment) {

        String adminName = userNameService.getCurrentUserName();

        AccountIdentifyinfo identifyinfo = identifyinfoMapper.selectByPrimaryKey(id);

        //记录处理该条申请记录的管理员的id
        identifyinfo.setHandlerId(userId);
        identifyinfo.setComment(comment);
        Timestamp ts = new Timestamp(new Date().getTime());
        identifyinfo.setDealTime(ts);
        identifyinfo.setStatus(status);
        //审批后发送系统消息通知用户审批结果
        MessageInform messageInform = systemInformService.insertAccountInform(status, id, ts);
        messageInformMapper.insert(messageInform);

        AccountIdentifyinfoExample identifyinfoExample = new AccountIdentifyinfoExample();
        AccountIdentifyinfoExample.Criteria criteria = identifyinfoExample.createCriteria();
        criteria.andIdEqualTo(id);
        identifyinfoMapper.updateByExample(identifyinfo,identifyinfoExample);
        //更新用户的角色
        int userType = identifyinfo.getUserType();
        int userId1 = identifyinfo.getUserId();
        //审核通过，更新用户的角色，用户的角色和userType对应。
        if(status == 1){

            updateUserRoleByUid.updateUserRoleByUid(userId1,userType);

        }
    }
}
