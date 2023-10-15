package com.devgps.movies.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
@Table(name = "filmes")
public class Filmes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String titulo;

    @NotBlank
    private String sinopse;

    @NotBlank
    private String categoria;

    @NotBlank
    private String faixa;

    @NotBlank
    private String imagem;

    @NotBlank
    private String streaming;
}
