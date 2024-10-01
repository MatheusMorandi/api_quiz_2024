package application.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import application.model.Categoria;
import application.record.CategoriaDTO;
import application.repository.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepo;

    public Iterable<Categoria> findAll(){

        return categoriaRepo.findAll();

    }

    public CategoriaDTO insert(CategoriaDTO categoria){

        Categoria nova = categoriaRepo.save(new Categoria(categoria));

        return new CategoriaDTO(nova);

    } 
    
}
