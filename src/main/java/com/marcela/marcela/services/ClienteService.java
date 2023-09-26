package com.marcela.marcela.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcela.marcela.entities.cliente;
import com.marcela.marcela.repositories.clienteRepositorio;

   @Service
   public class ClienteService {
	private final clienteRepositorio clienteRepositorio;
	
   @Autowired
   public ClienteService(clienteRepositorio clienteRepositorio) {
		this.clienteRepositorio = clienteRepositorio;
	}
	
	public cliente saveCliente(cliente cliente ) {
		return clienteRepositorio.save(cliente);
	}

	public cliente getClienteById(Long idc) {
		return clienteRepositorio.findById(idc).orElse(null);
	}
	
	public List<cliente> getAllCliente(){
		return clienteRepositorio.findAll();
	}
	
	public void deletecliente(long idc) {
		clienteRepositorio.deleteById(idc);
	}
{
}

}
