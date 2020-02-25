package br.com.joseluizrosajunior.maintence.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator(name = "SEQ_TELEFONES", allocationSize = 1, sequenceName = "SEQ_TELEFONES")
public class Telefone implements Serializable {

    @Id
    @GeneratedValue(generator = "SEQ_TELEFONES", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String descricao;
    private String ddd;
    private String numero;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
