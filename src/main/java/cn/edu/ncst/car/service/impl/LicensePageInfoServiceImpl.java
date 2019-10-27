package cn.edu.ncst.car.service.impl;

import cn.edu.ncst.car.dao.MainLicenseApplyIDao;
import cn.edu.ncst.car.dto.MainLicenseApplyInfo;
import cn.edu.ncst.car.service.LicensePageInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicensePageInfoServiceImpl implements LicensePageInfoService {

    @Autowired
    MainLicenseApplyIDao mainLicenseApplyIDao;

    @Override
    public PageInfo<MainLicenseApplyInfo> licenseApplyPageInfo(int pageNum, int pageSize) {

        PageHelper.startPage(pageNum,pageSize);
        List<MainLicenseApplyInfo> infos = mainLicenseApplyIDao.selectAll();
        PageInfo<MainLicenseApplyInfo> pageInfo = new PageInfo<>(infos);
        return pageInfo;
    }

    @Override
    public PageInfo<MainLicenseApplyInfo> byStatusPageInfo(int pageNum, int pageSize,int status) {

        PageHelper.startPage(pageNum,pageSize);
        List<MainLicenseApplyInfo> infos = mainLicenseApplyIDao.selectByStatus(status);
        PageInfo<MainLicenseApplyInfo> pageInfo = new PageInfo<>(infos);
        return pageInfo;
    }

    @Override
    public PageInfo<MainLicenseApplyInfo> byPlateNoPageInfo(int pageNum, int pageSize,String plateNo) {

        PageHelper.startPage(pageNum,pageSize);
        List<MainLicenseApplyInfo> infos = mainLicenseApplyIDao.selectByPlateNo(plateNo);
        PageInfo<MainLicenseApplyInfo> pageInfo = new PageInfo<>(infos);
        return pageInfo;
    }

    @Override
    public PageInfo<MainLicenseApplyInfo> personLicensePageInfo(int pageNum, int pageSize) {

        PageHelper.startPage(pageNum,pageSize);
        List<MainLicenseApplyInfo> infos = mainLicenseApplyIDao.selectPersonLicense();
        PageInfo<MainLicenseApplyInfo> pageInfo = new PageInfo<>(infos);
        return pageInfo;
    }

    @Override
    public PageInfo<MainLicenseApplyInfo> companyLicensePageInfo(int pageNum, int pageSize) {

        PageHelper.startPage(pageNum,pageSize);
        List<MainLicenseApplyInfo> infos = mainLicenseApplyIDao.selectCompanyLicense();
        PageInfo<MainLicenseApplyInfo> pageInfo = new PageInfo<>(infos);
        return pageInfo;
    }
}
