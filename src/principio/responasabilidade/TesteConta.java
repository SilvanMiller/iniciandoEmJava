package principio.responasabilidade;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Conta Bancaria Silvan");
		
		System.out.println(bancaria);
		
		bancaria.diminui100reais();
		bancaria.diminui100reais();
		
		System.out.println(bancaria);
		
		bancaria.depositarDinheiro(800);
		
		bancaria.sacarDinheiro(250);
				
		
		System.out.println(bancaria);
	}

}
