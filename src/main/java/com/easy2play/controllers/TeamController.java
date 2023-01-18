package com.easy2play.controllers;

import com.easy2play.DTO.ParamRequest;
import com.easy2play.DTO.TeamDTO;
import com.easy2play.entities.Team;
import com.easy2play.entities.TeamBuild;
import com.easy2play.services.TeamService;
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

    @PostMapping("/crea_team")
    public ResponseEntity<Team> creaTeam (@RequestBody TeamDTO teamDTO){
        return ts.createNewTeam(teamDTO);
    }

    @PutMapping("/{id}/coordinate")
    public void coordinate(@PathVariable Long id, @RequestParam double lati, @RequestParam double longi) {
        ts.addCoordinate(id, lati, longi);
    }

    @PostMapping("/getAvailableMatch")
    public ResponseEntity<?> getAvailableMatch(@RequestBody ParamRequest paramRequest){
        List<TeamBuild> tbList = ts.getAvailableMatch(paramRequest);
        return ResponseEntity.ok(tbList);
    }

    @GetMapping("/compatibilità")
    public List<Team> findTeam(@RequestBody TeamDTO teamDTO, @RequestParam double raggio){
        return ts.findCompatibili((teamDTO.getLati()+raggio), (teamDTO.getLati()-raggio), (teamDTO.getLongi()+raggio),
                                  (teamDTO.getLongi()-raggio));
    }


}
