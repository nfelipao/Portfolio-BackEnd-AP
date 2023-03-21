package com.appl.porfolio.services;

import com.appl.porfolio.models.Experiencia;
import com.appl.porfolio.repository.ExperienciaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExperienciaService {
    private final ExperienciaRepository experienciaRepository;

    public ExperienciaService(ExperienciaRepository experienciaRepository) {this.experienciaRepository = experienciaRepository;}

    public Experiencia addExperiencia(Experiencia experiencia) {return experienciaRepository.save(experiencia);}
    public List<Experiencia> buscarExperiencia(){
        return experienciaRepository.findAll();
    }
    public Experiencia editarExperiencia(Experiencia experiencia){
        return experienciaRepository.save(experiencia);
    }
    public void borrarExperiencia(Long id){
        experienciaRepository.deleteById(id);
    }
}
