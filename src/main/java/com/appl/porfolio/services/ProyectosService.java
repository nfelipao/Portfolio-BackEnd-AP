package com.appl.porfolio.services;

import com.appl.porfolio.models.Proyectos;
import com.appl.porfolio.repository.ProyectosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProyectosService {
    private final ProyectosRepository proyectosRepository;
    @Autowired
    public ProyectosService(ProyectosRepository proyectosRepository) {this.proyectosRepository = proyectosRepository;}

    public Proyectos addProyectos(Proyectos proyectos) {return proyectosRepository.save(proyectos);}
    public List<Proyectos> buscarProyectos(){
        return proyectosRepository.findAll();
    }
    public Proyectos editarProyectos(Proyectos proyectos){
        return proyectosRepository.save(proyectos);
    }
    public void borrarProyectos(Long id){
        proyectosRepository.deleteById(id);
    }
}