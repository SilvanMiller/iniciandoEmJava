package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;



public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Miguel Miller");
		aluno.setIdade(16);
		
		
		Diretor diretor = new Diretor();
		diretor.setNome("Silvan Miller");
		diretor.setNumeroCPF("12345678910");
		diretor.setIdade(50);
		
		
		Secretario secretario = new Secretario();
		secretario.setNome("Deborah Brito");
		secretario.setNivelCargo(3);
		secretario.setIdade(19);
		
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salário aluno = " + aluno.salario());
		System.out.println("Salário diretor = " + diretor.salario());
		System.out.println("Salário secretario = " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
	}
	public static void teste(Pessoa pessoa) {
		System.out.println(" Essa pessoa é de mais "+ pessoa.getNome() + " e seu salário e de "+ pessoa.salario());
	}
}
