
package com.shengfeng.user.service;

import com.shengfeng.user.bean.UserBean;


public interface UserService {
   
   long addUser();
   
   UserBean getUserByUserId();
   
}
