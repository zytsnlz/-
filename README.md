# 交警通行证网上申办系统

需求文档在 “文档” 分支

项目依赖在pom.xml文件中，导入idea会自动构建

启动项目需要在本地运行[redis](https://redis.io/),下载windows版本解压缩打开redis-server.exe

## 开发工具

- idea，版本任意
- mysql 
- **jdk8**（必须是这个版本）
- redis

## 结构说明

项目使用了mybatis逆行工程，可以将数据库生成mybatis需要的sql，放在resource下的cn.edu.cncst.car.mbg.mapper下面，这里的文件不要修改，如果修改了数据库结构，运行java下的mbg中Generator文件即可，对于需要自定义sql的操作在resource下的mapper中写自己的sql

返回json数据建议使用common中的api下的类，统一数据格式