package com.example.teamwork.All.PersonalCenter.Repository;

import com.example.teamwork.All.login.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserListRepository extends JpaRepository<UserEntity,Long> {

}
