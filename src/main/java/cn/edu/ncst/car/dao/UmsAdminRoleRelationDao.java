package cn.edu.ncst.car.dao;


import cn.edu.ncst.car.mbg.model.AuthPermission;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 后台用户与角色管理自定义Dao
 * Created by macro on 2018/10/8.
 */
@Repository
public interface UmsAdminRoleRelationDao {

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<AuthPermission> getPermissionList(@Param("adminId") Long adminId);
}
