package com.appl.porfolio.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "experiencia")
public class Experiencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,name = "id_exp")
    private Long idExp;
    @Column(length = 250, nullable = false, name = "titulo_exp")
    private String tituloExp;
    @Column(name = "fecha_exp", nullable = false, length = 100)
    private Long fechaExp;
    @Column(name = "desc_exp", nullable = false, length = 500)
    private String descExp;
    @Column(name = "imagen_exp", nullable = false, length = 1000)
    private String imagenExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String tituloExp, Long fechaExp, String descExp, String imagenExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.fechaExp = fechaExp;
        this.descExp = descExp;
        this.imagenExp = imagenExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getTituloExp() {
        return tituloExp;
    }

    public void setTituloExp(String tituloExp) {
        this.tituloExp = tituloExp;
    }

    public Long getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(Long fechaExp) {
        this.fechaExp = fechaExp;
    }

    public String getDescExp() {
        return descExp;
    }

    public void setDescExp(String descExp) {
        this.descExp = descExp;
    }

    public String getImagenExp() {
        return imagenExp;
    }

    public void setImagenExp(String imagenExp) {
        this.imagenExp = imagenExp;
    }
}
