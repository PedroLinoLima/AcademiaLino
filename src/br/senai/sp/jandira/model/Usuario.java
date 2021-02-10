package br.senai.sp.jandira.model;

//import java.time.LocalDate;
//import java.time.Period;

public class Usuario {
	
	private String nome;
	private double peso;
	private double altura;
	private String sexo;
	private int idade;
//	private LocalDate dataNascimento;
	private String nivelDeAtividade;
	
	// Nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	// Peso
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPeso() {
		return this.peso;
	}
	
	// Altura
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return this.altura;
	}

	// Sexo
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSexo() {
		if (sexo.contentEquals ("Masculino") || sexo.equals("Feminino")) {
			return this.sexo;
		}
		else {
			return "O Sexo deve ser ( Masculino ou Feminino )";
		}
	}
	
	// Idade
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}
//	public void setDataNascimento(LocalDate dataNascimento) {
//	this.dataNascimento = dataNascimento;
//}
//
//public LocalDate getDataNascimento() {
//	return dataNascimento;
//}
//
//// *** Obter idade
//public int getIdade() {
//	LocalDate hoje = LocalDate.now();
//	Period periodo = Period.between(this.dataNascimento, hoje);
//	return periodo.getYears();
	
	// *** Nivel de atividade
	public void setNivelDeAtividade(String nivelDeAtividade) {
		this.nivelDeAtividade = nivelDeAtividade;
	}
	public String getNivelDeAtividade() {
		if (nivelDeAtividade.contentEquals ("Leve") || nivelDeAtividade.equals("Moderada")) {
			return this.nivelDeAtividade;
		}
		else if (nivelDeAtividade == "Pesada") {
			return this.nivelDeAtividade;
		}
		else {
			return "O nivel de Atividade tem que ser (Leve, Moderada ou Pesada)";
		}
	}
	
	// *** IMC
	public double getImc() {
		return this.peso / (this.altura * this.altura);
	}
	public String statusImc() {
		if (this.getImc() <= 18.5) {
			return "Abaixo do Peso";
		}else if (this.getImc() > 18.5 && this.getImc() <= 24.9) {
			return "Peso Ideal (Parabens)";
		}else if (this.getImc() > 24.9 && this.getImc() <= 29.9) {
			return "Levemente acima do peso";
		}else if (this.getImc() > 29.9 && this.getImc() <= 34.9) {
			return "Obesidade grau I";
		}else if (this.getImc() > 34.9 && this.getImc() <= 39.9) {
			return "Obesidade grau II";
		}else {
			return "Obesidade III (mórbida)";
		}
	}
	
	// *** NCD
	public double getGastoCalorico() {
		if (this.sexo == "Masculino") {
			if (getIdade() > 17 && getIdade() < 31) {
				return 15.3 * this.peso + 679;
			}else if (getIdade() >= 31 && getIdade() <= 60) {
				return 11.6 * this.peso + 879;
			}if (getIdade() > 60) {
				return 13.5 * this.peso + 487;
			}
		}else if (this.sexo == "Feminino") {
			if(getIdade() > 17 && getIdade() < 31) {
				return 14.7 * this.peso + 496;
			}
			else if(getIdade() >= 31 && getIdade() <= 60) {
				return 8.7 * this.peso + 829;
			}
			if (getIdade() > 60) {
				return 10.5 * this.peso + 596;
			}
		}
		return getGastoCalorico();
	}
	
	public double getNcd() {
		if (this.sexo == "Masculino") {
			if(getNivelDeAtividade() == "Leve") {
				return getGastoCalorico() * 1.5;
			}else if (getNivelDeAtividade() == "Moderada") {
				return getGastoCalorico() * 1.8;
			}else {
				return getGastoCalorico() * 2.1;
			}
		}else if (this.sexo == "Feminino") {
			if(getNivelDeAtividade() == "Leve") {
				return getGastoCalorico() * 1.6;
			}else if (getNivelDeAtividade() == "Moderada") {
				return getGastoCalorico() * 1.6;
			}else {
				return getGastoCalorico() * 1.8;
			}
		}
		return getNcd();
	}

}

