package com.animAi.animAi.controller;

import com.animAi.animAi.model.Anime;
import com.animAi.animAi.service.AnimeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(
        name = "Animes",
        description = "Operações para gerenciamento de animes favoritos"
)
@RestController
@RequestMapping("/animes")
public class AnimeController {

    private final AnimeService service;

    public AnimeController(AnimeService service) {
        this.service = service;
    }

    @Operation(
            summary = "Listar animes",
            description = "Retorna todos os animes cadastrados."
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "Lista retornada com sucesso"
            )
    })
    @GetMapping
    public List<Anime> listar() {
        return service.listar();
    }

    @Operation(
            summary = "Buscar anime por ID",
            description = "Retorna um anime específico a partir do ID informado."
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "Anime encontrado"
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Anime não encontrado"
            )
    })
    @GetMapping("/{id}")
    public ResponseEntity<Anime> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @Operation(
            summary = "Cadastrar anime",
            description = "Cria um novo anime no banco de dados."
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "201",
                    description = "Anime criado com sucesso"
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Dados inválidos"
            )
    })
    @PostMapping
    public ResponseEntity<Anime> criar(
            @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Dados do anime que será cadastrado",
                    required = true,
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Anime.class),
                            examples = @ExampleObject(
                                    name = "Exemplo de cadastro",
                                    value = """
                                            {
                                              "nome": "Naruto",
                                              "genero": "Shounen",
                                              "episodios": 220
                                            }
                                            """
                            )
                    )
            )
            @Valid @RequestBody Anime anime
    ) {
        return service.criar(anime);
    }

    @Operation(
            summary = "Atualizar anime",
            description = "Atualiza as informações de um anime existente."
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "Anime atualizado com sucesso"
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Anime não encontrado"
            )
    })
    @PutMapping("/{id}")
    public ResponseEntity<Anime> atualizar(
            @PathVariable Long id,
            @Valid @RequestBody Anime anime
    ) {
        return service.atualizar(id, anime);
    }

    @Operation(
            summary = "Excluir anime",
            description = "Remove um anime do banco de dados."
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "204",
                    description = "Anime removido com sucesso"
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Anime não encontrado"
            )
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return service.deletar(id);
    }
}