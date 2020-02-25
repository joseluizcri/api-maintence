package br.com.joseluizrosajunior.maintence.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator(name = "SEQ_ESTADOS", allocationSize = 1, sequenceName = "SEQ_ESTADOS")
public class Estado implements Serializable {

    @Id
    @GeneratedValue(generator = "SEQ_ESTADOS", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private String sigla;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
