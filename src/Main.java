
public class Main {

	public static void main(String[] args) {

		Cliente mauro = new Cliente();
				mauro.setNome("Mauro");
		
		IConta cc = new ContaCorrente(mauro);
		cc.depositar(100);
		IConta cp = new ContaPoupanca(mauro);
		
		cc.transferir(100, cp);

		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		

	}

}
