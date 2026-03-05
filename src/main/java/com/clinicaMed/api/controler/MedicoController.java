package com.clinicaMed.api.controler;

import com.clinicaMed.api.Dto.DadosAtualizacaoMedico;
import com.clinicaMed.api.Dto.DadosCadastroMedicoDTO;
import com.clinicaMed.api.Dto.DadosListagemMedicoDTO;
import com.clinicaMed.api.entity.Endereco;
import com.clinicaMed.api.entity.Medico;
import com.clinicaMed.api.repository.MedicoRepository;
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
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity<Void> cadastrar(@RequestBody @Valid DadosCadastroMedicoDTO dados){


        Medico medico = new Medico(null,
                dados.nome(),
                dados.email(),
                dados.telefone(),
                dados.crm(),
                dados.especialidade(),
                new Endereco(
                        dados.endereco().logradouro(),
                        dados.endereco().cep(),
                        dados.endereco().bairro(),
                        dados.endereco().numero(),
                        dados.endereco().complemento(),
                        dados.endereco().uf()
                ),
                dados.ativo()
        );

        repository.save(medico);
        return ResponseEntity.ok().build();

    }


    @GetMapping
    public ResponseEntity<Page<DadosListagemMedicoDTO>> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){

        Page<DadosListagemMedicoDTO> medicos = repository.findAllByAtivoTrue(paginacao)
                // Para cada objeto Medico retornado do banco,
                // cria um novo objeto DadosListagemMedico (DTO),
                // convertendo a entidade em um objeto próprio para resposta da API
                .map(DadosListagemMedicoDTO::new);
        return ResponseEntity.ok(medicos);
    }

    @PutMapping
    @Transactional
    public ResponseEntity <Void> atualizar(@RequestBody @Valid DadosAtualizacaoMedico dados){
        Medico medico = repository.getReferenceById(dados.id());

        medico.atualizarInformacoes(dados);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> excluir(@PathVariable Long id){

        Medico medico = repository.getReferenceById(id);
        medico.excluir();

        return ResponseEntity.ok().build();
    }
}
