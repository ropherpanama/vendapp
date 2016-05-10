package com.vendapp.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vendapp.model.ProductosFactura;

@RepositoryRestResource(collectionResourceRel = "prods_factura", path = "prods_factura")
public interface ProductosFacturaRepository extends BaseRepository<ProductosFactura, Integer> {

}

