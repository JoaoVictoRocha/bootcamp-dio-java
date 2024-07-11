import CustomExcep.ParametrosInvalidosException;
import java.util.Scanner;

public class Contador
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int param1 = scanner.nextInt();
		
		System.out.println("Digite o segundo parâmetro");
		int param2 = scanner.nextInt();
		
		try {
			contar(param1, param2);
		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
	}
	
	static void contar (int param1, int param2) throws ParametrosInvalidosException
	{
		if (param1 > param2)
			throw new ParametrosInvalidosException();

		int contagem = param2 - param1;
		for (int i = 1; i <= contagem; i++)
		{
			System.out.println("Imprimindo o número " + i);
		}
		
	}
}