package cn.edu.ncst.car;

import cn.edu.ncst.car.common.api.CommonPage;
import cn.edu.ncst.car.dao.EntireLicenseApplyDao;
import cn.edu.ncst.car.dao.LicenseApplyRecordDao;
import cn.edu.ncst.car.dao.UpAndDownDao;
import cn.edu.ncst.car.dao.WorkCountDao;
import cn.edu.ncst.car.dto.*;
import cn.edu.ncst.car.mbg.mapper.AuthUserMapper;
import cn.edu.ncst.car.mbg.mapper.AuthUserRoleRelationMapper;
import cn.edu.ncst.car.mbg.mapper.LicenseApplyinfoMapper;
import cn.edu.ncst.car.mbg.model.*;
import cn.edu.ncst.car.service.AdminLicenseApplyService;
import cn.edu.ncst.car.service.UmsAdminService;
import cn.edu.ncst.car.service.UpdateUserRoleByUid;
import cn.edu.ncst.car.service.UserPageInfoService;
import cn.edu.ncst.car.service.impl.AdminUserApplyServiceImpl;

import cn.edu.ncst.car.service.impl.WorkCountServiceImpl;
import com.github.pagehelper.PageInfo;


import io.swagger.models.auth.In;
import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallTinyApplicationTests {

    @Autowired
    AdminUserApplyServiceImpl adminUserApplyService;
    @Autowired
    UserPageInfoService userPageInfoService;

    @Autowired
    AdminLicenseApplyService adminLicenseApplyService;


    @Test
    public void contextLoads() {


        PageInfo<AccountIdentifyinfo> pageInfo = userPageInfoService.componyApplyPageInfo(1, 2);
        System.out.println(pageInfo);
        System.out.println("-----------------------------------------");
        CommonPage<AccountIdentifyinfo> commonPage = new CommonPage<>(pageInfo);

        JSONObject json = JSONObject.fromObject(commonPage);//将java对象转换为json对象
        String str = json.toString();//将json对象转换为字符串

        System.out.println(str);


    }
    @Autowired
    LicenseApplyinfoMapper licenseApplyinfoMapper;
    @Autowired
    UpdateUserRoleByUid updateUserRoleByUid;
    @Autowired
    LicenseApplyRecordDao licenseApplyRecordDao;
    @Autowired
    EntireLicenseApplyDao entireLicenseApplyDao;
    @Test
    public void test01(){

        int id = 1;

        Map<String,Object> map = new HashMap<>();
        EntireLicenseApplyInfo entireLicenseApplyInfo = null;
        LicenseApplyinfo licenseApplyinfo = licenseApplyinfoMapper.selectByPrimaryKey(id);
        System.out.println(licenseApplyinfo);
        System.out.println("-----------------------------------");
        //获取该条通行证记录的uid
        int uId = licenseApplyinfo.getUserId();
        System.out.println("uid:"+uId);
        System.out.println("-------------------------------------");

        //获取该条通行证记录的申请人的用户类型
        int roleId = updateUserRoleByUid.selectUserRoleByUid(uId);
        System.out.println("roleId:"+roleId);
        System.out.println("-------------------------------------");
        //获取当前用户的通行证申请审核记录

        List<LicenseApplyRecord> licenseApplyRecords = licenseApplyRecordDao.selectLicenseApplyRecord(uId);
        for (LicenseApplyRecord licenseApplyRecord : licenseApplyRecords) {
            System.out.println(licenseApplyRecord);
        }
        System.out.println(licenseApplyRecords.isEmpty());
        //企业用户
        if(roleId == 1){
            entireLicenseApplyInfo = entireLicenseApplyDao.selectByIdCompany(id);
        }
        //个人用户
        if (roleId == 0){
            entireLicenseApplyInfo = entireLicenseApplyDao.selectByIdPerson(id);
        }
        System.out.println(entireLicenseApplyInfo);
        map.put("userType",roleId);
        map.put("licenseApplyInfo",entireLicenseApplyInfo);
        map.put("licenseApplyRecord",licenseApplyRecords);

        for (Object value : map.values()) {
            System.out.println(value);
        }
    }
    @Test
    public void test2() {

        System.out.println("---");
        int user_role = updateUserRoleByUid.selectUserRoleByUid(1);
        System.out.println(user_role);


    }
    @Autowired
    UpAndDownDao upAndDownDao;
    @Test
    public void test03(){

        int nextId = upAndDownDao.getApplyNextId(3);//1
        int previous = upAndDownDao.getApplyPreviousId(3);//4
        System.out.println(previous);
        System.out.println(nextId);

        int nextLicense = upAndDownDao.getLicenseNextId(2);//2
        int previousLicense = upAndDownDao.getLicensePreviousId(2);//4
        System.out.println(nextLicense);
        System.out.println(previousLicense);

    }

    @Autowired
    WorkCountServiceImpl workCountService;

    @Autowired
    WorkCountDao workCountDao;
    @Autowired
    UmsAdminService umsAdminService;
    @Autowired
    AuthUserMapper authUserMapper;
    @Autowired
    AuthUserRoleRelationMapper authUserRoleRelationMapper;
    @Test
    public void test04() throws ParseException {

        /*CountCondition countCondition=new CountCondition();
        countCondition.setAdminId(4);
        countCondition.setAdminName("admin");
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = dateFormat1.parse("2009-12-12");
        Date d2 = dateFormat1.parse("2020-12-12");
        countCondition.setStartTime(d1);
        countCondition.setEndTime(d2);
        Map<String,Integer> count = workCountDao.countWork(countCondition);

        System.out.println(count);*/
        CountAllCondition countAllCondition = new CountAllCondition();
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = dateFormat1.parse("2009-12-12");
        Date d2 = dateFormat1.parse("2020-12-12");
        countAllCondition.setStartTime(d1);
        countAllCondition.setEndTime(d2);
        AuthUserRoleRelationExample authUserRoleRelationExample = new AuthUserRoleRelationExample();
        AuthUserRoleRelationExample.Criteria criteria = authUserRoleRelationExample.createCriteria();
        criteria.andRoleIdEqualTo(3);
        List<AuthUserRoleRelation> list = authUserRoleRelationMapper.selectByExample(authUserRoleRelationExample);
        //获取所有的管理员的id
        List<Integer> idList = new ArrayList<>();

        for (AuthUserRoleRelation authUserRoleRelation : list) {
            idList.add(authUserRoleRelation.getUserId());
        }
        for (Integer integer : idList) {
            System.out.println(integer);
        }

        Date startTime = countAllCondition.getStartTime();
        Date endTime = countAllCondition.getEndTime();

        CountCondition countCondition = new CountCondition();
        countCondition.setEndTime(endTime);
        countCondition.setStartTime(startTime);



        List<CountResult> countResultList = new ArrayList<>();
        WorkCountServiceImpl workCountService = new WorkCountServiceImpl();
        for (Integer integer : idList) {
            CountResult countResult = new CountResult();
            countResult.setId(integer);

            AuthUser authUser = authUserMapper.selectByPrimaryKey(integer);
            //根据管理员的id获取管理员的姓名
            String adminName = authUser.getUsername();
            System.out.println(adminName);
            countResult.setName(adminName);
            countCondition.setAdminName(adminName);
            countCondition.setAdminId(integer);
            //获取某位管理员的审核数量
            Map<Object, Object> workcount = workCountDao.countWork(countCondition);
            int  countTotal = workCountDao.countTotal(countCondition);
            workcount.put("total",countTotal);
            countResult.setWorkCount(workcount);
            countResultList.add(countResult);
        }

    }


}
