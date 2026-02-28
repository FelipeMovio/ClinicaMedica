package com.clinicaMed.api.Dto;

import com.clinicaMed.api.entity.Especialidade;
import com.clinicaMed.api.entity.Medico;

public record DadosListagemMedico(
        String nome,
        String email,
        String crm,
        Especialidade especialidade

) {
    public DadosListagemMedico(Medico medico){
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
