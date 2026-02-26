package com.clinicaMed.api.controler;

import com.clinicaMed.api.Dto.DadosCadastroPacienteDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    public void Cadastrar(@RequestBody DadosCadastroPacienteDTO dados){
    }
}
