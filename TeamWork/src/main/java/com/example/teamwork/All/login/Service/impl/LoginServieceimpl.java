package com.example.teamwork.All.login.Service.impl;

import com.example.teamwork.All.login.Entity.UserEntity;
import com.example.teamwork.All.login.Repository.LoginRepository;
import com.example.teamwork.All.login.Service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServieceimpl implements LoginService {
    @Resource
    LoginRepository loginRepository;
    @Override
    public UserEntity Login(String LoginName,String PassWord) {
        return loginRepository.FindByName(LoginName,PassWord);
    }
}
