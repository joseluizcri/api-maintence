package br.com.joseluizrosajunior.maintence.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@SequenceGenerator(name = "SEQ_PESSOAS", allocationSize = 1, sequenceName = "SEQ_PESSOAS")
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(generator = "SEQ_PESSOAS", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private Endereco endereco;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoa_id")
    private List<Telefone> telefones = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoa_id")
    private List<Email> emails = new ArrayList<>();

    public Long getId() {
        return this.id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }
}
