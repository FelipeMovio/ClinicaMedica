package com.clinicaMed.api.Dto;

public record DadosAtualizacaoPacientes(
        Long id,
        String nome,
        String telefone,
        DadosEnderecoDTO endereco
) {
}
