
public class UIBTesteMain {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		cliente.nome = "Renato";
		cliente.cpf = "091";
		
		Conta conta = new Conta();
		conta.numero = "010";
		conta.saldo = 500;
		conta.cliente = cliente;
		
	
		System.out.println(conta.cliente.nome);
		System.out.println(conta.cliente.cpf);
	}

}
