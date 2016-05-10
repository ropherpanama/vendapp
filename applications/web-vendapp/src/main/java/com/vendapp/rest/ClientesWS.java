package com.vendapp.rest;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.vendapp.commons.Response;
import com.vendapp.model.Cliente;
import com.vendapp.model.Producto;
import com.vendapp.model.ProductosFactura;
import com.vendapp.repositories.ClientesRepository;
import com.vendapp.repositories.ProductosFacturaRepository;
import com.vendapp.utils.AppUtils;

@RestController
public class ClientesWS {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ClientesRepository service;
	
	@Autowired
	private ProductosFacturaRepository anotherService;

	public ClientesRepository getService() {
		return service;
	}

	public void setService(ClientesRepository service) {
		this.service = service;
	}

	@RequestMapping(value = "/customers/all", method = RequestMethod.GET, produces = { "application/json" })
	public List<Cliente> list() {
		try {
			return Lists.newArrayList(service.findAll());
		} catch (Exception e) {
			logger.error(AppUtils.stackTraceLikeString(e));
			return null;
		}
	}

	@RequestMapping(value = "/customers/find/{id}", method = RequestMethod.GET, produces = { "application/json" })
	public Cliente findByID(@PathVariable Integer id) {
		try {
			logger.info("ID de busqueda recibido -> {}", id);
			return service.findOne(id);
		} catch (Exception e) {
			logger.error(AppUtils.stackTraceLikeString(e));
			return null;
		}
	}

	@RequestMapping(value = "/customers/delete/{id}", method = RequestMethod.GET, produces = { "application/json" })
	public Response delete(@PathVariable Integer id) {
		try {
			logger.info("ID de busqueda recibido -> {}", id);
			if (service.exists(id)) {
				service.delete(id);
				return new Response("OK", "Registro eliminado");
			} else {
				return new Response("NO", "El registro con id " + id + " no existe");
			}
		} catch (Exception e) {
			logger.error(AppUtils.stackTraceLikeString(e));
			return new Response("ERROR", AppUtils.stackTraceLikeString(e));
		}
	}

	@RequestMapping(value = "/customers/save", method = RequestMethod.POST, produces = { "application/json" }, consumes = { "application/json" })
	public Response save(@RequestBody Cliente input) {
		try {
			logger.info("Input data from client {}\nCustomer name: {}", input, input.getNombreCliente());
			Cliente c = service.save(input);
			if (c != null)
				return new Response("OK", "Registro almacenado");
			else
				return new Response("NO", "No se pudo almacenar el registro");
		} catch (Exception e) {
			logger.error(AppUtils.stackTraceLikeString(e));
			return new Response("ERROR", AppUtils.stackTraceLikeString(e));
		}
	}
	
	@RequestMapping(value = "/productos", method = RequestMethod.GET, produces = { "application/json" })
	public ArrayList<ProductosFactura> testProductos() {
		try {
			logger.info("PROBANDO SERVICIO DE PRODUCTOS"); 
			return Lists.newArrayList(anotherService.findAll());
		} catch (Exception e) {
			logger.error(AppUtils.stackTraceLikeString(e));
			return null;
		}
	}
}
