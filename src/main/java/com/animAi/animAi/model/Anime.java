package com.animAi.animAi.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
@Schema(description = "Representa um anime cadastrado no sistema")
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(
            description = "Identificador único do anime",
            example = "1",
            accessMode = Schema.AccessMode.READ_ONLY
    )
    private Long id;

    @NotBlank(message = "O nome do anime é obrigatório")
    @Schema(
            description = "Nome do anime",
            example = "Naruto"
    )
    private String nome;

    @Schema(
            description = "Gênero do anime",
            example = "Shounen"
    )
    private String genero;

    @Min(value = 1, message = "O número de episódios deve ser pelo menos 1")
    @Schema(
            description = "Quantidade de episódios",
            example = "220"
    )
    private int episodios;
}