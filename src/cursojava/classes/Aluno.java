package cursojava.classes;

/*Esta é a classe /objeto que representa o Aluno*/
public class Aluno {
	
	/*Esses são os atributos das caracteristicas da classe Aluno*/
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCPF;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatricualado;
	
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	public Aluno() {/*Cria os dados na memoria - sendo padrão do Java*/
		
	}
	
	/*public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}/*
	
	/*agora os metodos SETTERS E GETTERS do objeto*/
	/*para gerar o get e set de todos atributros, basta em um espaço vazio clicar com direito e ir em source e depois gerar get set e marcar quais vc quer gerar*/
	
	
	/*SET é para adicionar/receber dados aos atributos*/
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/*GET e para resgatar e obter o valor de atributos*/
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNacimento) {
		this.dataNascimento = dataNacimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatricualado() {
		return serieMatricualado;
	}

	public void setSerieMatricualado(String serieMatricualado) {
		this.serieMatricualado = serieMatricualado;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	/*MÉTODO Q RETORNA A MEDIA DO ALUNO*/
	public double getMediaNT() { 
		return (nota1 + nota2 + nota3 + nota4)/4;
	}
	
	public boolean getAlunoApRep() {
		double media = this.getMediaNT();
		if(media >= 70) {
			return true;
		}else {
			return false;
		}
	}
	
	/* MÉTODO RARAMENTE UTILIZADO */
	/*public String getAlunoApRepString() {
		double media = this.getMediaNT();
		if(media >= 70) {
			return "Você foi Aprovado";
		}else {
			return "Você foi reprovado";
		}
	}*/
	
}
