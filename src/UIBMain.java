
public class UIBMain {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		cliente.nome = "Seu jair";
		cliente.cpf = "123";

		Conta conta = new Conta();
		conta.numero = "123-1";
		conta.saldo = 100;
		conta.cliente = cliente;

		cliente.cpf = "987";

		System.out.println(conta.cliente.nome);
		System.out.println(conta.cliente.cpf);
	}

}