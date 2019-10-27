package cn.edu.ncst.car.service;

public interface UpdateUserRoleByUid {
    /**
     * 根据用户的id查找用户的角色并更新
     * @param userId
     * @param userType
     */
    void updateUserRoleByUid(Integer userId,Integer userType);

    /**
     * 根据用户的id查询用户的角色(个人用户还是企业用户)
     * @param uid
     * @return
     */
    int selectUserRoleByUid(Integer uid);
}
