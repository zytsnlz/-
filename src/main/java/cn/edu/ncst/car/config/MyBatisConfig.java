package cn.edu.ncst.car.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan({"cn.edu.ncst.car.mbg.mapper","cn.edu.ncst.car.dao"})
public class MyBatisConfig {
}
