package cn.edu.ncst.car.service;

import cn.edu.ncst.car.mbg.model.AccountIdentifyinfo;
import cn.edu.ncst.car.mbg.model.LicenseApplyinfo;

public interface UserApplyInfoService {

    /**
     * 保存用户认证申请信息
     * @param accountIdentifyinfo
     */
    void insertApplyInfo(AccountIdentifyinfo accountIdentifyinfo);

    /**
     * 保存用户提交的通行证申请信息
     * @param License
     */
    void insertLicenseApplyInfo(LicenseApplyinfo License);

    /**
     * 用户更改申请信息
     * 审核没有通过，用户直接在原来的申请信息基础上进行修改然后提交，省去用户重新填写信息
     * @param accountIdentifyinfo
     */
    void updateApplyInfo(AccountIdentifyinfo accountIdentifyinfo);

}
