package br.com.vainaweb.backendt3.classeabstrata;

import java.util.Scanner;

public abstract class Colaborador {

	private String nome;
	private String cpf;
	private int idade;
	private String numeroMatricula;
	private String genero;
	private String anoContratacao;
	private boolean isAtivo = true;
	private double salario;
	

	public Colaborador() {

	}

	public Colaborador(String nome, String cpf, int idade, String numeroMatricula, String genero, String anoContratacao,
			boolean isAtivo, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.numeroMatricula = numeroMatricula;
		this.genero = genero;
		this.anoContratacao = anoContratacao;
		this.isAtivo = isAtivo;
		this.salario = salario;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAnoContratacao() {
		return anoContratacao;
	}

	public void setAnoContratacao(String anoContratacao) {
		this.anoContratacao = anoContratacao;
	}

	public boolean isAtivo() {
		return isAtivo;
	}

	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// Métodos
	public String visualizar() {
		return "[ " + this.nome + ", " + this.idade + " ]" + "\n CPF: " + this.cpf + "\nEstá ativo ?: " + this.isAtivo;
	}

	public void desvincularColaborador() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Você deseja desvincular " + this.nome + " da empresa ?");
		Character resposta = sc.next().charAt(0);
		Character.toLowerCase(resposta);
		if (resposta.equals('s')) {
			System.out.println(this.nome + " está demitido(a)");
			this.isAtivo = false;
		}
		sc.close();
	}

	

}
