package br.com.fabre.leandrosprojecteasy;

import br.com.fabre.leandrosprojecteasy.dao.Filme;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FilmeRepository extends CrudRepository<Filme, Integer> {

    List<Filme> findAll();

}
