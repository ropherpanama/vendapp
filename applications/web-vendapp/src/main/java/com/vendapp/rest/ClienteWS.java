package com.vendapp.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vendapp.modelo.Cliente;

@Path("/clientes")
public class ClienteWS {
	@GET
	@Path("list")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Cliente> getAll() {
		try {
			List<Cliente> l = new ArrayList<Cliente>();
			Cliente c = new Cliente();
			c.setIdCliente(1);
			c.setNombreCliente("Algieri Caballero");
			c.setDireccion("Las Acacias");

			Cliente c1 = new Cliente();
			c.setIdCliente(1);
			c.setNombreCliente("Algieri Caballero");
			c.setDireccion("Las Acacias");

			l.add(c);
			l.add(c1);
			return l;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
