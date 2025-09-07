package com.animAi.animAi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Entity
@Data
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do anime é obrigatório")
    private String nome;

    private String genero;

    @Min(value = 1, message = "O número de episódios deve ser pelo menos 1")
    private int episodios;
}
