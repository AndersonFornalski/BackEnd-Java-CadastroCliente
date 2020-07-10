package com.CadastroDeClientes.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CadastroDeClientes.model.Cliente;
import com.CadastroDeClientes.repositories.ClienteRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {
	
	@Autowired
	ClienteRepository clienteRepository;

	//lista todos clientes
	@GetMapping(produces = "application/json")
	public ResponseEntity<Cliente> listaCliente(){		
		List<Cliente> lista = clienteRepository.findAll();	
		
		return new ResponseEntity( lista, HttpStatus.OK);
	}
	
	//lista cliente por id
	@GetMapping(value = "/{id}" ,produces = "application/json")
	public ResponseEntity<Cliente> listarId(@PathVariable("id")Long id){
		Optional<Cliente> listId = clienteRepository.findById(id);
		
		return new ResponseEntity<Cliente>(listId.get(), HttpStatus.OK);	
		
	}
	//salva cliente
	@PostMapping(produces = "application/json")	
	public ResponseEntity<Cliente> saveCli(@RequestBody Cliente cliente){
		Cliente saveCliente = clienteRepository.save(cliente);
		
		return new ResponseEntity<Cliente>(saveCliente, HttpStatus.OK);
	}
	
	//atualiza cliente
	@PutMapping(value = "/{id}", produces = "application/json")
	public ResponseEntity<Cliente> Atualizar(@PathVariable("id")Long id, @RequestBody Cliente cliente){
		cliente.setId(id);
		Cliente atualizaCliente = clienteRepository.save(cliente);
		
		return new ResponseEntity<Cliente>(atualizaCliente, HttpStatus.OK);
	}
	
	//exclui cliente
	@DeleteMapping(value = "/{id}" ,produces = "application/json")
	public ResponseEntity<Cliente> delete(@PathVariable("id") Long id){
		clienteRepository.deleteById(id);
		
		return new ResponseEntity<Cliente>(HttpStatus.OK);
	}

	
}




















