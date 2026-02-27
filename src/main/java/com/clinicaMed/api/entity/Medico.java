package com.clinicaMed.api.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "medicos")
@EqualsAndHashCode(of = "id")
public class Medico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    // @Embedded:
    // Incorpora os campos de Endereco diretamente na tabela "medico".
    // NÃO cria uma nova tabela.
    // Os atributos de Endereco viram colunas da tabela medico.
    @Embedded
    private Endereco endereco;
}
