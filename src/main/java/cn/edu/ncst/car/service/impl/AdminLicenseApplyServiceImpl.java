package cn.edu.ncst.car.service.impl;

import cn.edu.ncst.car.common.utils.JwtTokenUtil;
import cn.edu.ncst.car.dao.EntireLicenseApplyDao;
import cn.edu.ncst.car.dao.LicenseApplyRecordDao;
import cn.edu.ncst.car.dao.MainLicenseApplyIDao;
import cn.edu.ncst.car.dto.EntireLicenseApplyInfo;
import cn.edu.ncst.car.dto.LicenseApplyRecord;
import cn.edu.ncst.car.dto.MainLicenseApplyInfo;
import cn.edu.ncst.car.mbg.mapper.LicenseApplyinfoMapper;
import cn.edu.ncst.car.mbg.mapper.MessageInformMapper;
import cn.edu.ncst.car.mbg.model.*;
import cn.edu.ncst.car.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AdminLicenseApplyServiceImpl implements AdminLicenseApplyService {

    @Autowired
    EntireLicenseApplyDao entireLicenseApplyDao;

    @Autowired
    MainLicenseApplyIDao licenseApplyIDao;

    @Autowired
    UpdateUserRoleByUid updateUserRoleByUid;

    @Autowired
    LicenseApplyinfoMapper licenseApplyinfoMapper;

    @Autowired
    LicenseApplyRecordDao licenseApplyRecordDao;

    @Autowired
    JwtTokenUtil tokenUtil;

    @Autowired
    GetCurrentUserNameService userNameService;

    @Autowired
    MessageInformMapper messageInformMapper;

    @Autowired
    SystemInformService systemInformService;

    @Override
    public List<MainLicenseApplyInfo> selectAll() {

        List<MainLicenseApplyInfo> infos = licenseApplyIDao.selectAll();
        return infos;
    }

    @Override
    public List<MainLicenseApplyInfo> selectCompanyLicense() {

        List<MainLicenseApplyInfo> infos = licenseApplyIDao.selectCompanyLicense();
        return infos;
    }

    @Override
    public List<MainLicenseApplyInfo> selectPersonLicense() {

        List<MainLicenseApplyInfo> infos = licenseApplyIDao.selectPersonLicense();
        return infos;

    }


    @Override
    public List<MainLicenseApplyInfo> selectByStatus(Integer status) {

        List<MainLicenseApplyInfo> infos = licenseApplyIDao.selectByStatus(status);
        return infos;
    }

    @Override
    public List<MainLicenseApplyInfo> selectByPlateNo(String plateNo) {

        List<MainLicenseApplyInfo> infos = licenseApplyIDao.selectByPlateNo(plateNo);
        return infos;
    }

    @Override
    public Map<String,Object> selectOneApplyInfoById(Integer id) {

        Map<String,Object> map = new HashMap<>();
        EntireLicenseApplyInfo entireLicenseApplyInfo = null;
        LicenseApplyinfo licenseApplyinfo = licenseApplyinfoMapper.selectByPrimaryKey(id);
        //获取该条通行证记录的uid
        int uId = licenseApplyinfo.getUserId();
        //获取该条通行证记录的申请人的用户类型
        int roleId = updateUserRoleByUid.selectUserRoleByUid(uId);
        //获取当前用户的通行证申请审核记录
        List<LicenseApplyRecord> licenseApplyRecords = licenseApplyRecordDao.selectLicenseApplyRecord(uId);
        //企业用户
        if(roleId == 1){
            entireLicenseApplyInfo = entireLicenseApplyDao.selectByIdCompany(id);
        }
        //个人用户
        if (roleId == 0){
            entireLicenseApplyInfo = entireLicenseApplyDao.selectByIdPerson(id);
        }
        map.put("userType",roleId);
        map.put("licenseApplyInfo",entireLicenseApplyInfo);
        map.put("licenseApplyRecord",licenseApplyRecords);

        return map;
    }

    @Override
    public void updateUserStatus(Integer id,Integer userId, Integer status, String comment) {

        //获取当前登录管理员的用户名
        String adminName = userNameService.getCurrentUserName();

        LicenseApplyinfo licenseApplyinfo = licenseApplyinfoMapper.selectByPrimaryKey(id);

        //记录处理该条记录的管理员的id
        licenseApplyinfo.setHandlerId(userId);
        licenseApplyinfo.setComment(comment);
        licenseApplyinfo.setStatus(status);
        Timestamp ts = new Timestamp(new Date().getTime());
        licenseApplyinfo.setDealTime(ts);
        //审批后发送系统消息通知用户审批结果
        MessageInform messageInform = systemInformService.insertLicenseInform(status,id,ts);
        messageInformMapper.insert(messageInform);

        LicenseApplyinfoExample applyinfoExample = new LicenseApplyinfoExample();
        LicenseApplyinfoExample.Criteria criteria = applyinfoExample.createCriteria();
        criteria.andIdEqualTo(id);
        licenseApplyinfoMapper.updateByExample(licenseApplyinfo,applyinfoExample);


    }

}
