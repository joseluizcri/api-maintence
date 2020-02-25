package br.com.joseluizrosajunior.maintence.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator(name = "SEQ_EMAILS", allocationSize = 1, sequenceName = "SEQ_EMAILS")
public class Email implements Serializable {

    @Id
    @GeneratedValue(generator = "SEQ_EMAILS", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String descricao;
    private String email;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
