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

        int firstId = upAndDownDao.getFirstUnApplyId();

        AccountIdentifyinfo accountIdentifyinfo;
        if(id>firstId){

            int aimId = upAndDownDao.getApplyPreviousId(id);
            accountIdentifyinfo = adminUserApplyService.selectOneApplyInfoById(aimId);

        }else{

            accountIdentifyinfo = adminUserApplyService.selectOneApplyInfoById(firstId);
        }

        return accountIdentifyinfo;
    }

    @Override
    public AccountIdentifyinfo SelectNextApplyInfo(int id) {

        int lastId = upAndDownDao.getLastUnApplyId();

        AccountIdentifyinfo accountIdentifyinfo;
        if(id<lastId){
            int aimId = upAndDownDao.getApplyNextId(id);
            accountIdentifyinfo = adminUserApplyService.selectOneApplyInfoById(aimId);

        }else{

            accountIdentifyinfo = adminUserApplyService.selectOneApplyInfoById(lastId);
        }

        return accountIdentifyinfo;
    }

    @Override
    public Map<String, Object> SelectPreviousLicenseApply(int id) {

        int firstId = upAndDownDao.getFirstUnLicenseId();
        Map<String,Object> map;
        if(id>firstId){

            int aimId = upAndDownDao.getLicensePreviousId(id);
            map = adminLicenseApplyService.selectOneApplyInfoById(aimId);
        }else{

            map = adminLicenseApplyService.selectOneApplyInfoById(firstId);
        }
        return map;
    }

    @Override
    public Map<String, Object> SelectNextLicenseApply(int id) {

        int lastId = upAndDownDao.getLastUnLicenseId();
        Map<String,Object> map;
        if(id<lastId){

            int aimId = upAndDownDao.getLicenseNextId(id);
            map = adminLicenseApplyService.selectOneApplyInfoById(aimId);
        }else{

            map = adminLicenseApplyService.selectOneApplyInfoById(lastId);
        }

        return map;
    }

    @Override
    public AccountIdentifyinfo nextAccountIdentifyinfo(int id) {

        int lastId = upAndDownDao.getLastApplyId();
        AccountIdentifyinfo accountIdentifyinfo;
        if(id>lastId){
            int aimId = upAndDownDao.ApplyNextId(id);
            accountIdentifyinfo = adminUserApplyService.selectOneApplyInfoById(aimId);
        }else{
            accountIdentifyinfo = adminUserApplyService.selectOneApplyInfoById(lastId);
        }

        return accountIdentifyinfo;
    }

    @Override
    public AccountIdentifyinfo previousAccountIdentifyinfo(int id) {

        int firstId = upAndDownDao.getFirstApplyId();
        AccountIdentifyinfo accountIdentifyinfo;
        if(id<firstId){
            int aimId = upAndDownDao.ApplyPreviousId(id);
            accountIdentifyinfo = adminUserApplyService.selectOneApplyInfoById(aimId);
        }else{
            accountIdentifyinfo = adminUserApplyService.selectOneApplyInfoById(firstId);
        }

        return accountIdentifyinfo;
    }

    @Override
    public Map<String, Object> nextLicenseApply(int id) {

        int lastId = upAndDownDao.getLastLicenseId();
        Map<String, Object> map;
        if(id>lastId){
            int aimId = upAndDownDao.LicenseNextId(id);
            map = adminLicenseApplyService.selectOneApplyInfoById(aimId);
        }else{
            map = adminLicenseApplyService.selectOneApplyInfoById(lastId);
        }

        return map;
    }

    @Override
    public Map<String, Object> previousLicenseApply(int id) {

        int firstId = upAndDownDao.getFirstLicenseId();
        Map<String,Object> map;
        if(id<firstId){
            int aimId = upAndDownDao.LicensePreviousId(id);
            map = adminLicenseApplyService.selectOneApplyInfoById(aimId);
        }else{
            map = adminLicenseApplyService.selectOneApplyInfoById(firstId);
        }
        return map;
    }
}
