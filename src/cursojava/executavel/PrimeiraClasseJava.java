package cursojava.executavel;

import javax.swing.JOptionPane;

import java.util.Scanner; 
import java.util.ArrayList;
import java.util.List;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;



public class PrimeiraClasseJava {
	
	/*Variável Global, é acessivel a todos */
	static int mediaIdadeGB = 30;
	
	
	/*main é um metodo auto executavel*/
	public static void main(String[] args) {
		
		/*invocando o metodo, pois só o Main e auto executavel 
        globalVar(); doubledecimal (); concatenar (); operadoresLogicos (); 
        repeticaoWhile (); repeticaoFor (); obtendoDados (); caculoMedia ();
        pooConstrutor (); getsetMetodo (); entradaDadosTeclado(); equalsHashcode();
        acresentarDisciplinas(); removerDisciplinas(); percorrendoLista(); */
        
        
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
				" anos, portando o CPF de nº " + cpf + " meu contato é esse: " + telefone + " e moro na " + endereço;
		
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
		
		aluno1.getDisciplina().setNota1(90);
		aluno1.getDisciplina().setNota2(80.7);
		aluno1.getDisciplina().setNota3(70.9);
		aluno1.getDisciplina().setNota4(90.7);
		
		System.out.println(aluno1.getNomeEscola() + ",");
		System.out.println("Aluno(a) "+ aluno1.getNome());
		System.out.println("tem "+ aluno1.getIdade() + " anos. ");
		System.out.println("Sua media é = " + aluno1.getMediaNT());
		
		System.out.println("Resuldado = "+ (aluno1.getAlunoApRep() ? "Você foi Aprovado" : "Você foi Reprovado"));
		
	}
	
	public static void entradaDadosTeclado() {
		
		String nome = JOptionPane.showInputDialog("Digite o nome do Aluno ?");
		String idade = JOptionPane.showInputDialog("Digite sua idade ?");
		String nascimento = JOptionPane.showInputDialog("Digite a data de nascimento");
		String rg = JOptionPane.showInputDialog("Digite seu registro geral(rg)");
		String mae = JOptionPane.showInputDialog("Digite o nome da mãe");
		String pai = JOptionPane.showInputDialog("Digite nome do pai");
		String dtMatricula = JOptionPane.showInputDialog("Digite data da matricula");
		String serieMatriculada = JOptionPane.showInputDialog("Digite serie matriculada ?");
		String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola ?");
		
		String nt1 = JOptionPane.showInputDialog("Digite a primeira nota");
		String nt2 = JOptionPane.showInputDialog("Digite a segunda nota");
		String nt3 = JOptionPane.showInputDialog("Digite a terceira nota");
		String nt4 = JOptionPane.showInputDialog("Digite a quarta nota");
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.parseInt(idade));
		aluno1.setDataNascimento(nascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(dtMatricula);
		aluno1.setSerieMatricualado(serieMatriculada);		
		aluno1.setNomeEscola(nomeEscola);
		
		
		aluno1.getDisciplina().setNota1(Double.parseDouble(nt1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nt2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nt3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nt4));
		
		System.out.println(aluno1.toString());
		System.out.println("Sua media é = " + aluno1.getMediaNT());
		System.out.println("Resuldado = "+ (aluno1.getAlunoApRep() ? "Você foi Aprovado" : "Você foi Reprovado"));
		
	}
	
	public static void equalsHashcode() {
		/*Eguals e Hashcode (diferencia e compara objetos*/
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Miller");
		aluno1.setNumeroCPF("092");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Miller");
		aluno1.setNumeroCPF("092.0");
		
		if(aluno1.equals(aluno2)) {
			System.out.println("Alunos são iguais");
		}else {
			System.out.println("Alunos não são iguais");
		}
	}
	
	public static void acresentarDisciplinas() {
		
		/*String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola ?");
		String nome = JOptionPane.showInputDialog("Digite o nome do Aluno ?");
		
		String materia1 = JOptionPane.showInputDialog("Nome da Materia");
		String nt1 = JOptionPane.showInputDialog("Digite a primeira nota");
		
		String materia2 = JOptionPane.showInputDialog("Nome da Materia");
		String nt2 = JOptionPane.showInputDialog("Digite a segunda nota");
		
		String materia3 = JOptionPane.showInputDialog("Nome da Materia");
		String nt3 = JOptionPane.showInputDialog("Digite a terceira nota");
		
		String materia4 = JOptionPane.showInputDialog("Nome da Materia");
		String nt4 = JOptionPane.showInputDialog("Digite a quarta nota");
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setNomeEscola(nomeEscola);
		
		aluno1.getDisciplinas().setNota1(Double.parseDouble(nt1));
		aluno1.getDisciplinas().setNota2(Double.parseDouble(nt2));
		aluno1.getDisciplinas().setNota3(Double.parseDouble(nt3));
		aluno1.getDisciplinas().setNota4(Double.parseDouble(nt4));
		
		aluno1.getDisciplinas().setDisciplina1(materia1);
		aluno1.getDisciplinas().setDisciplina2(materia2);
		aluno1.getDisciplinas().setDisciplina3(materia3);
		aluno1.getDisciplinas().setDisciplina4(materia4);
		
		System.out.println(aluno1.toString());
		System.out.println("Sua media é = " + aluno1.getMediaNT());
		System.out.println("Resuldado = "+ (aluno1.getAlunoApRep() ? "Você foi Aprovado" : "Você foi Reprovado"));*/
		
		/*--adicionando de forma manual as disciplinas,  
		Disciplina disciplinaBD = new Disciplina();
		disciplinaBD.setDisciplina("Banco de Dados");
		disciplinaBD.setNota(90);
		aluno1.getDisciplinas().add(disciplinaBD);
		
		Disciplina disciplinaFE = new Disciplina();
		disciplinaFE.setDisciplina("Front-End");
		disciplinaFE.setNota(88);
		aluno1.getDisciplinas().add(disciplinaFE);*/
	}
	
	public static void removerDisciplinas() {
		String nome = JOptionPane.showInputDialog("Digite o nome do Aluno ?");
		/*String idade = JOptionPane.showInputDialog("Digite sua idade ?");
		String nascimento = JOptionPane.showInputDialog("Digite a data de nascimento");
		String rg = JOptionPane.showInputDialog("Digite seu registro geral(rg)");
		String mae = JOptionPane.showInputDialog("Digite o nome da mãe");
		String pai = JOptionPane.showInputDialog("Digite nome do pai");
		String dtMatricula = JOptionPane.showInputDialog("Digite data da matricula");
		String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola ?");
		String serieMatriculada = JOptionPane.showInputDialog("Digite serie matriculada ?");*/
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.parseInt(idade));
		aluno1.setDataNascimento(nascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(dtMatricula);
		aluno1.setSerieMatricualado(serieMatriculada);		
		aluno1.setNomeEscola(nomeEscola);*/
		
		for (int pos = 1; pos <= 4; pos ++) {
			
			String nomeDaDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina"+pos+"?");
			String notaDaDisciplina = JOptionPane.showInputDialog("Digite a nota da disciplina"+pos+"?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDaDisciplina);
			disciplina.setNota(Double.valueOf(notaDaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		/*Removendo disciplinas */
		int removerDisc = JOptionPane.showConfirmDialog(null,"Deseja remover alguma disciplina?");
		if (removerDisc == 0) {
			String disciplinaRemover  = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4 ? ");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() -1);
			
		}
		
		System.out.println(aluno1.toString());
		System.out.println("Sua media é = " + aluno1.getMediaNT());
		System.out.println("Resuldado = "+ aluno1.getAlunoApRepString());
		
		
	}

	public static void removerDiscRepeticao() {
		String nome = JOptionPane.showInputDialog("Digite o nome do Aluno ?");
		/*String idade = JOptionPane.showInputDialog("Digite sua idade ?");
		String nascimento = JOptionPane.showInputDialog("Digite a data de nascimento");
		String rg = JOptionPane.showInputDialog("Digite seu registro geral(rg)");
		String mae = JOptionPane.showInputDialog("Digite o nome da mãe");
		String pai = JOptionPane.showInputDialog("Digite nome do pai");
		String dtMatricula = JOptionPane.showInputDialog("Digite data da matricula");
		String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola ?");
		String serieMatriculada = JOptionPane.showInputDialog("Digite serie matriculada ?");*/
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.parseInt(idade));
		aluno1.setDataNascimento(nascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(dtMatricula);
		aluno1.setSerieMatricualado(serieMatriculada);		
		aluno1.setNomeEscola(nomeEscola);*/
		
		for (int pos = 1; pos <= 4; pos ++) {
			
			String nomeDaDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina"+pos+"?");
			String notaDaDisciplina = JOptionPane.showInputDialog("Digite a nota da disciplina"+pos+"?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDaDisciplina);
			disciplina.setNota(Double.valueOf(notaDaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		/*Removendo disciplinas em repetição*/
		int removerDisc = JOptionPane.showConfirmDialog(null,"Deseja remover alguma disciplina?");
		
		if (removerDisc == 0) {
			
			int continuarRemover = 0;
			int posicao = 1;
			while(continuarRemover == 0) {			
				String disciplinaRemover  = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4 ? ");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
				posicao ++;
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
			}
			
		}
		
		System.out.println(aluno1.toString());
		System.out.println("Sua media é = " + aluno1.getMediaNT());
		System.out.println("Resuldado = "+ aluno1.getAlunoApRepString());
		
	}
	
	public static void percorrendoLista() {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
        
        for (int qnt = 1; qnt <=2; qnt++) {
        	String nome = JOptionPane.showInputDialog("Digite o nome do Aluno "+qnt+"?");
    		/*String idade = JOptionPane.showInputDialog("Digite sua idade ?");
    		String nascimento = JOptionPane.showInputDialog("Digite a data de nascimento");
    		String rg = JOptionPane.showInputDialog("Digite seu registro geral(rg)");
    		String mae = JOptionPane.showInputDialog("Digite o nome da mãe");
    		String pai = JOptionPane.showInputDialog("Digite nome do pai");
    		String dtMatricula = JOptionPane.showInputDialog("Digite data da matricula");
    		String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola ?");
    		String serieMatriculada = JOptionPane.showInputDialog("Digite serie matriculada ?");*/
    		
    		Aluno aluno1 = new Aluno();
    		
    		aluno1.setNome(nome);
    		/*aluno1.setIdade(Integer.parseInt(idade));
    		aluno1.setDataNascimento(nascimento);
    		aluno1.setRegistroGeral(rg);
    		aluno1.setNomeMae(mae);
    		aluno1.setNomePai(pai);
    		aluno1.setDataMatricula(dtMatricula);
    		aluno1.setSerieMatricualado(serieMatriculada);		
    		aluno1.setNomeEscola(nomeEscola);*/
    		
    		for (int pos = 1; pos <= 4; pos ++) {
    			
    			String nomeDaDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina"+pos+"?");
    			String notaDaDisciplina = JOptionPane.showInputDialog("Digite a nota da disciplina"+pos+"?");
    			
    			Disciplina disciplina = new Disciplina();
    			disciplina.setDisciplina(nomeDaDisciplina);
    			disciplina.setNota(Double.valueOf(notaDaDisciplina));
    			
    			aluno1.getDisciplinas().add(disciplina);
    		}
    		/*Removendo disciplinas em repetição*/
    		int removerDisc = JOptionPane.showConfirmDialog(null,"Deseja remover alguma disciplina?");
    		
    		if (removerDisc == 0) {
    			
    			int continuarRemover = 0;
    			int posicao = 1;
    			while(continuarRemover == 0) {			
    				String disciplinaRemover  = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4 ? ");
    				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
    				posicao ++;
    				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
    			}
    			
    		}
    		alunos.add(aluno1);	
        };
        for (Aluno aluno : alunos) {
        	System.out.println(aluno.toString());
        	System.out.println("Sua media é = " + aluno.getMediaNT());
        	System.out.println("Resuldado = "+ aluno.getAlunoApRepString());
        	System.out.println("--------------------------------------------------------------------------------------");
		}
	}
	//
	
	
	
}
