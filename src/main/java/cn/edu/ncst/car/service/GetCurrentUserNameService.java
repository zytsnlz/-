package cn.edu.ncst.car.service;

public interface GetCurrentUserNameService {

    /**
     *spring-security获取当前登录的用户名
     * @return
     */
    String getCurrentUserName();

    /**
     * 根据用户名获得用户的id
     * @param uerName
     * @return
     */
    Integer getIdByUserName(String uerName);
}
