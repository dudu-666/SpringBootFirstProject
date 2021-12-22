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

    @Override
    public Boolean NewAccount(UserEntity userEntity) {
        try {
            loginRepository.save(userEntity);
            return true;
        }catch (Exception e){return false;}
    }

    @Override
    public Boolean ResetPassWord(String PassWord,String LoginName) {
        try {
            loginRepository.ResetPassWord(PassWord,LoginName);
            return true;
        }catch (Exception e){return false;}
    }
}
