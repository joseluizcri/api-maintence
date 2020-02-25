package br.com.joseluizrosajunior.maintence.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator(name = "SEQ_CIDADES", allocationSize = 1, sequenceName = "SEQ_CIDADES")
public class Cidade implements Serializable {

    @Id
    @GeneratedValue(generator = "SEQ_CIDADES", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private Estado estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
