package com.example3.demo.repository;

import com.example3.demo.models.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player,Integer> {
}
