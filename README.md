# Software-Test
This warehouse is used to store software test source code,test system:dormitory management system.

这是我的第一次软件测试课程设计作业，本仓库存放的为校园宿舍管理系统源码。

## 1.软件架构

校园宿舍管理系统采用Servlet，JSP，Mysql8.0开发，界面采用了bootstrap，简洁大方。拥有系统管理，宿舍管理员管理，学生管理，宿舍楼管理，缺勤记录等功能。本系统只用于管理学生宿舍数据信息，没有特别复杂的功能，只是数据的增删改查，方便学校管理学生。

## 2.运行环境

* 操作系统版本：Windows 10
* 数据库：Mysql 8.0
* 服务器：Tomcat 9.0
* 浏览器：Microsoft edge
* 使用软件：Jetbrains IDEA2021.2

## 3.功能简介

* 登录
* * 系统管理员（admin账户）
  * 宿舍管理员（manager账户）
  * 学生（student账户）
* admin账户
* * 宿舍管理员管理
  * 学生管理
  * 宿舍楼管理
  * 缺勤记录
  * 修改密码
  * 退出系统
* manager账户
* * 学生查看
  * 缺勤记录
  * 修改密码
  * 退出系统
* student账户
* * 缺勤记录
  * 修改密码
  * 退出系统

## 4.安装教程

1.导入数据库文件db_dorm.sql文件到Mysql

2.修改dorm.properties配置文件，将数据库用户名，密码，端口号修改为自己版本。

3.启动，链接数据库。

4.项目发布到Tomcat中，启动Tomcat（这里tomcat换成自己的版本）

5.登录账号可查看数据库表。

