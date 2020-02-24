package br.com.fabre.leandrosprojecteasy.service;

import br.com.fabre.leandrosprojecteasy.FilmeRepository;
import br.com.fabre.leandrosprojecteasy.dao.Filme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmesService {

    @Autowired
    private FilmeRepository filmeRepository;

    public List<Filme> listaFilmes(Filme filtro) {
        return filmeRepository.findAll();
    }

    public Filme buscaFilmePorId(Integer id) {
        Optional<Filme> promessa = filmeRepository.findById(id);
        if (promessa.isPresent()) {
            return promessa.get();
        }
        return null;
    }

}
