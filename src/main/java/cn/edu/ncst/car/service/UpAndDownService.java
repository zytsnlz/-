package cn.edu.ncst.car.service;

import cn.edu.ncst.car.mbg.model.AccountIdentifyinfo;

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



}
