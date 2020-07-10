package com.CadastroDeClientes.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;   

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String nomeComp_razao;
	private String nomeFantasia;
	private String cnpj;
	private String insc_estadual;
	private String fundacao;
	private String codigo_nota_fiscal;
	private String endereco;
	private long numero;
	private String bairro;
	private String cidade;
	private String uf;
	private String fixo;
	private String celular;
	private String email;
	private String vendedor;
	private String observacao;	

	
	public Cliente() {
		
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNomeComp_razao() {
		return nomeComp_razao;
	}


	public void setNomeComp_razao(String nomeComp_razao) {
		this.nomeComp_razao = nomeComp_razao;
	}


	public String getNomeFantasia() {
		return nomeFantasia;
	}


	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getInsc_estadual() {
		return insc_estadual;
	}


	public void setInsc_estadual(String insc_estadual) {
		this.insc_estadual = insc_estadual;
	}


	public String getFundacao() {
		return fundacao;
	}


	public void setFundacao(String fundacao) {
		this.fundacao = fundacao;
	}


	public String getCodigo_nota_fiscal() {
		return codigo_nota_fiscal;
	}


	public void setCodigo_nota_fiscal(String codigo_nota_fiscal) {
		this.codigo_nota_fiscal = codigo_nota_fiscal;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public long getNumero() {
		return numero;
	}


	public void setNumero(long numero) {
		this.numero = numero;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public String getFixo() {
		return fixo;
	}


	public void setFixo(String fixo) {
		this.fixo = fixo;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getObservacao() {
		return observacao;
	}


	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	public String getVendedor() {
		return vendedor;
	}


	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	
	
	

}
