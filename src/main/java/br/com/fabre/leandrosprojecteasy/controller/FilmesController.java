package br.com.fabre.leandrosprojecteasy.controller;

import br.com.fabre.leandrosprojecteasy.dao.Filme;
import br.com.fabre.leandrosprojecteasy.service.FilmesService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FilmesController {

    @Autowired
    private FilmesService filmesService;

    @RequestMapping(value = "/listaTodosFilmes", method = RequestMethod.GET)
    public List<Filme> listaTodosFilmes() {
        return filmesService.listaFilmes(null);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Filme buscaFilme (@PathVariable Integer id) {
        return filmesService.buscaFilmePorId(id);
    }
/*
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public void atualizaFilme (@PathVariable Integer id, @RequestBody Filme filme) {}

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deletaFilme (@PathVariable Integer id) {}

    @RequestMapping(value = "/{id}/aluga", method = RequestMethod.POST)
    public boolean alugaFilme(@PathVariable Integer id) {return false;}

    @RequestMapping(value = "/{id}/devolver", method = RequestMethod.POST)
    public boolean devolverFilme(@PathVariable Integer id) {return false;}
*/
}