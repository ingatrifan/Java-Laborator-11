package com.example3.demo.controllers;

import com.example3.demo.models.Player;
import com.example3.demo.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/players")
public class PlayersController {
    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping(path = "/")
    public @ResponseBody Iterable<Player> getAll(){
        return playerRepository.findAll();
    }
    @PostMapping("/save")
    public @ResponseBody Player save(@RequestBody Player player){
        playerRepository.save(player);
        return player;
    }
    @PutMapping("/edit")
    public @ResponseBody Player edit(@RequestBody Player player){
        playerRepository.save(player);
        return player;
    }
    @DeleteMapping("/delete/{id}")
    public @ResponseBody String delete( @PathVariable Integer id){
        playerRepository.deleteById(id);
        return "Deleted";
    }

}
