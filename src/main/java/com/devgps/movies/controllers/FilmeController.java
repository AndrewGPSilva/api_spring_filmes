package com.devgps.movies.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devgps.movies.entities.Filme;
import com.devgps.movies.repositories.FilmeRepository;

@RestController
@RequestMapping
public class FilmeController {

    @Autowired
    private FilmeRepository filmeRepository;

    @GetMapping("/filmes")
    public List<Filme> getAll() {
        return filmeRepository.findAll();
    }

    @PostMapping("/filmes")
    public Filme create(@RequestBody Filme filme) {
        return filmeRepository.save(filme);
    }

    @GetMapping("/filmes/{id}")
    public Filme show(@PathVariable Long id) {
        return filmeRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/filmes/{id}")
    public void delete(@PathVariable Long id) {
        filmeRepository.deleteById(id);
    }

    @PutMapping("/filmes/{id}")
    public Filme update(@PathVariable Long id, @RequestBody Filme filmeAtualizado) {
        Optional<Filme> filmeExistente = filmeRepository.findById(id);

        if(filmeExistente.isPresent()) {
            Filme filme = filmeExistente.get();

            filme.setTitulo(filmeAtualizado.getTitulo());
            filme.setCategoria(filmeAtualizado.getCategoria());
            filme.setSinopse(filmeAtualizado.getSinopse());
            filme.setFaixa(filmeAtualizado.getFaixa());
            filme.setImagem(filmeAtualizado.getImagem());
            filme.setStreaming(filmeAtualizado.getStreaming());

            filmeRepository.save(filme);

            return filme;
        } else {
            return null;
        }
    }
}
