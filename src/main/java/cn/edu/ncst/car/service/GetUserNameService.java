package cn.edu.ncst.car.service;

public interface GetUserNameService {

    /**
     * 从token中获取当前登录用户的用户名
     * @param token
     * @return
     */
    String getUserName(String token);
}
