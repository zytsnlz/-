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


}
