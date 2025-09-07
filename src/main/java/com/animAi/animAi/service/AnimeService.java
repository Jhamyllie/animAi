package com.animAi.animAi.service;

import com.animAi.animAi.model.Anime;
import com.animAi.animAi.repository.AnimeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {

    private final AnimeRepository repository;

    // Construtor para injetar o repository
    public AnimeService(AnimeRepository repository) {
        this.repository = repository;
    }

    // Listar todos
    public List<Anime> listar() {
        return repository.findAll();
    }

    // Busca um anime pelo seu ID
    public ResponseEntity<Anime> buscarPorId(Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Cadastrar um novo anime
    public ResponseEntity<Anime> criar(Anime anime) {
        Anime salvo = repository.save(anime);
        return ResponseEntity.status(201).body(salvo);
    }
}
