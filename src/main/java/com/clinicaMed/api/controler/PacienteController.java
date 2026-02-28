package com.clinicaMed.api.controler;

import com.clinicaMed.api.Dto.DadosCadastroPacienteDTO;
import com.clinicaMed.api.repository.PacientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacientesRepository repository;

    public void Cadastrar(@RequestBody DadosCadastroPacienteDTO dados){
    }
}
