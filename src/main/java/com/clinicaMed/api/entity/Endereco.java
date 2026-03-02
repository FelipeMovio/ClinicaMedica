package com.clinicaMed.api.entity;

import com.clinicaMed.api.Dto.DadosEnderecoDTO;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
// @Embeddable:
// Indica que essa classe pode ser embutida em uma entidade.
// NÃO é uma entidade.
// NÃO possui @Id.
// NÃO gera tabela própria.
// Existe apenas dentro de outra entidade.
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String uf;

    public void atualizarInformacoes(DadosEnderecoDTO dados) {

        if (dados.logradouro() != null){
            this.logradouro = dados.logradouro();
        }
        if (dados.bairro() != null){
            this.bairro = dados.bairro();
        }
        if (dados.cep() != null){
            this.cep = dados.cep();
        }
        if (dados.numero() != null){
            this.numero = dados.numero();
        }
        if (dados.complemento() != null){
            this.complemento = dados.complemento();
        }
        if (dados.uf() != null){
            this.uf = dados.uf();
        }
    }
}
