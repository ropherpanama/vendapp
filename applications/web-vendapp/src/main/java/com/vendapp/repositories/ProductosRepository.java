package com.vendapp.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vendapp.model.Producto;

@RepositoryRestResource(collectionResourceRel = "productos", path = "productos")
public interface ProductosRepository extends BaseRepository<Producto, Integer> {

}