package Projetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sequencial {

	public static void main(String[] args) {
		int terminar;
		Integer recebe;
		int soma = 0;
		List<Integer> sequencia = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Digite o numero: ");
			recebe = sc.nextInt();
			sequencia.add(recebe);

			System.out.println("*************************************************");
			System.out.println("Deseja adicionar mais um numero: 1-(sim) ou 2-(não): ");
			terminar = sc.nextInt();
			soma += recebe;
		} while (terminar != 2);

		System.out.println("Valor mínimo: " + Collections.min(sequencia));
		System.out.println("Valor máximo: " + Collections.max(sequencia));
		System.out.println("Número de elementos na seqüência: " + sequencia.size());
		System.out.println("Valor médio: " + (soma / sequencia.size()));
		System.out.println(sequencia.toString());

		sc.close();
	}
}
