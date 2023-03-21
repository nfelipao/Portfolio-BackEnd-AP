package com.appl.porfolio.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "skill")
public class Skills implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_skill", nullable = false)
    private Long idSkill;
    @Column(name = "nombre_skill", nullable = false)
    private String nombreSkill;
    @Column(name = "foto_skill", nullable = false)
    private String fotoSkill;
    @Column(name = "porcentaje", nullable = false)
    private Long porcentaje;

    public Skills() {
    }

    public Skills(Long idSkill, String nombreSkill, String fotoSkill, Long porcentaje) {
        this.idSkill = idSkill;
        this.nombreSkill = nombreSkill;
        this.fotoSkill = fotoSkill;
        this.porcentaje = porcentaje;
    }

    public Long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(Long idSkill) {
        this.idSkill = idSkill;
    }

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public String getFotoSkill() {
        return fotoSkill;
    }

    public void setFotoSkill(String fotoSkill) {
        this.fotoSkill = fotoSkill;
    }

    public Long getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Long porcentaje) {
        this.porcentaje = porcentaje;
    }
}
