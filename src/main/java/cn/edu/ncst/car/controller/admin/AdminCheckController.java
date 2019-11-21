package cn.edu.ncst.car.controller.admin;

import cn.edu.ncst.car.common.api.CommonResult;
import cn.edu.ncst.car.service.AdminLicenseApplyService;
import cn.edu.ncst.car.service.AdminUserApplyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
    public CommonResult<String> checkApplyInfo(@RequestParam @ApiParam(value = "当前处理的该条记录的id") Integer id,
                                       @RequestParam @ApiParam(value = "当前管理管理员的id") Integer userId,
                                       @RequestParam @ApiParam(value = "管理员对用户的操作(1-审核通过，2-审核未通过)",required = true) Integer status,
                                       @RequestParam @ApiParam(value = "管理员的反馈信息") String comment){

        applyService.updateUserStatus(id,userId,status,comment);
        return CommonResult.success("审核成功");

    }
    @ApiOperation("审核用户的通行证申请信息")
    @RequestMapping(value = "/checkLicense",method = RequestMethod.POST)
    public CommonResult<String> checkLicenseInfo(@RequestParam @ApiParam(value = "当前处理的该条记录的id") Integer id,
                                 @RequestParam @ApiParam(value = "当前管理员的id") Integer userId,
                                 @RequestParam @ApiParam(value = "管理员对用户的操作(1-审核通过，2-审核未通过)",required = true) Integer status,
                                 @RequestParam() @ApiParam(value = "管理员的反馈信息") String comment){

        licenseApplyService.updateUserStatus(id,userId,status,comment);
        return CommonResult.success("审核成功");

    }

}
