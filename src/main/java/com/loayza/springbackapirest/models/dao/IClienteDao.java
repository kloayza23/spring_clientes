package com.loayza.springbackapirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.loayza.springbackapirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
