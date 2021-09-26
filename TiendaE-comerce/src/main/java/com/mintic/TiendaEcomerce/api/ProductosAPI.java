package com.mintic.TiendaEcomerce.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mintic.TiendaEcomerce.dao.ProductosDao;
import com.mintic.TiendaEcomerce.model.Productos;


@RestController
@RequestMapping("productos")
public class ProductosAPI 
{
	@Autowired
	private ProductosDao productosDao;
	@PostMapping("/guardar")
	public void guardar(@RequestBody Productos productos)
	{
		productosDao.save(productos);
	}
	
	@GetMapping("/listar")
	public List<Productos> listar()
	{
		return productosDao.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id")Integer id)
	{
		productosDao.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Productos productos)
	
	{
		productosDao.save(productos);
	}
}
