/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereço;
	private String telefone;
	private String email;
	
	public Pessoa(String nome, String cpf, String endereco, String telefone, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereço = endereco;
		this.telefone = telefone;
		this.email = email;
		
		
		
	}

	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getEndereço() {
		return endereço;
	}



	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	

}
