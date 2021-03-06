package cn.edu.ncst.car.controller;

import cn.edu.ncst.car.dto.UmsAdminLoginParam;
import cn.edu.ncst.car.mbg.model.AuthPermission;
import cn.edu.ncst.car.mbg.model.AuthUser;
import cn.edu.ncst.car.mbg.model.AuthUserExample;
import cn.edu.ncst.car.service.GetCurrentUserNameService;
import cn.edu.ncst.car.service.UmsAdminService;
import cn.edu.ncst.car.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 后台用户管理
 * Created by macro on 2018/4/26.
 */
@Controller
@Api(tags = "UmsAdminController", description = "后台用户管理")
@RequestMapping("/admin")
public class UmsAdminController {
    @Autowired
    private UmsAdminService adminService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Autowired
    private GetCurrentUserNameService userNameService;

    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<AuthUser> register(@RequestBody AuthUser umsAdminParam, BindingResult result) {
        AuthUser umsAdmin = adminService.register(umsAdminParam);
        if (umsAdmin == null) {
            CommonResult.failed("用户有重名，需重新设置用户名");
        }
        return CommonResult.success(umsAdmin);
    }

    @ApiOperation(value = "登录以后返回token")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestBody UmsAdminLoginParam umsAdminLoginParam, BindingResult result) {


        String token = adminService.login(umsAdminLoginParam.getUsername(), umsAdminLoginParam.getPassword());
        String userName = userNameService.getCurrentUserName();
        AuthUserExample example = new AuthUserExample();
        example.createCriteria().andUsernameEqualTo(userName);
        AuthUser authUser = adminService.getAdminByUsername(userName);
        int userId = authUser.getId();

        if (token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, Object> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        tokenMap.put("userName",userName);
        tokenMap.put("userId",userId);
        return CommonResult.success(tokenMap);
    }

    @ApiOperation("获取用户所有权限（包括+-权限）")
    @RequestMapping(value = "/permission/{adminId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<AuthPermission>> getPermissionList(@PathVariable Integer adminId) {
        List<AuthPermission> permissionList = adminService.getPermissionList(adminId);
        return CommonResult.success(permissionList);
    }
}
