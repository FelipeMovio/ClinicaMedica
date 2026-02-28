package com.clinicaMed.api.Dto;

public record DadosCadastroPacienteDTO(
        String nome,

        String email,

        String telefone,

        String cpf,

        DadosEnderecoDTO endereco) {
}
