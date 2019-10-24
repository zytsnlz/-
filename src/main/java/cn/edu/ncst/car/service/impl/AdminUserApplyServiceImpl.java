package cn.edu.ncst.car.service.impl;

import cn.edu.ncst.car.common.utils.JwtTokenUtil;
import cn.edu.ncst.car.mbg.mapper.AccountIdentifyinfoMapper;
import cn.edu.ncst.car.mbg.model.AccountIdentifyinfo;
import cn.edu.ncst.car.mbg.model.AccountIdentifyinfoExample;
import cn.edu.ncst.car.mbg.model.AuthUser;
import cn.edu.ncst.car.mbg.model.AuthUserExample;
import cn.edu.ncst.car.service.AdminUserApplyService;
import cn.edu.ncst.car.service.UmsAdminService;
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
    UmsAdminService adminService;


    @Override
    public List<AccountIdentifyinfo> selectAll() {

        AccountIdentifyinfoExample identifyinfoExample = new AccountIdentifyinfoExample();
        AccountIdentifyinfoExample.Criteria criteria = identifyinfoExample.createCriteria();
        List<AccountIdentifyinfo> identifyinfos = identifyinfoMapper.selectByExample(identifyinfoExample);
        return identifyinfos;
    }

    @Override
    public List<AccountIdentifyinfo> selectByName(String name) {

        AccountIdentifyinfoExample identifyinfoExample = new AccountIdentifyinfoExample();
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
        AccountIdentifyinfoExample.Criteria criteria = identifyinfoExample.createCriteria();
        criteria.andUserTypeEqualTo(0);
        List<AccountIdentifyinfo> accountIdentifyinfos = identifyinfoMapper.selectByExample(identifyinfoExample);
        return accountIdentifyinfos;
    }

    @Override
    public List<AccountIdentifyinfo> selectCompanyApply(){

        AccountIdentifyinfoExample identifyinfoExample = new AccountIdentifyinfoExample();
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
    public void updateUserStatus(Integer id,Integer status,String comment,String token) {

        AccountIdentifyinfo identifyinfo = identifyinfoMapper.selectByPrimaryKey(id);
        String adminName = tokenUtil.getUserNameFromToken(token);

        AuthUserExample example = new AuthUserExample();
        example.createCriteria().andUsernameEqualTo(adminName);
        AuthUser authUser = adminService.getAdminByUsername(adminName);
        identifyinfo.setHandlerId(authUser.getId());

        identifyinfo.setComment(comment);
        Timestamp ts = new Timestamp(new Date().getTime());
        identifyinfo.setDealTime(ts);
        identifyinfo.setStatus(status);
        AccountIdentifyinfoExample identifyinfoExample = new AccountIdentifyinfoExample();
        AccountIdentifyinfoExample.Criteria criteria = identifyinfoExample.createCriteria();
        criteria.andIdEqualTo(id);
        identifyinfoMapper.updateByExample(identifyinfo,identifyinfoExample);
    }
}
