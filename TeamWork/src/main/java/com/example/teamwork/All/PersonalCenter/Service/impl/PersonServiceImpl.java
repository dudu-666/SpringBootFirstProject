package com.example.teamwork.All.PersonalCenter.Service.impl;

import com.example.teamwork.All.PersonalCenter.Repository.UserListRepository;
import com.example.teamwork.All.PersonalCenter.Service.PersonService;
import com.example.teamwork.All.login.Entity.UserEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Resource
    UserListRepository userListRepository;

    @Override
    public List GetALLUser() {
        return userListRepository.findAll();
    }

    /*public String UpdateUser() {

    }*/
}