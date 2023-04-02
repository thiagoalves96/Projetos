package ProjetoMequi;

public class MetodoMequi {

	// Menu caso 1
	public void caso1() {
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 1---");
		System.out.println("");
		System.out.println("*******LANÇAMENTOS*******");
		System.out.println("");
		System.out.println("1 - McCrispy Chicken Legend");
		System.out.println("2 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Chocolate");
		System.out.println("3 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Morango");
		System.out.println("4 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Caramelo");
		System.out.println("");
		System.out.println("--SELECIONE UMA OPÇÃO---\n");
	}

	// Submenu do caso 1
	public void lacamento() {
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 1--- \n" + "*******LANÇAMENTOS*******\n"
				+ "1 - McCrispy Chicken Legend\n" + "2 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Chocolate\n"
				+ "3 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Morango\n"
				+ "4 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Caramelo\n" + "\n--SELECIONE UMA OPÇÃO---\n");
	}

	public void mcCrispyDescricao() {
		System.out.println("McCrispy Chicken Legend\n"
				+"\n"
	            + "926 kcal\n"
				+ "Composto por pão tipo brioche com batata, molho do CBO, cebola crispy, bacon em fatias, \n"
				+ "alface americana, queijo sabor cheddar\n"
				+ " e carne 100% de peito de frango, temperada e empanada.1");
	}

	public void mcFlurryChocolateDescricao() {
		System.out.println("McFlurry Trufa Lingua de Gato DUO Kopenhagen Chocolate\n" + "319 kcal\n" + "\n"
				+ "O novo McFlurry promete toda qualidade que só o Méqui e a Kopenhagen podem \n"
				+ "oferecer! A sobremesa é composta por espetaculares trufas Língua de Gato \n" + "DUO Kopenhagen, "
				+ "bebida láctea sabor baunilha e cobertura sabor chocolate.");
	}

	public void mcFlurryMorangoDescricao() {
		System.out.println("McFlurry Trufa Lingua de Gato DUO Kopenhagen Morango\n" + "479 kcal\n" + "\n"
				+ "O novo McFlurry promete toda qualidade que só o Méqui e a Kopenhagen podem \n"
				+ "oferecer! A sobremesa é composta por espetaculares trufas Língua de Gato DUO \n" + "Kopenhagen, "
				+ "bebida láctea sabor baunilha e cobertura de morango.");
	}

	public void mcFlurryCarameloDescricao() {
		System.out.println("McFlurry Trufa Lingua de Gato DUO Kopenhagen Caramelo\n" + "325 kcal\n" + "\n"
				+ "O novo McFlurry promete toda qualidade que só o Méqui e a Kopenhagen podem \n"
				+ "oferecer! A sobremesa é composta por espetaculares trufas Língua de Gato DUO \n"
				+ "Kopenhagen, bebida láctea sabor baunilha e cobertura de caramelo.");
	}

	// Menu Caso 2
	public void caso2() {
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 2 ---");
		System.out.println("");
		System.out.println("******* Brabos do Méqui *******");
		System.out.println("");
		System.out.println("1 - Brabo Melt Crispy");
		System.out.println("2 - Brabo Bacon Salad");
		System.out.println("");
		System.out.println("--SELECIONE UMA OPÇÃO---\n");
	}

	// Submenu do caso 2
	public void braboBaconSalad() {
		System.out.println("Brabo Bacon Salad\n" + "1064 kcal\n"
				+ "Composto pelo nosso pão tipo brioche, hambúrguer de carne 100% bovina, \n"
				+ "a nova Méquinese, exclusiva maionese especial com sabor de carne defumada, alface, \n"
				+ "tomate, fatias de bacon e queijo sabor cheddar.\n");
	}

	public void braboMeltCrispy() {
		System.out.println("Brabo Melt Crispy\n" + "1057 kcal\n"
				+ "Delicioso molho lácteo cremoso sabor cheddar, hambúrguer de carne 100% \n"
				+ "bovina, a nova Méquinese, exclusiva maionese especial com sabor de carne \n"
				+ "defumada, cebola crispy, fatias de bacon, queijo sabor cheddar, tudo isso no pão tipo \n"
				+ "brioche trazendo uma explosão de sabores a cada mordida!");
	}

	// Menu Caso 3
	public void caso3() {
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 3 ---");
		System.out.println("");
		System.out.println("******* Sanduíches de Carne Bovina *******");
		System.out.println("");
		System.out.println("1 - Big Mac");
		System.out.println("2 - Duplo Quarterão");
		System.out.println("3 - Quarterão com Queijo");
		System.out.println("4 - McNífico Bacon");
		System.out.println("5 - Duplo Cheddar McMelt");
		System.out.println("6 - Duplo Burger Bacon");
		System.out.println("7 - Duplo Burguer com Queijo");
		System.out.println("8 - Triplo Burger");
		System.out.println("9 - McFiesta");
		System.out.println("10 - Cheeseburger");
		System.out.println("");
		System.out.println("--SELECIONE UMA OPÇÃO---\n");
	}

	// Submenu do caso 3
	public void bigMac() {
		System.out.println("Big Mac\n" + "503 kcal\n" + "\n"
				+ "Dois hambúrgueres (100% carne bovina), alface americana, queijo sabor cheddar, molho especial, \n"
				+ "cebola, picles e pão com gergelim.");
	}

	public void duploQuarterão() {
		System.out.println("Duplo Quarterão\n" + "762 kcal\n" + "\n"
				+ "Dois hambúrgueres (100% carne bovina), mostarda, ketchup, cebola, \n"
				+ "queijo sabor cheddar e pão com gergelim.");
	}

	public void quarterãoComQueijo() {
		System.out.println("Quarterão com Queijo\n" + "523 kcal\n" + "\n"
				+ "Um hambúrguer (100% carne bovina), queijo sabor cheddar, picles, \n"
				+ "cebola, ketchup, mostarda e pão com gergelim.");
	}

	public void mcNíficoBacon() {
		System.out.println("McNífico Bacon\n" + "571 kcal\n" + "\n"
				+ "Um hambúrguer (100% carne bovina), bacon, alface americana, cebola, \n"
				+ "queijo sabor cheddar, tomate, maionese, ketchup, mostarda e pão com gergelim.");
	}

	public void duploCheddarMcMelt() {
		System.out.println("Duplo Cheddar McMelt\n" + "786 kcal\n" + "\n"
				+ "Dois hambúrgueres (100% carne bovina), molho lácteo cremoso sabor cheddar, \n"
				+ "cebola ao molho shoyu e pão escuro com gergelim.");
	}

	public void duploBurgerBacon() {
		System.out.println("Duplo Burger Bacon\n" + "447 kcal\n" + "\n"
				+ "Dois hambúrgueres (100% carne bovina), queijo sabor cheddar, cebola, \n"
				+ "fatias de bacon, ketchup, mostarda e pão com gergelim.");
	}

	public void duploBurguerComQueijo() {
		System.out.println("Duplo Burguer com Queijo\n" + "478 kcal\n" + "\n"
				+ "Dois hambúrgueres, uma explosão de sabor. Dois deliciosos hambúrgueres de carne 100%\n"
				+ "bovina, queijo sabor cheddar derretido, picles, cebola picada, ketchup, mostarda e pão com gergelim.");
	}

	public void triploBurger() {
		System.out.println("Triplo Burger\n" + "559 kcal\n" + "\n"
				+ "Três hambúrgueres (100% carne bovina), queijo sabor cheddar, cebola, picles, ketchup, mostarda e pão com gergelim.");
	}

	public void mcFiesta() {
		System.out.println("McFiesta\n" + "272 kcal\n" + "\n"
				+ "Hambúrguer de carne 100% bovina, alface, tomate e maionese no pão quentinho.");
	}

	public void cheeseburger() {
		System.out.println("Cheeseburger\n" + "302 kcal\n" + "\n"
				+ "Um hamburguer (100% carne bovina), queijo sabor cheddar, cebola, picles, ketchup, mostarda e pão sem gergelim.");
	}

	//Menu caso 4
	public void caso4() {
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 4 ---");
		System.out.println("");
		System.out.println("******* Família Tasty *******");
		System.out.println("");
		System.out.println("1 - Família Tasty ");
		System.out.println("");
		System.out.println("--SELECIONE UMA OPÇÃO---\n");
		
	}
	// Submenu caso 4
	public void famíliaTasty() {
		System.out.println("Big Tasty\n"
				+ "944 kcal\n"
				+ "\n"
				+ "Um hambúrguer (100% carne bovina), queijo sabor emental, tomate, alface americana, cebola, molho Tasty e pão com gergelim.");

		
	}
}
