package com.vendapp.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vendapp.model.Rutacliente;

@RepositoryRestResource(collectionResourceRel = "rutasc", path = "rutasc", exported = false)
public interface RutasClientesRepository extends BaseRepository<Rutacliente, Integer> {

}
