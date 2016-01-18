package com.vendapp.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.vendapp.model.Cliente;
import com.vendapp.repositories.ClientesRepository;
import com.vendapp.utils.AppUtils;

@RestController
public class ClientesWS {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ClientesRepository service;

	public ClientesRepository getService() {
		return service;
	}

	public void setService(ClientesRepository service) {
		this.service = service;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = { "application/json" })
	public List<Cliente> list() {
		try {
			return Lists.newArrayList(service.findAll());
		} catch (Exception e) {
			logger.error(AppUtils.stackTraceLikeString(e));
			return null;
		}
	}

	@RequestMapping(value = "/find", method = RequestMethod.GET, produces = { "application/json" })
	public Cliente findByPK(@RequestParam(name = "id") Integer id) {
		try {
			logger.info("ID de busqueda recibido -> {}", id); 
			return service.findOne(id);
		} catch (Exception e) {
			logger.error(AppUtils.stackTraceLikeString(e));
			return null;
		}
	}

	// Me gusta mas asi, mas estilo REST
	@RequestMapping(value = "/find/{id}", method = RequestMethod.GET, produces = { "application/json" })
	public Cliente findByID(@PathVariable Integer id) {
		try {
			logger.info("ID de busqueda recibido -> {}", id); 
			return service.findOne(id);
		} catch (Exception e) {
			logger.error(AppUtils.stackTraceLikeString(e));
			return null;
		}
	}
}
