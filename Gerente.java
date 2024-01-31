package br.com.vainaweb.backendt3.classeabstrata;

public class Gerente extends ColaboradorCLT {

	private String habilidadeTecnica;
	private String areaEspecifica;
	private String[] orcamentosControlados;
	
	public Gerente() {
		super();
		
	}


	public Gerente(String nome, String cpf, int idade, String numeroMatricula, String genero, String anoContratacao,
			boolean isAtivo, double salario, String carteiraTrabalho, String numeroPIS, String habilidadeTecnica, String areaEspecifica, String[] orcamentosControlados) {
		super(nome, cpf, idade, numeroMatricula, genero, anoContratacao, isAtivo, salario, carteiraTrabalho, numeroPIS);
		this.habilidadeTecnica = habilidadeTecnica;
		this.areaEspecifica = areaEspecifica;
		this.orcamentosControlados = orcamentosControlados;
	}


	public String getHabilidadeTecnica() {
		return habilidadeTecnica;
	}


	public void setHabilidadeTecnica(String habilidadeTecnica) {
		this.habilidadeTecnica = habilidadeTecnica;
	}

	
	public String getAreaEspecifica() {
		return areaEspecifica;
	}


	public void setAreaEspecifica(String areaEspecifica) {
		this.areaEspecifica = areaEspecifica;
	}



	public String[] getOrcamentosControlados() {
		return orcamentosControlados;
	}



	public void setOrcamentosControlados(String[] orcamentosControlados) {
		this.orcamentosControlados = orcamentosControlados;
	}



	@Override
	public String visualizar() {
		return super.visualizar()+  "\n Caracteristicas: " + this.habilidadeTecnica;
	}


	@Override
	public double calcularValeTransporte(double valorDiario, int diasTrabalhados, int viagensDia) {
		
		double valeTransporte = valorDiario * diasTrabalhados * viagensDia;
		return valeTransporte;
	}


	@Override
	public double calcularValeRefeicao(double valorDiario, int diasTrabalhados) {
		
		double valeRefeicao = valorDiario * diasTrabalhados;
		return valeRefeicao;
	}


	@Override
	public void receberAumento(double salario, double porcentagem) {
		salario += (salario * porcentagem);
		
	}

}
