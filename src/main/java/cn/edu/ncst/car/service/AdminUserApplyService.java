package cn.edu.ncst.car.service;

import cn.edu.ncst.car.mbg.model.AccountIdentifyinfo;

import java.util.List;

public interface AdminUserApplyService {


    /**
     * 查询所有的用户申请
     * @return
     */
    List<AccountIdentifyinfo> selectAll( );

    /**
     * 根据用户姓名查询该用户的实名认证申请信息
     * @param name
     * @return
     */
    List<AccountIdentifyinfo> selectByName(String name);

    /**
     * 查询所有所有个人用户认证申请
     * @return
     */
    List<AccountIdentifyinfo> selectPersonApply();

    /**
     * 查询所有企业用户认证申请
     * @return
     */
    List<AccountIdentifyinfo> selectCompanyApply();



}
