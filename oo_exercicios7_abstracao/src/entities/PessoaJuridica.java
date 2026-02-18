package entities;

public class PessoaJuridica extends Contribuinte {
	
	private Integer numeroDeFuncionarios;
	
	public PessoaJuridica() {
		super();
	}	

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public double impostoPago() {
		if (this.numeroDeFuncionarios > 10) {
			return this.rendaAnual * 0.14;
		} else {
			return this.rendaAnual * 0.16;
		}		
	}

}
