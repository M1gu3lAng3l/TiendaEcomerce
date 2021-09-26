package com.mintic.TiendaEcomerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mintic.TiendaEcomerce.model.Productos;



public interface ProductosDao extends JpaRepository<Productos,Integer>
{

}
