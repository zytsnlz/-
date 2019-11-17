package cn.edu.ncst.car.service;

import cn.edu.ncst.car.mbg.model.MessageInform;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 系统通知
 */
@Service
public interface SystemInformService {

    /**
     * 返回给用户的账户认证结果通知消息
     * @return
     */
     MessageInform insertAccountInform(int result, int uId, Date dealTime);

    /**
     * 返回给用户的通行证认证结果通知消息
     * @return
     */
    MessageInform insertLicenseInform(int result,int uId,Date dealTime);

    /**
     * 获取当前用户的所有的系统通知消息
     * @return
     */
    List<MessageInform> listInform();

    /**
     * 查看某条系统通知消息
     * @param id
     * @return
     */
    MessageInform updateInform(int id);

    /**
     * 删除某条系统通知消息
     * @param id
     */
    void deleteInform(int id);
}
