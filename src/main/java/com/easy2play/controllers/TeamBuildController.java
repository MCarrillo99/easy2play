package com.easy2play.controllers;

import com.easy2play.DTO.ParamRequest;
import com.easy2play.entities.TeamBuild;
import com.easy2play.services.TeamBuildService;
import com.easy2play.services.TeamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/team_build")
public class TeamBuildController {

    @Autowired
    private TeamBuildService tbs;

    private static final Logger log = LoggerFactory.getLogger(TeamBuildController.class);

    @PostMapping("/getAvailableMatch")
    public ResponseEntity<?> getAvailableMatch(@RequestBody ParamRequest paramRequest){
        log.info("oggetto post: " + paramRequest);
        List<TeamBuild> tbList = tbs.getAvailableMatch(paramRequest);
        return ResponseEntity.ok(tbList);
    }
}
