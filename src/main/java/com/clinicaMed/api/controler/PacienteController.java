package com.clinicaMed.api.controler;

import com.clinicaMed.api.Dto.DadosAtualizacaoPacientes;
import com.clinicaMed.api.Dto.DadosCadastroPacienteDTO;
import com.clinicaMed.api.Dto.DadosListagemPacienteDTO;
import com.clinicaMed.api.entity.Endereco;
import com.clinicaMed.api.entity.Paciente;
import com.clinicaMed.api.repository.PacienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Void> Cadastrar(@RequestBody @Valid DadosCadastroPacienteDTO dados){

        Paciente paciente = new Paciente(null,
                dados.nome(),
                dados.email(),
                dados.telefone(),
                dados.cpf(),
                new Endereco(
                        dados.endereco().logradouro(),
                        dados.endereco().cep(),
                        dados.endereco().bairro(),
                        dados.endereco().numero(),
                        dados.endereco().complemento(),
                        dados.endereco().uf()
                )
                );
        repository.save(paciente);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity< Page<DadosListagemPacienteDTO> >listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){
         Page<DadosListagemPacienteDTO> pacientes = repository.findAll(paginacao)
                .map(DadosListagemPacienteDTO::new);
         return ResponseEntity.ok(pacientes);
    }

    @PutMapping
    @Transactional
    public ResponseEntity<Void> atualizar(@RequestBody @Valid DadosAtualizacaoPacientes dados){
        Paciente paciente = repository.getReferenceById(dados.id());
                paciente.atualizarInformacoes(dados);

        return ResponseEntity.noContent().build();
    }
}
