package com.appl.porfolio.services;

import com.appl.porfolio.models.Educacion;
import com.appl.porfolio.repository.EducacionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EducacionService {
    private final EducacionRepository educacionRepository;

    public EducacionService(EducacionRepository educacionRepository) {
        this.educacionRepository = educacionRepository;
    }

    public Educacion addEducacion(Educacion educacion){
        return educacionRepository.save(educacion);
    }
    public List<Educacion> buscarEducaciones(){
        return educacionRepository.findAll();
    }
    public Educacion editarEducacion(Educacion educacion){
        return educacionRepository.save(educacion);
    }
    public void borrarEducacion(Long id){
        educacionRepository.deleteById(id);
    }
}
