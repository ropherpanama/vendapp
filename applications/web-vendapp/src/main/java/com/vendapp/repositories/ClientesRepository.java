package com.vendapp.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vendapp.model.Cliente;

@RepositoryRestResource(collectionResourceRel = "clientes", path = "clientes", exported = false)
public interface ClientesRepository extends BaseRepository<Cliente, Integer> {

}
