package com.vendapp.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.vendapp.model.DetallePedido;
import com.vendapp.repositories.DetallePedidoReposiroty;
import com.vendapp.utils.AppUtils;

@RestController
public class RestDetallePedido {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	DetallePedidoReposiroty service;

	public DetallePedidoReposiroty getService() {
		return service;
	}

	public void setService(DetallePedidoReposiroty service) {
		this.service = service;
	}

	@RequestMapping(value = "/order_details/all", method = RequestMethod.GET, produces = { "application/json" })
	public List<DetallePedido> list() {
		try {
			return Lists.newArrayList(service.findAll());
		} catch (Exception e) {
			logger.error(AppUtils.stackTraceLikeString(e));
			return null;
		}
	}
}
