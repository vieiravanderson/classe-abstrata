package br.com.vainaweb.backendt3.classeabstrata;

public class ColaboradorPJ extends Colaborador implements CalculosPJ{

	private String cnpj;
	
	public ColaboradorPJ() {
		super();
		
	}

	public ColaboradorPJ(String nome, String cpf, int idade, String numeroMatricula, String genero,
			String anoContratacao, boolean isAtivo, double salario, String cnpj) {
		super(nome, cpf, idade, numeroMatricula, genero, anoContratacao, isAtivo, salario);
		this.cnpj = cnpj;
	}
	
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void receberAumento(double salario, double porcentagem) {
		// TODO Auto-generated method stub
		
	}

	


}
