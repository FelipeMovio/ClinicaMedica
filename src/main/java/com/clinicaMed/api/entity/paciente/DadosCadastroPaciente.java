package com.clinicaMed.api.entity.paciente;

import com.clinicaMed.api.entity.endereco.DadosEndereco;

public record DadosCadastroPaciente(String nome,
                                    String email,
                                    String telefone,
                                    String cpf,
                                    DadosEndereco endereco) {
}
