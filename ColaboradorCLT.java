package br.com.vainaweb.backendt3.classeabstrata;

public class ColaboradorCLT extends Colaborador implements CalculosCLT {

	private String carteiraTrabalho;
	private String numeroPIS;
	
	public ColaboradorCLT() {
		super();
		
	}

	public ColaboradorCLT(String nome, String cpf, int idade, String numeroMatricula, String genero,
			String anoContratacao, boolean isAtivo, double salario, String carteiraTrabalho, String numeroPIS) {
		super(nome, cpf, idade, numeroMatricula, genero, anoContratacao, isAtivo, salario);
		this.carteiraTrabalho = carteiraTrabalho;
		this.numeroPIS = numeroPIS;
	}
	
	
	public String getCarteiraTrabalho() {
		return carteiraTrabalho;
	}

	public void setCarteiraTrabalho(String carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}

	public String getNumeroPIS() {
		return numeroPIS;
	}

	public void setNumeroPIS(String numeroPIS) {
		this.numeroPIS = numeroPIS;
	}

	@Override
	public void receberAumento(double salario, double porcentagem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calcularValeTransporte(double valorDiario, int diasTrabalhados, int viagensDia) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularValeRefeicao(double valorDiario, int diasTrabalhados) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
