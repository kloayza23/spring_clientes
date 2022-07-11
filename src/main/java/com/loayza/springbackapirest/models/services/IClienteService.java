package com.loayza.springbackapirest.models.services;

import java.util.List;

import com.loayza.springbackapirest.models.entity.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();
}
