package com.example.teamwork.All.show.Repository;

import com.example.teamwork.All.show.Entity.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamListRepository extends JpaRepository<TeamEntity,Long> {

}
