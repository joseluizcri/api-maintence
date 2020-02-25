package br.com.joseluizrosajunior.maintence.repository;

import br.com.joseluizrosajunior.maintence.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
