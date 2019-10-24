package cn.edu.ncst.car;

import cn.edu.ncst.car.common.api.CommonPage;
import cn.edu.ncst.car.common.utils.JwtTokenUtil;
import cn.edu.ncst.car.dto.AdminUserDetails;
import cn.edu.ncst.car.mbg.model.AccountIdentifyinfo;
import cn.edu.ncst.car.service.PageInfoService;
import cn.edu.ncst.car.service.UmsAdminService;
import cn.edu.ncst.car.service.impl.AdminUserApplyServiceImpl;

import cn.edu.ncst.car.service.impl.UmsAdminServiceImpl;
import com.github.pagehelper.PageInfo;


import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallTinyApplicationTests {

    @Autowired
    AdminUserApplyServiceImpl adminUserApplyService;
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
    @Autowired
    UserDetailsService userDetailsService ;
    @Autowired
    JwtTokenUtil jwtTokenUtil;
    @Test
    public void oneApplyInfo(){


        UserDetails userDetails = userDetailsService.loadUserByUsername("admin");
        String token = jwtTokenUtil.generateToken(userDetails);

        System.out.println(token);
        String name = jwtTokenUtil.getUserNameFromToken(token);
        System.out.println(name);
        //adminUserApplyService.updateUserStatus(1,1,"审核通过"，);
    }

}
