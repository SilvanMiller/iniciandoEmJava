package cursojava.executavel;
import java.util.Scanner;



public class PrimeiraClasseJava {
	
	/*Variável Global, é acessivel a todos */
	static int mediaIdadeGB = 30;
	
	
	/*main é um metodo auto executavel*/
	public static void main(String[] args) {
		
		/*Variável local, pertence a esse bloco */
		
		/*imprimir/escrever no console*/
		System.out.println("Meu primeiro codigo em Java - Silvan Miller");
		System.out.println("Java Orientado a Objeto");
        System.out.println("Oi");
        System.out.print("oi");
        System.out.print("oi");
        System.out.println("oi");      
        
        /*invocando o metodo, pois só o Main e auto executavel */
        globalVar();
        doubledecimal ();
        concatenar ();
        obtendoDados ();
        operadoresLogCondRela ();

	}
	
	public static void globalVar ()  {
		
		System.out.println(mediaIdadeGB);
		
		String name = "Miguel";
		
		int nt1 = 90;
		int nt2 = 70;
		int nt3 = 50;
		int nt4 = 88;
		
		System.out.println("As Notas do Aluno " + name + " foram: " + nt1 + " - " + nt2 + " - " +  nt3 + " - " + nt4 );		
		System.out.println("O Total das Notas de " + name + " foram: " + (nt1 + nt2 + nt3 + nt4));
		System.out.println("A Media das Notas de " + name + " foram: " + (nt1 + nt2 + nt3 + nt4 )/4);
		
	}
	
	public static void doubledecimal () {
		
		double nt1 = 90;
		double nt2 = 70;
		double nt3 = 50;
		double nt4 = 88;
		
		double mediaFinal = (nt1 + nt2 + nt3 + nt4 )/4;
		System.out.println("A Media das Notas " + mediaFinal);
		
	}
	
	public static void concatenar () {
		
		int idade = 42;
		
		String nome = "Silvan Miller";
		String cpf = "123.456.789-00";
		String telefone = "22 9995-60748";
		String endereço = "Est. dos Bandeirantes - RJ";
		
		String saida = "Eu sou " + nome + " tenho " + idade +   
				" anos, meu contato é esse: " + telefone + " e moro na " + endereço;
		
		System.out.println(saida);
	}
	
	public static void obtendoDados () {
	
		/*leitura de valores*/
	
	  /*inicaliza o scanner e ler uma idade. */
	    Scanner leitor = new Scanner(System.in);
	    
	    System.out.println("Quantos anos você tem ?");
	    int idade = leitor.nextInt();
	    leitor.nextLine(); /*usado para quando vc acaba de ler algo e passar para a proxima linha ou leitura.*/
	
	  /* Ler sexo */
	    System.out.println("Me diga o seu sexo?");
	    String sexo = leitor.nextLine(); 
	
	  /* ler altura */
	    System.out.println("E agora qual a sua altura?");
	    double altura = leitor.nextDouble();
		leitor.nextLine();
	    
	    
	    System.out.println("A idade global e " + mediaIdadeGB);
	    System.out.println("A sua idade e " + idade);
	    System.out.println("Você e do sexo " + sexo);
	    System.out.println("Então essa e a sua altura " + altura);
	}
	
	public static void operadoresLogCondRela () {
		
		int mediaAluno = 70;
		String nome = "iller";
		
		if(mediaAluno >= 70 && nome.equals("Miller")) {
			System.out.println("Parebéns Aprovado");
		}else if (mediaAluno < 70) {
			System.out.println("Te vejo ano que vem, Reprovado");
		}else {
			System.out.println("Opá não encontramos o Aluno");
		}
		
		double nt1 = 90;
		double nt2 = 70;
		double nt3 = 50;
		double nt4 = 88;
		
		double mediaFinal = (nt1 + nt2 + nt3 + nt4 )/4;
	}
}
