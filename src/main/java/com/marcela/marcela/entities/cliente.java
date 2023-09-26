package com.marcela.marcela.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idcCliente;

	@Column(name = "Cliente")
	private String ncliente;

	@Column(name = "fone")
	private String fone;

	public long getIdcCliente() {
		return idcCliente;
	}

	public void setIdcCliente(long idcCliente) {
		this.idcCliente = idcCliente;
	}

	public String getNcliente() {
		return ncliente;
	}

	public void setNcliente(String ncliente) {
		this.ncliente = ncliente;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

}
