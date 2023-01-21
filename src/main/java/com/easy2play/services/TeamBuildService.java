package com.easy2play.services;

import com.easy2play.DTO.ParamRequest;
import com.easy2play.entities.TeamBuild;
import com.easy2play.repo.TeamBuildRepo;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamBuildService {

    @Autowired
    private TeamBuildRepo teamBuildRepo;

    @Autowired
    private ModelMapper mp;

    private static final Logger log = LoggerFactory.getLogger(TeamBuildService.class);

    public List<TeamBuild> getAvailableMatch(ParamRequest pm){
        List<TeamBuild> teamBuildList = teamBuildRepo.findByParams(pm.getLatitude(), pm.getLongitude(), pm.getRaggio());
        log.info("partite che tornano: " + teamBuildList.size());
        return teamBuildList;
    }
}
