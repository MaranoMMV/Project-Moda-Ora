package io.github.maranommv.cadastro.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(nullable = false, length = 150)
    @NotEmpty(message = "O Campo Nome e obrigatorio")
    private String nome;

    @Column(nullable = false, length = 100)
    @NotNull(message = "Campo Email e obrigatorio.")
    private String email;

    @Column(nullable = false, length = 20)
    @NotEmpty(message = "O Campo telefone é obrigatório.")
    private String telefone;
}
