package com.easy2play.repo;

import com.easy2play.entities.TeamBuild;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamBuildRepo extends JpaRepository<TeamBuild, Integer> {
    @Query(value = "SELECT * FROM team_build WHERE (6371 * acos(cos(radians(:latitude)) * cos(radians(lati)) * cos(radians(longi) - radians(:longitude)) + sin(radians(:latitude)) * sin(radians(lati)))) <= :radius", nativeQuery = true)
    List<TeamBuild> findByParams(Double latitude, Double longitude, Double radius);
}
