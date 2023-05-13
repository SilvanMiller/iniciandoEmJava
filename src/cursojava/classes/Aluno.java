package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;

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
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public Aluno() {/*Cria os dados na memoria - sendo padrão do Java*/
		
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	
	/*para gerar o get e set de todos atributros, basta em um espaço vazio clicar com direito e ir em source e depois gerar get set e marcar quais vc quer gerar*/
	
	/*agora os metodos SETTERS E GETTERS do objeto*/
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

	/*MÉTODO Q RETORNA A MEDIA DO ALUNO*/
	
	/*public double getMediaNT() { 
		return (disciplina.getNota1() + disciplina.getNota2() 
					+ disciplina.getNota3() + disciplina.getNota4()) / 4;}*/
	
	public double getMediaNT() {
		
		double somaNotas = 0.0;
		for(Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		return somaNotas / disciplinas.size();
	}
	
	public boolean getAlunoApRep() {
		double media = this.getMediaNT();
		if(media >= 70) {
			return true;/*aprovado*/
		}else {
			return false;/*reprovado*/
		}
	}
	
	/* MÉTODO RARAMENTE UTILIZADO */
	public String getAlunoApRepString() {
		double media = this.getMediaNT();
		if(media >= 50) {
			if(media >= 70) {
				return StatusAluno.APROVADO;	
			}else {
				return StatusAluno.RECUPERACAO;
			}
		}else {
			return StatusAluno.REPROVADO;
		}
	}
	
	
	public String toString() {
		return "Aluno [" + nome + ", idade=" + idade + ", "
					+ "dataNascimento=" + dataNascimento + ", "
					+ "registroGeral="+ registroGeral + ", "
					+ "numeroCPF=" + numeroCPF + ", "
					+ "nomeMae=" + nomeMae + ", "
					+ "nomePai=" + nomePai + ", "
					+ "dataMatricula=" + dataMatricula + ", "
					+ "nomeEscola=" + nomeEscola + ", "
					+ "serieMatricualado=" + serieMatricualado + ",]";
}

	/*Eguals e Hashcode (diferencia e compara objetos*/
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroCPF == null) ? 0 : numeroCPF.hashCode());
		return result;
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
