package com.clinicaMed.api.Dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPacientes(
        @NotNull
        Long id,
        String nome,

        String telefone,

        @Valid
        DadosEnderecoDTO endereco
) {
}
