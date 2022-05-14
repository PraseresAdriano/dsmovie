package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Movie;

//objeto responsável por acessar Movie no BD
public interface MovieRepository extends JpaRepository<Movie, Long> {

	
}
