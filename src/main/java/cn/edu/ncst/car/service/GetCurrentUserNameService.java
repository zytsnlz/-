package cn.edu.ncst.car.service;

public interface GetCurrentUserNameService {

    /**
     *spring-security获取当前登录的用户名
     * @return
     */
    String getCurrentUserName();
}
