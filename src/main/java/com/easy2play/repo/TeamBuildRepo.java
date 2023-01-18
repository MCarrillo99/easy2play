package com.easy2play.repo;

import com.easy2play.entities.TeamBuild;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamBuildRepo extends JpaRepository<TeamBuild, Integer> {
    @Query(value = "select * from team_build where lati <= :latitudePlusRaggio and lati >= :latitudeMinusRaggio and longi <= :longitudePlusRaggio and longi >= :longitudeMinusRaggio", nativeQuery = true)
    List<TeamBuild> findByParams(Double latitudePlusRaggio, Double longitudePlusRaggio, Double latitudeMinusRaggio, Double longitudeMinusRaggio);
}
