package com.clinicaMed.api.Dto;

public record DadosAtualizacaoMedico(
        Long id,
        String nome,
        String telefone,
        DadosEnderecoDTO endereco
) {
}
