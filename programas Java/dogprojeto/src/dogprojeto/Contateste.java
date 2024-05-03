package dogprojeto;

public class Contateste {

	public static void main(String[] args) {

		Conta conta  = new Conta();
		conta.cliente = "Umberto";
		conta.saldo = 4000.00;
		conta.exibesaldo();
		
		//conta.saque(2000);
		//conta.exibesaldo();
		
		//conta.deposito(1000);
		//conta.exibesaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Carol";
		destino.saldo = 6000.00;
		destino.exibesaldo();
	}

}
