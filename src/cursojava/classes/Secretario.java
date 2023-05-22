package cursojava.classes;


import cursojava.interfaces.PermitirAcesso;

/*Esta é a classe/objeto filha que representa o Secretario - herança*/
public class Secretario extends Pessoa implements PermitirAcesso{
	
	private String registro;
	private int nivelCargo;
	private String experiencia;
	
	private String login;
	private String senha;
	
	
	
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
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
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
	@Override
	public double salario() {
		return 1800.80 * 0.9;
	}
	
	/*Esse é o metodo do contrato de autenticação*/
	public boolean autenticar() {
		return login.equals("admin") && senha.equals("admin");/*Rtorna sim caso login e senha correto ou false se incorreto*/
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
