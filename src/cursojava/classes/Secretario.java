package cursojava.classes;

/*Esta é a classe/objeto filha que representa o Secretario - herança*/
public class Secretario extends Pessoa{
	private String registro;
	private int nivelCargo;
	private String experiencia;
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public int getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(int nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Secretario [registro = " + registro + ", "
				+ "nivelCargo = " + nivelCargo + ", "
				+ "experiencia = " + experiencia + ", "
				+ "nome = " + nome + ", "
				+ "idade = " + idade + ", "
				+ "dataNascimento = " + dataNascimento + ", "
				+ "registroGeral = "+ registroGeral + ", "
				+ "numeroCPF = " + numeroCPF + ", "
				+ "nomeMae = " + nomeMae + ", "
				+ "nomePai = " + nomePai + "]";
	}
	
	
	
	
	
	
	
	

}
