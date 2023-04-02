package ProjetoMequi;

import java.util.Scanner;

public class ProjetoMequi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MetodoMequi descricaoMenu = new MetodoMequi();

		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("----PROJETO MEQUI----");
		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("--SELECIONE UMA OPÇÃO---");
		System.out.println("");
		System.out.println("*******Cardápio*******");
		System.out.println("");
		System.out.println("1 - Lançamentos");
		System.out.println("2 - Brabos do Mequi");
		System.out.println("3 - Sanduiches de Carne Bovina");
		System.out.println("4 - Família Tasty");
		System.out.println("5 - Sanduiches de Frango");
		System.out.println("6 - MC Lanche Feliz");
		System.out.println("7 - Méqui 1000 ");
		System.out.println("8 - Acompanhamentos");
		System.out.println("9 - Sobremesas");
		System.out.println("10 - Bebidas Frias");
		System.out.println("11 - Café da Manhã");
		System.out.println("12 - Bebidas Quentes");
		System.out.println("13 - MC Ofertas");
		System.out.println("14 - Méqui Box ");
		System.out.println("15 - MC Café ");
		System.out.println("");
		System.out.print("Opção: ");
		int opcaoMenu1 = sc.nextInt();
		switch (opcaoMenu1) {

		case 1:
			descricaoMenu.caso1();
			int opcaoMenuSubMenu1 = sc.nextInt();

			switch (opcaoMenuSubMenu1) {
			case 1:
				descricaoMenu.mcCrispyDescricao();
				break;
			case 2:
				descricaoMenu.mcFlurryChocolateDescricao();
				break;
			case 3:
				descricaoMenu.mcFlurryMorangoDescricao();
				break;
			case 4:
				descricaoMenu.mcFlurryCarameloDescricao();
				break;
			default:
				System.out.println("OPÇÃO INCORRETA!");
				break;
			}
			break;
		case 2:
			descricaoMenu.caso2();
			int opcaoMenuSubMenu2 = sc.nextInt();
			switch (opcaoMenuSubMenu2) {
			case 1:
				descricaoMenu.braboMeltCrispy();
				break;
			case 2:
				descricaoMenu.braboBaconSalad();
				break;
			default:
				System.out.println("OPÇÃO INCORRETA!");
				break;
			}
			break;
		case 3:
			descricaoMenu.caso3();
			int opcaoMenuSubMenu3 = sc.nextInt();
			switch (opcaoMenuSubMenu3) {
			case 1:
				descricaoMenu.bigMac();
				break;
			case 2:
				descricaoMenu.duploQuarterão();
				break;
			case 3:
				descricaoMenu.quarterãoComQueijo();
				break;
			case 4:
				descricaoMenu.mcNíficoBacon();
				break;
			case 5:
				descricaoMenu.duploCheddarMcMelt();
				break;
			case 6:
				descricaoMenu.duploBurgerBacon();
				break;
			case 7:
				descricaoMenu.duploBurguerComQueijo();
				break;
			case 8:
				descricaoMenu.triploBurger();
				break;
			case 9:
				descricaoMenu.mcFiesta();
				break;
			case 10:
				descricaoMenu.cheeseburger();
				break;
			default:
				System.out.println("OPÇÃO INCORRETA!");
				break;
			}
			break;
			
		case 4:
			descricaoMenu.caso4();
			int opcaoMenuSubMenu4 = sc.nextInt();
			switch (opcaoMenuSubMenu4) {
			case 1:
				descricaoMenu.famíliaTasty();
				break;
			default:
				System.out.println("OPÇÃO INCORRETA!");
				break;
			}
			break;
			
		default:
			System.out.println("OPÇÃO INCORRETA!");
			break;
		}

		sc.close();
	}
}
