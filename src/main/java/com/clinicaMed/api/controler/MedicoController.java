package com.clinicaMed.api.controler;

import com.clinicaMed.api.Dto.DadosCadastroMedicoDTO;
import com.clinicaMed.api.Dto.DadosEnderecoDTO;
import com.clinicaMed.api.entity.Endereco;
import com.clinicaMed.api.entity.Medico;
import com.clinicaMed.api.repository.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void cadastrar(@RequestBody @Valid DadosCadastroMedicoDTO dados){


        Medico medico = new Medico(null,
                dados.nome(),
                dados.email(),
                dados.telefone(),
                dados.crm(),
                dados.especialidade(),
                new Endereco(
                        dados.endereco().logradouro(),
                        dados.endereco().cep(),
                        dados.endereco().cidade(),
                        dados.endereco().numero(),
                        dados.endereco().complemento(),
                        dados.endereco().uf()
                )
        );

        repository.save(medico);
    }


    @GetMapping
    public List<Medico> listar(){

        return repository.findAll();
    }
}
