package com.clinicaMed.api.Dto;

import com.clinicaMed.api.entity.Especialidade;
import com.clinicaMed.api.entity.Medico;

public record DadosListagemMedicoDTO(
        Long id,
        String nome,
        String email,
        String crm,
        Especialidade especialidade

) {
    public DadosListagemMedicoDTO(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
