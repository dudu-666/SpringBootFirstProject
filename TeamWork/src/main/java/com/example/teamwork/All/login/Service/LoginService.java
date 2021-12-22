package com.example.teamwork.All.login.Service;

import com.example.teamwork.All.login.Entity.UserEntity;

public interface LoginService {
    UserEntity Login(String LoginName,String PassWord);
    Boolean NewAccount(UserEntity userEntity);
    Boolean ResetPassWord(String PassWord,String LoginName);
}
