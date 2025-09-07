package com.animAi.animAi.controller;

import com.animAi.animAi.model.Anime;
import com.animAi.animAi.service.AnimeService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animes")
public class AnimeController {

    private final AnimeService service;

    public AnimeController(AnimeService service) {
        this.service = service;
    }

    // Busca todos
    @GetMapping
    public List<Anime> listar() {
        return service.listar();
    }

    // Busca um anime pelo seu ID
    @GetMapping("/{id}")
    public ResponseEntity<Anime> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    // Cadastrar um novo anime
    @PostMapping
    public ResponseEntity<Anime> criar(@Valid @RequestBody Anime anime) {
        return service.criar(anime);
    }

    // Atualizar anime existente
    @PutMapping("/{id}")
    public ResponseEntity<Anime> atualizar(@PathVariable Long id, @Valid @RequestBody Anime anime) {
        return service.atualizar(id, anime);
    }
}
