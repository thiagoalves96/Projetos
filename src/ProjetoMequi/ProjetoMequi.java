package ProjetoMequi;

import java.util.Scanner;

public class ProjetoMequi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MetodoMequi descricaoMenu = new MetodoMequi();
		MetodoMequi9ao15 descricaoMenu2 = new MetodoMequi9ao15();

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
		case 5:
			descricaoMenu.caso5();
			int opcaoMenuSubMenu5 = sc.nextInt();
			switch (opcaoMenuSubMenu5) {
			case 1:
				descricaoMenu.mcCrispyChickeLegend();
				break;
			case 2:
				descricaoMenu.mcCrispyChickeDeluxe();
				break;
			case 3:
				descricaoMenu.mcChickenBacon();
				break;
			case 4:
				descricaoMenu.mcChicken();
				break;
			case 5:
				descricaoMenu.mcChickenJr();
				break;
			default:
				System.out.println("OPÇÃO INCORRETA!");
				break;
			}
			break;
		case 6:
//			descricaoMenu.caso6();
//			int opcaoMenuSubMenu6 = sc.nextInt();
//			switch (opcaoMenuSubMenu6) {
//			case 1:
//				descricaoMenu.sub6
//				break;
//			default:
//				System.out.println("OPÇÃO INCORRETA!");
//				break;
//			}
			break;
		case 7:
			descricaoMenu.caso7();
			int opcaoMenuSubMenu7 = sc.nextInt();
			switch (opcaoMenuSubMenu7) {
			case 1:
				descricaoMenu.sub7n1();
				break;
			case 2:
				descricaoMenu.sub7n2();
				break;
			case 3:
				descricaoMenu.sub7n3();
				break;
			case 4:
				descricaoMenu.sub7n4();
				break;
			case 5:
				descricaoMenu.sub7n5();
				break;
			case 6:
				descricaoMenu.sub7n6();
				break;
			default:
				System.out.println("OPÇÃO INCORRETA!");
				break;
			}
			break;
		case 8:
			descricaoMenu.caso8();
			int opcaoMenuSubMenu8 = sc.nextInt();
			switch (opcaoMenuSubMenu8) {
			case 1:
				descricaoMenu.sub8n1();
				break;
			case 2:
				descricaoMenu.sub8n2();
				break;
			case 3:
				descricaoMenu.sub8n3();
				break;
			case 4:
				descricaoMenu.sub8n4();
				break;
			case 5:
				descricaoMenu.sub8n5();
				break;
			case 6:
				descricaoMenu.sub8n6();
				break;
			case 7:
				descricaoMenu.sub8n7();
				break;
			case 8:
				descricaoMenu.sub8n8();
				break;
			case 9:
				descricaoMenu.sub8n9();
				break;
			case 10:
				descricaoMenu.sub8n10();
				break;
			default:
				System.out.println("OPÇÃO INCORRETA!");
				break;
			}
			break;
		case 9:
			descricaoMenu2.caso9();
			int opcaoMenuSubMenu9 = sc.nextInt();
			switch (opcaoMenuSubMenu9) {
			case 1:
				descricaoMenu2.sub9n1();
				break;
			case 2:
				descricaoMenu2.sub9n2();
				break;
			case 3:
				descricaoMenu2.sub9n3();
				break;
			case 4:
				descricaoMenu2.sub9n4();
				break;
			case 5:
				descricaoMenu2.sub9n5();
				break;
			case 6:
				descricaoMenu2.sub9n6();
				break;
			case 7:
				descricaoMenu2.sub9n7();
				break;
			case 8:
				descricaoMenu2.sub9n8();
				break;
			case 9:
				descricaoMenu2.sub9n9();
				break;
			case 10:
				descricaoMenu2.sub9n10();
				break;
			case 11:
				descricaoMenu2.sub9n11();
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
