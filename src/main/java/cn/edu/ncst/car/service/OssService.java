package cn.edu.ncst.car.service;

import cn.edu.ncst.car.dto.OssCallbackResult;
import cn.edu.ncst.car.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * oss上传管理Service
 */
public interface OssService {

    OssPolicyResult policy();

    OssCallbackResult callback(HttpServletRequest request);
}
