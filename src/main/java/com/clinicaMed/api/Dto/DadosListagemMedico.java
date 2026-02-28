package com.clinicaMed.api.Dto;

import com.clinicaMed.api.entity.Especialidade;

public record DadosListagemMedico(
        String nome,
        String email,
        String crm,
        Especialidade especialidade

) {}
