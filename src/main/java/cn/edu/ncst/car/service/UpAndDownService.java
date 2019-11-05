package cn.edu.ncst.car.service;

import cn.edu.ncst.car.mbg.model.AccountIdentifyinfo;
import org.omg.CORBA.OBJ_ADAPTER;

import java.util.Map;

/**
 * 获取当前未处理记录的上一条或者是下一条未处理的记录
 */
public interface UpAndDownService {

    /**
     * 查看上一条未处理的用户认证申请记录
     * @param id 当前处理的用户认证申请记录的id
     * @return
     */
    public AccountIdentifyinfo SelectPreviousApplyInfo(int id);

    /**
     * 查看下一条未处理的用户认证申请记录
     * @param id
     * @return
     */
    public AccountIdentifyinfo SelectNextApplyInfo(int id);

    /**
     * 查看上一条未处理的用户通行证申请记录
     * @param id
     * @return
     */
    public Map<String,Object> SelectPreviousLicenseApply(int id);


    /**
     * 查看下一条未处理的用户通行证申请记录
     * @param id
     * @return
     */
    public Map<String,Object> SelectNextLicenseApply(int id);


    /**
     * 查看下一条用户认证申请
     * @param id 当前记录的id
     * @return
     */
    public AccountIdentifyinfo nextAccountIdentifyinfo(int id);

    /**
     * 查看上一条用户申请认证录
     * @param id
     * @return
     */
    public AccountIdentifyinfo previousAccountIdentifyinfo(int id);

    /**
     * 查看下一条用户通行证申请
     * @param id
     * @return
     */
    public Map<String,Object> nextLicenseApply(int id);

    /**
     * 查看上一条用户通行证申请
     * @param id
     * @return
     */
    public Map<String,Object> previousLicenseApply(int id);



}
