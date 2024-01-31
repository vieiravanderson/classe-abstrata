package br.com.vainaweb.backendt3.classeabstrata;

public interface CalculosCLT {
	
	void receberAumento(double salario, double porcentagem);
	double calcularValeTransporte(double valorDiario, int diasTrabalhados, int viagensDia);
	double calcularValeRefeicao(double valorDiario, int diasTrabalhados);
}
