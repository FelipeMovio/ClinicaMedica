package com.clinicaMed.api.controler;

import com.clinicaMed.api.Dto.DadosCadastroPacienteDTO;
import com.clinicaMed.api.Dto.DadosListagemPacienteDTO;
import com.clinicaMed.api.entity.Endereco;
import com.clinicaMed.api.entity.Paciente;
import com.clinicaMed.api.repository.PacienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void Cadastrar(@RequestBody @Valid DadosCadastroPacienteDTO dados){

        Paciente paciente = new Paciente(null,
                dados.nome(),
                dados.email(),
                dados.telefone(),
                dados.cpf(),
                new Endereco(
                        dados.endereco().logradouro(),
                        dados.endereco().cep(),
                        dados.endereco().cidade(),
                        dados.endereco().numero(),
                        dados.endereco().complemento(),
                        dados.endereco().uf()
                )
                );
        repository.save(paciente);
    }

    @GetMapping
    public List<DadosListagemPacienteDTO> listar(){
        return repository.findAll()
                .stream()
                .map(DadosListagemPacienteDTO::new)
                .toList();
    }
}
