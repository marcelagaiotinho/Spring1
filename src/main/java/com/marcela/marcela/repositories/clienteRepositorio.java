package com.marcela.marcela.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.marcela.marcela.entities.cliente;

public interface clienteRepositorio extends JpaRepository<cliente, Long>
{

}
