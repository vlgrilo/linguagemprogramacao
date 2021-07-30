import java.util.*;

public class Programa {

	public static void main(String[] args) {
		
		int codigo=0;
		double valorNota=0, freteCalculado=0;
		String destino = "";
		int opEstado;
		char opSair;

		Scanner entrada = new Scanner(System.in);

		do {

			System.out.printf("[ CALCULADORA DE FRETE ]\n");

			System.out.println("\n[ OPCOES DE ESTADO ]");
			System.out.println("1 - Sao Paulo");
			System.out.println("2 - Outros");

			do {
				System.out.printf("\nDigite a opcao de Estado: ");
				
				opEstado = entrada.nextInt();

				if(opEstado == 1) {
					destino = "SP";
				}
				else if (opEstado == 2) {
					destino = "Outros";
				}
				else{
					System.out.println("Opcao invalida.");
				}

			}while(opEstado != 1 && opEstado != 2);

			System.out.printf("\nDigite o codigo do produto: ");
			codigo = entrada.nextInt();

			System.out.printf("\nDigite o valor da nota: ");
			valorNota = entrada.nextDouble();
				
			Frete frete = new Frete(valorNota);

			frete.setDest(destino);
			frete.setCode(codigo);

			if (destino.equals("SP")) {
				freteCalculado = frete.FreteSP(frete.getValue());
			}
			else {
				freteCalculado = frete.FreteOutros(frete.getValue());
			}

			System.out.println("\nFRETE CALCULADO!\n");
			System.out.println("[ Informacoes ]");

			System.out.println("* Codigo do produto: " + frete.getCode());
			System.out.println("* Destino: " + frete.getDest());
			System.out.printf("* Valor da nota com frete: %.2f", freteCalculado+frete.getValue());

			System.out.printf("\nDeseja calcular outro frete? [S/N]: ");
			opSair = entrada.next().charAt(0);

		}while(opSair == 's' || opSair == 'S');
	}
}