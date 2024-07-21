
public class Main 
{
	
	public static void main(String[] args) 
	{
		Cliente Joao = new Cliente();
		Joao.setNome("João");
		
		Conta cc = new ContaCorrente(Joao);
		Conta cp = new ContaPoupança(Joao);
		
		cc.depositar(150);
		cc.transferir(90, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}
