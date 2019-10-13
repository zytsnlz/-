package cn.edu.ncst.car.service;

import cn.edu.ncst.car.mbg.model.AuthPermission;
import cn.edu.ncst.car.mbg.model.AuthUser;

import java.util.List;

/**
 * 后台管理员Service
 */
public interface UmsAdminService {
    /**
     * 根据用户名获取后台管理员
     */
    AuthUser getAdminByUsername(String username);

    /**
     * 注册功能
     */
    AuthUser register(AuthUser umsAdminParam);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<AuthPermission> getPermissionList(Long adminId);
}
