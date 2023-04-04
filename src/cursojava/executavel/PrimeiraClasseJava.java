package cursojava.executavel;

import javax.swing.JOptionPane;
import java.util.Scanner; 
import cursojava.classes.Aluno;



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
        
        /*invocando o metodo, pois só o Main e auto executavel 
        globalVar(); doubledecimal (); concatenar (); operadoresLogicos (); 
        repeticaoWhile (); repeticaoFor (); obtendoDados (); caculoMedia ();*/
        pooConstrutor (); getsetMetodo ();

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
	
	public static void operadoresLogicos () {
		
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
		double nt2 = 60;
		double nt3 = 80;
		double nt4 = 88;
		
		double mediaFinal = (nt1 + nt2 + nt3 + nt4 )/4;
		
		/* OPERADORES LÓGICOS com IF e ELSE */
		if(mediaFinal >= 70) {
			System.out.println("Aluno aprovado " + mediaFinal);
			}
		if(mediaFinal >= 50 && mediaFinal <= 69) {
			System.out.println("Aluno em recuperação " + mediaFinal);
			}
		else {
			System.out.println("Aluno reprovado " + mediaFinal);
		}
		
		
		
		/*OPERADORES TERNÁRIOS usado para micro validações */
		
		String saidaResultado = mediaFinal >= 70 ? "Aluno Aprovado" : (mediaFinal >= 50 && mediaFinal <= 69) ? "Aluno em recuperação " : "Aluno Reprovado";
		
		System.out.println(mediaFinal + " - " + saidaResultado);
		
		/*OPERADORES LÓG ANINHADOS são operações dentro de operações */
		
		if(mediaFinal >= 50) {
			
			if(mediaFinal >= 70) {
				
				if(mediaFinal > 90) {
					
					System.out.println("Aluno Aprovado direto - Parabéns !!! " + mediaFinal);
					
				}else {System.out.println("Aluno Aprovado " + mediaFinal);}
			
			}else {System.out.println("Aluno de Recuperação " + mediaFinal);}
			
		}else {System.out.println("Aluno Reprovado Direto " + mediaFinal);}
		
		/* SWITCH CASE usado em operações exatas*/
		
		int dia = 3; //2, 3
		
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("terça-feira");
			break;
		default: System.out.println("Um outro dia qualquer");
			break;
		}
	}
	
	public static void repeticaoWhile () {
		
		int numero = 0;
		int numero2 = 10;
		while(numero <= 10) {
			numero++;
			System.out.println("O numero atual while é: " + numero);
		}
		/*--- DO ---------*/
		do {
			System.out.println("O numero decresente DO While é: " + numero2);
			numero2--;
		}while (numero2 >= 0);
			
	}
	
	public static void repeticaoFor () {
		for (int n = 0; n <= 10; n++) {
			System.out.println("O numero atual do FOR é: " + n);
		}
		
		for (int n = 10; n >= 0; n--) {
			System.out.println("O numero decresente do FOR é: " + n);
		}
		
		for (int n = 0; n <= 10; n++) {
			if (n == 3) {
				System.out.println("Opa, tem um número 3 aqui");
				System.out.println("parei, não achei mais");
				continue;
			}
		}
		
		for (int n = 0; n <= 10; n++) {
			if (n == 3 || n == 6 || n == 9) {
				System.out.println("Opa, tem um número "+ n);
				continue;
			}
		}
	}

	public static void obtendoDados () {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoa = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
		
		double nCarros = Double.parseDouble(carros);
		double nPessoa = Double.parseDouble(pessoa);
		
		int divisao = (int)(nCarros / nPessoa);
		double resto = nCarros % nPessoa;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
			if (resposta == 0) {
				JOptionPane.showMessageDialog(null,"Teremos " + divisao + " carro(s) para cada pessoa");
			}else {
				JOptionPane.showMessageDialog(null, "Obrigado e até mais.");
			};
		
			
		resposta = JOptionPane.showConfirmDialog(null, "Deseja saber o resto da divisão?");
			if (resposta == 0) {		
				JOptionPane.showMessageDialog(null,"Sobrou " + resto + " carro(s)");
			}else {
				JOptionPane.showMessageDialog(null, "Obrigado e até mais.");
			};
			
			
		
		/*leitura de valores 
		
		  //inicaliza o scanner e ler uma idade. 
		    Scanner leitor = new Scanner(System.in);
		    
		    System.out.println("Quantos anos você tem ?");
		    int idade = leitor.nextInt();
		    leitor.nextLine(); //usado para quando vc acaba de ler algo e passar para a proxima linha ou leitura.
		
		  //Ler sexo 
		    System.out.println("Me diga o seu sexo?");
		    String sexo = leitor.nextLine(); 
		
		   //ler altura 
		    System.out.println("E agora qual a sua altura?");
		    double altura = leitor.nextDouble();
			leitor.nextLine();
		    
		    System.out.println("A idade global e " + mediaIdadeGB);
		    System.out.println("A sua idade e " + idade);
		    System.out.println("Você e do sexo " + sexo);
		    System.out.println("Então essa e a sua altura " + altura); */
	}

	public static void caculoMedia () {
		
		String nomeAluno = JOptionPane.showInputDialog("Digite o Nome do Aluno?");
		
		String nota1 = JOptionPane.showInputDialog("Digite a primeira nota do " + nomeAluno);
		String nota2 = JOptionPane.showInputDialog("Digite a segunda nota do " + nomeAluno);
		String nota3 = JOptionPane.showInputDialog("Digite a terceira nota do " + nomeAluno);
		String nota4 = JOptionPane.showInputDialog("Digite a quarta nota do " + nomeAluno);
		
		//conversão das strings em numero 
		double av1 = Double.parseDouble(nota1);
		double av2 = Double.parseDouble(nota2);
		double av3 = Double.parseDouble(nota3);
		double av4 = Double.parseDouble(nota4);
		
		double media = (av1 + av2 + av3 + av4) / 4;
		
		//JOptionPane.showMessageDialog(null,"A media do Aluno " + nomeAluno + " é: " + media);
		
		//Média para aprovação é 70
		if (media >= 50) {
			if(media >= 70) {
				JOptionPane.showMessageDialog(null, nomeAluno + " está aprovado com média de " + media);
			}else {
				JOptionPane.showMessageDialog(null, nomeAluno + " está de recuperação sua média foi " + media);
			}
		}else {
			JOptionPane.showMessageDialog(null, 
					nomeAluno + " foi reprovado direto sua média (" + media + "), foi abaixo de 50");
		}		
	}
	
	public static void pooConstrutor () {
		
		/*new Aluno() é uma INSTANCIA (criação de objeto)*/
		/* aluno1 é uma referencia para o objeto Aluno*/
		/*Aluno aluno1 = new Aluno();
		aluno1.nome = "Miguel";
		aluno1.idade = 21;
		System.out.println("Aluno1 se chama "+ aluno1.nome + " e sua idade é " + aluno1.idade);
		
		Aluno aluno2 = new Aluno("Deborah");
		
		Aluno aluno3 = new Aluno("Silvan",43);*/
		
	}
	
	public static void getsetMetodo () {
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Micaela");
		aluno1.setIdade(14);
		aluno1.setNomeEscola("Escola estadual Casimiro de Abreu");
		aluno1.setNomeMae("Michele");
		aluno1.setNomePai("Silvan");
		
		System.out.println("Aluno1 se chama "+ aluno1.getNome()+ " tenho "+ aluno1.getIdade()+ " e estudo na escola "+ aluno1.getNomeEscola());
		
		Aluno aluno2 = new Aluno("Deborah");
		
		aluno2.setNome("Miguel");
		aluno2.setIdade(21);
		aluno2.setNomeEscola("Escola estadual Casimiro de Abreu");
		aluno2.setNomeMae("Michele");
		aluno2.setNomePai("Silvan");
		
		System.out.println("Aluno1 se chama "+ aluno2.getNome()+ " tenho "+ aluno2.getIdade()+ " e estudo na escola "+ aluno2.getNomeEscola() + "o nome de seu pai é "+ aluno2.getNomePai());
		
		
		Aluno aluno3 = new Aluno("Silvan",43);
	}
	//
	
	
	
	
	
}
