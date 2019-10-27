package cn.edu.ncst.car.service.impl;

import cn.edu.ncst.car.common.utils.JwtTokenUtil;
import cn.edu.ncst.car.dao.EntireLicenseApplyDao;
import cn.edu.ncst.car.dao.LicenseApplyRecordDao;
import cn.edu.ncst.car.dao.MainLicenseApplyIDao;
import cn.edu.ncst.car.dto.EntireLicenseApplyInfo;
import cn.edu.ncst.car.dto.LicenseApplyRecord;
import cn.edu.ncst.car.dto.MainLicenseApplyInfo;
import cn.edu.ncst.car.mbg.mapper.LicenseApplyinfoMapper;
import cn.edu.ncst.car.mbg.model.AuthUser;
import cn.edu.ncst.car.mbg.model.AuthUserExample;
import cn.edu.ncst.car.mbg.model.LicenseApplyinfo;
import cn.edu.ncst.car.mbg.model.LicenseApplyinfoExample;
import cn.edu.ncst.car.service.UmsAdminService;
import cn.edu.ncst.car.service.UpdateUserRoleByUid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AdminLicenseApplyServiceImpl implements cn.edu.ncst.car.service.AdminLicenseApplyService {

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
    UmsAdminService adminService;

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
    public void updateUserStatus(Integer id, Integer status, String comment, String token) {

        LicenseApplyinfo licenseApplyinfo = licenseApplyinfoMapper.selectByPrimaryKey(id);
        //从token中获取当前处理该条记录的管理员的用户名
        String adminName = tokenUtil.getUserNameFromToken(token);
        //获取管理员的id
        AuthUserExample example = new AuthUserExample();
        example.createCriteria().andUsernameEqualTo(adminName);
        AuthUser authUser = adminService.getAdminByUsername(adminName);
        //记录处理该条记录的管理员的id
        licenseApplyinfo.setHandlerId(authUser.getId());
        licenseApplyinfo.setComment(comment);
        licenseApplyinfo.setStatus(status);


        LicenseApplyinfoExample applyinfoExample = new LicenseApplyinfoExample();
        LicenseApplyinfoExample.Criteria criteria = applyinfoExample.createCriteria();
        criteria.andIdEqualTo(id);
        licenseApplyinfoMapper.updateByExample(licenseApplyinfo,applyinfoExample);


    }

}
