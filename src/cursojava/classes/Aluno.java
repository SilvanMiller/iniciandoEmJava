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
	
	private String disciplina1;
	private double nota1;
	private String disciplina2;
	private double nota2;
	private String disciplina3;
	private double nota3;
	private String disciplina4;
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
	
	public String getDisciplina1() {
		return disciplina1;
	}

	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}

	public String getDisciplina2() {
		return disciplina2;
	}

	public void setDisciplina2(String disciplina2) {
		this.disciplina2 = disciplina2;
	}

	public String getDisciplina3() {
		return disciplina3;
	}

	public void setDisciplina3(String disciplina3) {
		this.disciplina3 = disciplina3;
	}

	public String getDisciplina4() {
		return disciplina4;
	}

	public void setDisciplina4(String disciplina4) {
		this.disciplina4 = disciplina4;
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
	
	private static int parseInt(String idade) {
		return 0;
	}

	/*public String toString() {
		return "Aluno [" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatricualado="
				+ serieMatricualado + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4=" + nota4
				+ "]";
	}*/

	
	
	/*Eguals e Hashcode (diferencia e compara objetos*/
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroCPF == null) ? 0 : numeroCPF.hashCode());
		return result;
	}

	public String toString() {
		return "Aluno [" + nome + ", "
				+ "nomeEscola=" + nomeEscola + ", "
				+ "disciplina1=" + disciplina1 + ", nota1="	+ nota1 + ", "
				+ "disciplina2=" + disciplina2 + ", nota2=" + nota2 + ", "
				+ "disciplina3=" + disciplina3 + ", nota3=" + nota3 + ", "
				+ "disciplina4=" + disciplina4 + ", nota4=" + nota4 + "]";
	}

	/*Eguals e Hashcode (diferencia e compara objetos*/
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroCPF == null) {
			if (other.numeroCPF != null)
				return false;
		} else if (!numeroCPF.equals(other.numeroCPF))
			return false;
		return true;
	}

	
	
	
	
}
