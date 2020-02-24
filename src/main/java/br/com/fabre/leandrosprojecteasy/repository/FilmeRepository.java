package br.com.fabre.leandrosprojecteasy.repository;

import br.com.fabre.leandrosprojecteasy.dao.Filme;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/***
 * Classe responsável para buscar as informações da tabela vinculando com a classe
 */

public interface FilmeRepository extends CrudRepository<Filme, Integer> {
    List<Filme> findAll();
}
