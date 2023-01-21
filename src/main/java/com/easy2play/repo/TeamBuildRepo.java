package com.easy2play.repo;

import com.easy2play.entities.TeamBuild;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamBuildRepo extends JpaRepository<TeamBuild, Integer> {
    @Query(value = "SELECT * FROM easy2play.team WHERE ST_Distance_Sphere(POINT(longi, lati), POINT(?1, ?2) ) <= ?3*1000;",
            nativeQuery = true)
    List<TeamBuild> findByParams(Double longi, Double lati, Double raggio);
}
