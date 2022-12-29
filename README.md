# 图书管理系统LMS

[TOC]

## 简介

- GitHub地址：https://github.com/Whale-lyi/LMS

- java使用jdk1.8版本，数据库使用mysql8
- 前端使用HTML5 + css + js + thymeleaf
- 后端使用springboot + mybatis
- 该系统分为两类用户：普通用户、管理员用户
  - 管理员用户使用admin账号登录
  - 管理员拥有普通用户不具有的权限：修改书籍信息，查看全部用户借阅记录、添加新的图书
## 功能
### 登录、注册

<img src="https://whale-picture.oss-cn-hangzhou.aliyuncs.com/img/image-20220524134651346.png" alt="image-20220524134651346"  />

<img src="https://whale-picture.oss-cn-hangzhou.aliyuncs.com/img/image-20220524134711702.png" alt="image-20220524134711702" style="zoom:80%;" />

### 管理员用户：

#### 首页

- 显示当前用户的用户名

- 显示所有图书及库存，实现了分页功能以及关键字查询功能（可通过书名及作者查询）

<img src="https://whale-picture.oss-cn-hangzhou.aliyuncs.com/img/image-20220524134750004.png" alt="image-20220524134750004" style="zoom:80%;" />

<img src="https://whale-picture.oss-cn-hangzhou.aliyuncs.com/img/image-20220524135230828.png" alt="image-20220524135230828" style="zoom:80%;" />

##### 查看图书信息

- 点击书名即可进入

<img src="https://whale-picture.oss-cn-hangzhou.aliyuncs.com/img/image-20220524134900728.png" alt="image-20220524134900728" style="zoom:80%;" />

##### 借阅

- 点击借阅即可，库存数量减一

<img src="https://whale-picture.oss-cn-hangzhou.aliyuncs.com/img/image-20220524135504282.png" alt="image-20220524135504282" style="zoom:80%;" />

##### 修改（仅管理员账户可用）

![image-20220524135612794](https://whale-picture.oss-cn-hangzhou.aliyuncs.com/img/image-20220524135612794.png)

#### 查看借阅中图书

- 点击左侧我的借阅中图书

![image-20220524135748144](https://whale-picture.oss-cn-hangzhou.aliyuncs.com/img/image-20220524135748144.png)

##### 归还

![image-20220524135819793](https://whale-picture.oss-cn-hangzhou.aliyuncs.com/img/image-20220524135819793.png)

#### 查看历史借出记录

- 点击左侧我的借出记录

![image-20220524140024726](https://whale-picture.oss-cn-hangzhou.aliyuncs.com/img/image-20220524140024726.png)

#### 查看历史归还记录

- 点击左侧我的归还记录，可以看到每个归还记录所对应的借出记录，方便在借出记录中查找

![image-20220524140041450](https://whale-picture.oss-cn-hangzhou.aliyuncs.com/img/image-20220524140041450.png)

#### 查看全部用户借阅记录（仅管理员账户可用）

- 点击左侧查看全部用户借阅记录
- 实现了分页功能
- 可以看到记录对应的用户、时间、类型（归还/借出）

![image-20220524140139914](https://whale-picture.oss-cn-hangzhou.aliyuncs.com/img/image-20220524140139914.png)

#### 添加新的图书（仅管理员账户可用）

![image-20220524140516183](https://whale-picture.oss-cn-hangzhou.aliyuncs.com/img/image-20220524140516183.png)

#### 注销

- 点击左侧注销，退出登录回到登录页

![image-20220524140626098](https://whale-picture.oss-cn-hangzhou.aliyuncs.com/img/image-20220524140626098.png)

### 普通用户：

- 拥有管理员账户的部分功能：
  - 借阅、归还
  - 查看图书信息
  - 查看我的正在借阅图书
  - 我的历史借出记录
  - 我的历史归还记录
  - 注销

![image-20220524140647449](https://whale-picture.oss-cn-hangzhou.aliyuncs.com/img/image-20220524140647449.png)
