package cursojava.classes;

/*Esta é a classe /objeto que representa o Aluno*/
public class Aluno {
	
	/*Esses são os atributos das caracteristicas da classe Aluno*/
	private String nome;
	private int idade;
	private String dataNacimento;
	private String registroGeral;
	private String numeroCPF;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatricualado;
	
	public Aluno() {/*Cria os dados na memoria - sendo padrão do Java*/
		
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	
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

	public String getDataNacimento() {
		return dataNacimento;
	}

	public void setDataNacimento(String dataNacimento) {
		this.dataNacimento = dataNacimento;
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
	
}
