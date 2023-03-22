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
        
        int a = 25;
        System.out.println(a);
        System.out.println("o valor de a = " + a);
        System.out.println("o valor de a = " + a + " reais.");

        int b = 20;
        int resultado = a + b;
        System.out.println("A soma de " + a + " e " + b + " = " + resultado);

        /*leitura de valores*/

        /*inicaliza o scanner e ler uma idade.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos anos você tem ?");
        int idade = leitor.nextInt();
        leitor.nextLine(); usado para quando vc acaba de ler algo e passar para a proxima linha ou leitura.*/

        /* Ler sexo 
        System.out.println("Me diga o seu sexo?");
        String sexo = leitor.nextLine(); */

        /* ler altura 
        System.out.println("E agora qual a sua altura?");
        double altura = leitor.nextDouble();
        leitor.nextLine();*/
        
        /*
        System.out.println("A idade global e " + mediaIdadeGB);
        System.out.println("A sua idade e " + idade);
        System.out.println("Você e do sexo " + sexo);
        System.out.println("Então essa e a sua altura " + altura);*/
        
        
        /*invocando o metodo, pois só o Main e auto executavel */
        globalVar();

	}
	
	public static void globalVar ()  {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o nome do aluno");
		String name = leitor.nextLine();
		
		int nt1 = 90;
		int nt2 = 70;
		int nt3 = 50;
		int nt4 = 88;
		
		System.out.println("As Notas do Aluno " + name + " foram: " + nt1 + " - " + nt2 + " - " +  nt3 + " - " + nt4 );		
		System.out.println("O Total das Notas de " + name + " foram: " + (nt1 + nt2 + nt3 + nt4));
		System.out.println("A Media das Notas de " + name + " foram: " + (nt1 + nt2 + nt3 + nt4 )/4);
		System.out.println(mediaIdadeGB);
	}

}
