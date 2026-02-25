package com.clinicaMed.api.entity.medico;

import com.clinicaMed.api.entity.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
