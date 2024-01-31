package br.com.vainaweb.backendt3.classeabstrata;

public class DevBackEnd extends ColaboradorPJ {

	private String habilidadeTecnica;
	private String senioridade;
	private String linguagem;
	
	public DevBackEnd() {
		super();
		
	}

	
	public DevBackEnd(String nome, String cpf, int idade, String numeroMatricula, String genero, String anoContratacao,
			boolean isAtivo, double salario, String cnpj) {
		super(nome, cpf, idade, numeroMatricula, genero, anoContratacao, isAtivo, salario, cnpj);
		this.habilidadeTecnica = habilidadeTecnica;
		this.linguagem = linguagem;
		this.senioridade = senioridade;
	}


	public String getHabilidadeTecnica() {
		return habilidadeTecnica;
	}

	public void setHabilidadeTecnica(String habilidadeTecnica) {
		this.habilidadeTecnica = habilidadeTecnica;
	}
	
	

	public String getSenioridade() {
		return senioridade;
	}


	public void setSenioridade(String senioridade) {
		this.senioridade = senioridade;
	}
	
	

	public String getLinguagem() {
		return linguagem;
	}


	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}


	@Override
	public void receberAumento(double salario, double porcentagem) {
		salario += (salario * porcentagem);
		
	}

	@Override
	public String visualizar() {
		return super.visualizar() + "\n Caracteristicas: " + this.habilidadeTecnica;
	}

}
