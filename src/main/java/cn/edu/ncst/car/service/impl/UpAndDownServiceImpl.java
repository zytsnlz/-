package cn.edu.ncst.car.service.impl;

import cn.edu.ncst.car.dao.UpAndDownDao;
import cn.edu.ncst.car.mbg.model.AccountIdentifyinfo;
import cn.edu.ncst.car.service.AdminLicenseApplyService;
import cn.edu.ncst.car.service.AdminUserApplyService;
import cn.edu.ncst.car.service.UpAndDownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UpAndDownServiceImpl implements UpAndDownService {

    @Autowired
    AdminLicenseApplyService adminLicenseApplyService;

    @Autowired
    AdminUserApplyService adminUserApplyService;

    @Autowired
    UpAndDownDao upAndDownDao;

    @Override
    public AccountIdentifyinfo SelectPreviousApplyInfo(int id) {

        int aimId = upAndDownDao.getApplyPreviousId(id);
        AccountIdentifyinfo accountIdentifyinfo = adminUserApplyService.selectOneApplyInfoById(aimId);
        return accountIdentifyinfo;
    }

    @Override
    public AccountIdentifyinfo SelectNextApplyInfo(int id) {

        int aimId = upAndDownDao.getApplyNextId(id);
        AccountIdentifyinfo accountIdentifyinfo = adminUserApplyService.selectOneApplyInfoById(aimId);
        return accountIdentifyinfo;
    }

    @Override
    public Map<String, Object> SelectPreviousLicenseApply(int id) {

        int aimId = upAndDownDao.getLicensePreviousId(id);
        Map<String,Object> map = adminLicenseApplyService.selectOneApplyInfoById(aimId);
        return map;
    }

    @Override
    public Map<String, Object> SelectNextLicenseApply(int id) {

        int aimId = upAndDownDao.getLicenseNextId(id);
        Map<String,Object> map = adminLicenseApplyService.selectOneApplyInfoById(aimId);
        return map;
    }
}
