package cn.edu.ncst.car.service.impl;

import cn.edu.ncst.car.mbg.model.AccountIdentifyinfo;
import cn.edu.ncst.car.service.AdminUserApplyService;
import cn.edu.ncst.car.service.UserPageInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPageInfoServiceImpl implements UserPageInfoService {

    @Autowired
    private AdminUserApplyService userApplyService;

    @Override
    public PageInfo<AccountIdentifyinfo> userApplyPageInfo(int pageNum, int pageSize){

        PageHelper.startPage(pageNum,pageSize);
        List<AccountIdentifyinfo> identifyinfos = userApplyService.selectAll();
        PageInfo<AccountIdentifyinfo> pageInfo = new PageInfo<>(identifyinfos);
        return pageInfo;
    }

    @Override
    public PageInfo<AccountIdentifyinfo> personApplyPageInfo(int pageNum, int pageSize) {

        PageHelper.startPage(pageNum,pageSize);
        List<AccountIdentifyinfo> identifyinfos = userApplyService.selectPersonApply();
        PageInfo<AccountIdentifyinfo> pageInfo = new PageInfo<>(identifyinfos);
        return pageInfo;
    }

    @Override
    public PageInfo<AccountIdentifyinfo> componyApplyPageInfo(int pageNum, int pageSize) {

        PageHelper.startPage(pageNum,pageSize);
        List<AccountIdentifyinfo> identifyinfos = userApplyService.selectCompanyApply();
        PageInfo<AccountIdentifyinfo> pageInfo = new PageInfo<>(identifyinfos);
        return pageInfo;
    }

    @Override
    public PageInfo<AccountIdentifyinfo> byNameApplyPageInfo(int pageNum, int pageSize,String name) {

        PageHelper.startPage(pageNum,pageSize);
        List<AccountIdentifyinfo> identifyinfos = userApplyService.selectByName(name);
        PageInfo<AccountIdentifyinfo> pageInfo = new PageInfo<>(identifyinfos);
        return pageInfo;

    }
    @Override
    public PageInfo<AccountIdentifyinfo> byStatusApplyPageInfo(int pageNum,int pageSize,Integer status){
        PageHelper.startPage(pageNum,pageSize);
        List<AccountIdentifyinfo> identifyinfos = userApplyService.selectByStatus(status);
        PageInfo<AccountIdentifyinfo> pageInfo = new PageInfo<>(identifyinfos);
        return pageInfo;
    }


}
