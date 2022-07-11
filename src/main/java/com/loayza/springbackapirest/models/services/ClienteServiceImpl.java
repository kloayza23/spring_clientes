package com.loayza.springbackapirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.loayza.springbackapirest.models.dao.IClienteDao;
import com.loayza.springbackapirest.models.entity.Cliente;

@Service

public class ClienteServiceImpl implements IClienteService{
	@Autowired
	private IClienteDao clienteDao;
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}
	
}
