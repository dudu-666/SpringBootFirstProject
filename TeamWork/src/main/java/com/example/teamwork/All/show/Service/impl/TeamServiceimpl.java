package com.example.teamwork.All.show.Service.impl;

import com.example.teamwork.All.show.Repository.TeamListRepository;
import com.example.teamwork.All.show.Service.TeamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeamServiceimpl implements TeamService {
    @Resource
    TeamListRepository teamListRepository;

    @Override
    public List GetAllTeam() {
        return teamListRepository.findAll();
    }

}
