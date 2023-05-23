package cursojava.interfaces;

/*Essa intrfce será o nosso cntrto de autenticação*/ 
public interface PermitirAcesso {
	
	public boolean autenticar();/*apenas declaração do método*/
	public boolean autenticar(String login, String senha);
}
