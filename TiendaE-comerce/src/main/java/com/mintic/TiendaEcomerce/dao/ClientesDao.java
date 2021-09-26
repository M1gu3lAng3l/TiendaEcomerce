package com.mintic.TiendaEcomerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mintic.TiendaEcomerce.model.Clientes;

public interface ClientesDao extends JpaRepository<Clientes, Integer>
{

}
