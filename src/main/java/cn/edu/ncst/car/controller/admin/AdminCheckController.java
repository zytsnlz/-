package cn.edu.ncst.car.controller.admin;

import cn.edu.ncst.car.common.api.CommonResult;
import cn.edu.ncst.car.service.AdminLicenseApplyService;
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
@Api(description = "审核用户的申请信息",tags = "AdminCheckController")
@RequestMapping("/admin")
public class AdminCheckController {

    @Autowired
    AdminUserApplyService applyService;

    @Autowired
    AdminLicenseApplyService licenseApplyService;

    @RequestMapping(value = "/checkUser",method = RequestMethod.POST)
    @ApiOperation("审核用户的认证申请信息")
    public CommonResult<String> checkApplyInfo(@RequestParam Integer id,
                                       @RequestParam @ApiParam(value = "管理员对用户的操作(1-审核通过，2-审核未通过)") Integer status,
                                       @RequestParam @ApiParam(value = "管理员的反馈信息") String comment,
                                       @RequestParam @ApiParam(value = "从token中获取当前处理该条申请的管理员") String token){

        applyService.updateUserStatus(id,status,comment,token);
        return CommonResult.success("审核成功");

    }
    @ApiOperation("审核用户的通行证申请信息")
    @RequestMapping(value = "/checkLicense",method = RequestMethod.POST)
    public CommonResult<String> checkLicenseInfo(@RequestParam Integer id,
                                 @RequestParam @ApiParam(value = "管理员对用户的操作(1-审核通过，2-审核未通过)") Integer status,
                                 @RequestParam @ApiParam(value = "管理员的反馈信息") String comment,
                                 @RequestParam @ApiParam(value = "从token中获取当前处理该条申请的管理员") String token){

        licenseApplyService.updateUserStatus(id,status,comment,token);
        return CommonResult.success("审核成功");

    }

}
