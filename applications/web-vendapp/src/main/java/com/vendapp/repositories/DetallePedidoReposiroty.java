package com.vendapp.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vendapp.model.DetallePedido;

@RepositoryRestResource(collectionResourceRel = "detallesp", path = "detallesp", exported = false)
public interface DetallePedidoReposiroty extends BaseRepository<DetallePedido, Integer> {

}
