package cn.edu.ncst.car.service.impl;

import cn.edu.ncst.car.mbg.mapper.AccountIdentifyinfoMapper;
import cn.edu.ncst.car.mbg.model.AccountIdentifyinfo;
import cn.edu.ncst.car.mbg.model.AccountIdentifyinfoExample;
import cn.edu.ncst.car.service.AdminUserApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminUserApplyServiceImpl implements AdminUserApplyService {

    @Autowired
    AccountIdentifyinfoMapper identifyinfoMapper;


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


}
