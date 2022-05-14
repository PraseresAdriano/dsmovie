package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Score;
import com.devsuperior.dsmovie.entities.ScorePK;

//objeto responsável por acessar Movie no BD
public interface ScoreRepository extends JpaRepository<Score, ScorePK> {


}
