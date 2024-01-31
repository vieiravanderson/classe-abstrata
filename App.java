package br.com.vainaweb.backendt3.classeabstrata;

public class App {

	public static void main(String[] args) {
		
		Designer designer = new Designer();
		
		double valeTransporte = designer.calcularValeTransporte(6, 26, 2);
		System.out.println(valeTransporte);
		
	}

}
