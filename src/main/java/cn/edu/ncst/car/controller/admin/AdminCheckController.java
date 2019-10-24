package cn.edu.ncst.car.controller.admin;

import cn.edu.ncst.car.service.AdminUserApplyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@Api(description = "审核用户的申请信息")
@RequestMapping("/admin")
public class AdminCheckController {

    @Autowired
    AdminUserApplyService applyService;

    @RequestMapping(value = "/checkUser",method = RequestMethod.POST)
    @ApiOperation("审核用户的认证申请信息")
    public void checkApplyInfo(@RequestParam Integer id,
                               @RequestParam @ApiParam(value = "管理员对用户的操作(1-审核通过，2-审核未通过)") Integer status,
                               @RequestParam @ApiParam(value = "管理员的反馈信息") String comment,
                               @RequestParam String token){

        applyService.updateUserStatus(id,status,comment,token);

    }
    @ApiOperation("审核用户的通行证申请信息")
    @RequestMapping(value = "/checkLicense",method = RequestMethod.POST)
    public void checkLicenseInfo(){
            
    }

}
