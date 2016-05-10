package com.vendapp.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vendapp.model.Pedido;

@RepositoryRestResource(collectionResourceRel = "pedidos", path = "pedidos", exported = false)
public interface PedidosRepository extends BaseRepository<Pedido, Integer> {

}
