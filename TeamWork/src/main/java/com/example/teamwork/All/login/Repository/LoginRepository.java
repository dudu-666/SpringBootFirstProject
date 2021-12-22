package com.example.teamwork.All.login.Repository;

import com.example.teamwork.All.login.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LoginRepository extends JpaRepository<UserEntity,Long> {
    @Query(value = "select t from UserEntity t where t.userLoginname =?1 and t.userPassword=?2")
    UserEntity FindByName(String LoginName,String PassWord);
    @Query(value = "update UserEntity as u set u.userPassword=?1 where u.userLoginname=?2")
    UserEntity ResetPassWord(String PassWord,String LoginName);
}
