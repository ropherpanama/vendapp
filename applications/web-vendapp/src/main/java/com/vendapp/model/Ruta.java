package com.vendapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ruta")
public class Ruta {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_ruta")
    private Integer idRuta;
    
    @Column(name = "descripcion", length = 50)
    @NotNull
    private String descripcion;
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Integer getIdRuta() {
        return this.idRuta;
    }
    
    public void setIdRuta(Integer id) {
        this.idRuta = id;
    }
}
