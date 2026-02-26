package com.clinicaMed.api.Dto;

import com.clinicaMed.api.entity.Especialidade;

public record DadosCadastroMedicoDTO(String nome, String email, String crm, Especialidade especialidade, DadosEnderecoDTO endereco) {
}
