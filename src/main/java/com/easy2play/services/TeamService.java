package com.easy2play.services;

import com.easy2play.DTO.ParamRequest;
import com.easy2play.DTO.TeamDTO;
import com.easy2play.controllers.TeamController;
import com.easy2play.entities.Team;
import com.easy2play.entities.TeamBuild;
import com.easy2play.repo.TeamBuildRepo;
import com.easy2play.repo.TeamRepo;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    private TeamRepo teamRepo;

    @Autowired
    private TeamBuildRepo teamBuildRepo;

    @Autowired
    private ModelMapper md;

    private static final Logger log = LoggerFactory.getLogger(TeamService.class);

    public ResponseEntity<Team> createNewTeam(TeamDTO teamDTO) {
        Team newMedico= md.map(teamDTO, Team.class);
        teamRepo.saveAndFlush(newMedico);
        return new ResponseEntity<Team>(newMedico, HttpStatus.CREATED);
    }

    public ResponseEntity<?> trovaTramiteId(Long id) {
        if (teamRepo.existsById(id)){
            return new ResponseEntity<>(teamRepo.findById(id), HttpStatus.OK);
        }
        else  return new ResponseEntity<>("TEAM NON TROVATO", HttpStatus.BAD_REQUEST);
    }

    public Team aggiornaTeam(Long idTeam, TeamDTO teamDTO) {
        Team newTeam= md.map(teamDTO, Team.class);
        if(teamRepo.existsById(idTeam)) {
            newTeam.setIdTeam(idTeam);
            Team teamToSave= teamRepo.findById(idTeam).get();
            teamToSave = newTeam;
            return teamRepo.saveAndFlush(newTeam);
        }
        else
            return new Team();
    }

    public Team addCoordinate(Long idTeam, double lati, double longi){
        Team team = teamRepo.findById(idTeam).get();
        team.setLati(lati);
        team.setLongi(longi);
        teamRepo.saveAndFlush(team);
        return team;
    }

    public List<Team> findCompatibili(double longi, double lati, double raggio){
        return teamRepo.findByLatiAndLongi(longi, lati, raggio);
    }

}
