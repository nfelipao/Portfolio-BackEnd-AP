package com.appl.porfolio.services;

import com.appl.porfolio.models.Skills;
import com.appl.porfolio.repository.SkillsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SkillsService {
    private final SkillsRepository skillsRepository;

    public SkillsService(SkillsRepository skillsRepository) {this.skillsRepository = skillsRepository;}
    public Skills addSkills(Skills skills) {return skillsRepository.save(skills);}
    public List<Skills> buscarSkills(){
        return skillsRepository.findAll();
    }
    public Skills editarSkills(Skills skills){
        return skillsRepository.save(skills);
    }
    public void borrarSkills(Long id){
        skillsRepository.deleteById(id);
    }
}
