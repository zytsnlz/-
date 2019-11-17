package cn.edu.ncst.car.service.impl;

import cn.edu.ncst.car.mbg.model.AuthUser;
import cn.edu.ncst.car.mbg.model.AuthUserExample;
import cn.edu.ncst.car.service.GetCurrentUserNameService;
import cn.edu.ncst.car.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class GetCurrentUserNameServiceImpl implements GetCurrentUserNameService {

    @Autowired
    UmsAdminService umsAdminService;
    @Override
    public String getCurrentUserName() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userName = null;
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            userName = authentication.getName();
        }
        return userName;
    }

    public Integer getIdByUserName(String uerName){
        AuthUserExample example = new AuthUserExample();
        example.createCriteria().andUsernameEqualTo(uerName);
        AuthUser authUser = umsAdminService.getAdminByUsername(uerName);
        return authUser.getId();
    }

}
