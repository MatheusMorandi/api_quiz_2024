package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Categoria;
import application.record.CategoriaDTO;
import application.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;
 
    @GetMapping
    public Iterable<CategoriaDTO> findAll() {

        return categoriaService.findAll();

    }
 
    @PostMapping
    public CategoriaDTO insert(@RequestBody CategoriaDTO categoria) {

        return categoriaService.insert(categoria);

    }
}
