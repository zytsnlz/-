package cn.edu.ncst.car.service.impl;

import cn.edu.ncst.car.service.GetCurrentUserNameService;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class GetCurrentUserNameServiceImpl implements GetCurrentUserNameService {


    @Override
    public String getCurrentUserName() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userName = null;
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            userName = authentication.getName();
        }
        return userName;
    }

}
