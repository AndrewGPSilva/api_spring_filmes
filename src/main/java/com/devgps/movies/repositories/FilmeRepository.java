package com.devgps.movies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devgps.movies.entities.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
    
}