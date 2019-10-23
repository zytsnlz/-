package cn.edu.ncst.car;

import cn.edu.ncst.car.common.api.CommonPage;
import cn.edu.ncst.car.mbg.model.AccountIdentifyinfo;
import cn.edu.ncst.car.service.PageInfoService;
import cn.edu.ncst.car.service.impl.AdminUserApplyServiceImpl;

import com.github.pagehelper.PageInfo;


import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallTinyApplicationTests {

    @Autowired
    AdminUserApplyServiceImpl service;
    @Autowired
    PageInfoService pageInfoService;




    @Test
    public void contextLoads() {


        PageInfo<AccountIdentifyinfo> pageInfo = pageInfoService.byNameApplyPageInfo(1, 2, "李四");
        CommonPage<AccountIdentifyinfo> commonPage = new CommonPage<>(pageInfo);

        JSONObject json = JSONObject.fromObject(commonPage);//将java对象转换为json对象
        String str = json.toString();//将json对象转换为字符串

        System.out.println(str);


    }
    @Test
    public void oneApplyInfo(){

       // UserCompanyapplyInfo companyapplyInfo =  companyDao.selectApplyInfoById(1);


    }

}
