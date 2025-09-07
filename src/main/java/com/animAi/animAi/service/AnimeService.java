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

    // Atualizar anime existente
    public ResponseEntity<Anime> atualizar(Long id, Anime anime) {
        return repository.findById(id).map(existente -> {
            existente.setNome(anime.getNome());
            existente.setGenero(anime.getGenero());
            existente.setEpisodios(anime.getEpisodios());
            repository.save(existente);
            return ResponseEntity.ok(existente);
        }).orElse(ResponseEntity.notFound().build());
    }

    // Deletar um anime por ID
    public ResponseEntity<Void> deletar(Long id) {
        return repository.findById(id).map(existente -> {
            repository.delete(existente);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
