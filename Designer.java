package br.com.vainaweb.backendt3.classeabstrata;

public class Designer extends ColaboradorCLT {

	
	private String habilidadeTecnica;
	private String areaEspecifica;
	
	public Designer() {
		super();
		
	}


	public Designer(String nome, String cpf, int idade, String numeroMatricula, String genero, String anoContratacao,
			boolean isAtivo, double salario, String carteiraTrabalho, String numeroPIS, String habilidadeTecnica, String areaEspecifica) {
		super(nome, cpf, idade, numeroMatricula, genero, anoContratacao, isAtivo, salario, carteiraTrabalho, numeroPIS);
		this.habilidadeTecnica = habilidadeTecnica;
		this.areaEspecifica = areaEspecifica;
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



	@Override
	public void receberAumento(double salario, double porcentagem) {
		salario += (salario * porcentagem);
		
	}
	
	@Override
	public String visualizar() {
		// TODO Auto-generated method stub
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

}
