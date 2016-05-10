package com.vendapp.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vendapp.model.Ruta;

@RepositoryRestResource(collectionResourceRel = "rutas", path = "rutas", exported = false)
public interface RutasRepository extends BaseRepository<Ruta, Integer> {

}
