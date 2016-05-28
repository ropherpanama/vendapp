package com.vendapp.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vendapp.model.DetalleFactura;

@RepositoryRestResource(collectionResourceRel = "detallesf", path = "detallesf")
public interface DetalleFacturaRepository extends BaseRepository<DetalleFactura, Integer> {

}

