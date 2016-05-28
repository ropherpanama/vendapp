package com.vendapp.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.vendapp.model.DetalleFactura;
import com.vendapp.repositories.DetalleFacturaRepository;
import com.vendapp.utils.AppUtils;

@RestController
public class RestDetalleFactura {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	DetalleFacturaRepository service;

	public DetalleFacturaRepository getService() {
		return service;
	}

	public void setService(DetalleFacturaRepository service) {
		this.service = service;
	}

	@RequestMapping(value = "/bills_products/all", method = RequestMethod.GET, produces = { "application/json" })
	public List<DetalleFactura> list() {
		try {
			return Lists.newArrayList(service.findAll());
		} catch (Exception e) {
			logger.error(AppUtils.stackTraceLikeString(e));
			return null;
		}
	}
}
