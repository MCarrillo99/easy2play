package com.easy2play.controllers;

import com.easy2play.DTO.ParamRequest;
import com.easy2play.DTO.TeamDTO;
import com.easy2play.entities.Team;
import com.easy2play.entities.TeamBuild;
import com.easy2play.services.TeamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private TeamService ts;

    private static final Logger log = LoggerFactory.getLogger(TeamController.class);

    @PostMapping("/crea_team")
    public ResponseEntity<Team> creaTeam (@RequestBody TeamDTO teamDTO){
        return ts.createNewTeam(teamDTO);
    }

    @PutMapping("/{id}/coordinate")
    public ResponseEntity<?> coordinate(@PathVariable Long id, @RequestParam double lati, @RequestParam double longi) {
        Team team = ts.addCoordinate(id, lati, longi);
        return ResponseEntity.ok(team);
    }


    @GetMapping("/compatibilità")
    public ResponseEntity<?> findTeam(@RequestBody ParamRequest pr){
        log.info("oggetto post: " + pr);
        List<Team> teams = ts.findCompatibili(pr.getLongitude(), pr.getLatitude(), pr.getRaggio());
        return ResponseEntity.ok(teams);
    }


}
