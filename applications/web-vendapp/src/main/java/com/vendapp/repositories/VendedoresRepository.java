package com.vendapp.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vendapp.model.Vendedor;

@RepositoryRestResource(collectionResourceRel = "vendedores", path = "vendedores")
public interface VendedoresRepository extends BaseRepository<Vendedor, Integer> {

}
