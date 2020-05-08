package com.lab11.controllers;

import com.lab11.database.PlayerDAO;
import com.lab11.entities.Player;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayersController {
    @GetMapping("/players")
    public String getAll(){
        return "Hello there!";
    }

}
