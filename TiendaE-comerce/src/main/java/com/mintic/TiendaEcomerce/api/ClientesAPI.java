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

import com.mintic.TiendaEcomerce.dao.ClientesDao;
import com.mintic.TiendaEcomerce.model.Clientes;




@RestController
@RequestMapping("clientes")
public class ClientesAPI
{
	@Autowired
	private ClientesDao clientesDao;
	@PostMapping("/guardar")
	public void guardar(@RequestBody Clientes clientes)
	{
		clientesDao.save(clientes);
	}
	
	@GetMapping("/listar")
	public List <Clientes> listar()
	{
		return clientesDao.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id")Long id)
	{
		clientesDao.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Clientes clientes)
	
	{
		clientesDao.save(clientes);
	}
}
