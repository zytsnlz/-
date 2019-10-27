package cn.edu.ncst.car.service.impl;

import cn.edu.ncst.car.common.utils.JwtTokenUtil;
import cn.edu.ncst.car.service.GetUserNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetUserNameServiceImpl implements GetUserNameService {

    @Autowired
    JwtTokenUtil tokenUtil;

    @Override
    public String getUserName(String token) {

       String userName = tokenUtil.getUserNameFromToken(token);
       return userName;
    }
}
