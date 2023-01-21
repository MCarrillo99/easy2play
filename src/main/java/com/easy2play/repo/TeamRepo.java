package com.easy2play.repo;

import com.easy2play.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.web.config.SpringDataJacksonModules;

import java.util.List;

@RepositoryRestResource
public interface TeamRepo extends JpaRepository<Team, Long>, SpringDataJacksonModules {

    @Query(value = "SELECT * FROM easy2play.team WHERE ST_Distance_Sphere(POINT(longi, lati), POINT(?1, ?2) ) <= ?3*1000;",
    nativeQuery = true)
    List<Team> findByLatiAndLongi(double longi, double lati, double raggio);
}
