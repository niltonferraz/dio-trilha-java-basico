import java.util.Scanner;

public class Main {

	private final static Scanner scanner = new Scanner(System.in);

	private final static PetMachine petMachine = new PetMachine();

	public static void main(String[] args) {

		int option = -1;

		do {
			System.out.println("===Escolha uma das opções===");
			System.out.println("1 - Dar banho no pet");
			System.out.println("2 - Abastecer a máquina com água");
			System.out.println("3 - Abastecer a máquina com shampoo");
			System.out.println("4 - Verifica água da máquina");
			System.out.println("5 - Verifica shampoo da máquina");
			System.out.println("6 - Verificar se tem pet na máquina");
			System.out.println("7 - Colocar pet na máquina");
			System.out.println("8 - Retirar pet da máquina");
			System.out.println("9 - Limpar a máquina");
			System.out.println("0 - sair");
			option = scanner.nextInt();

			switch (option) {
			case 1:
				petMachine.takeAShower();
				break;

			case 2:
				setWater();
				break;

			case 3:
				setShampoo();
				break;

			case 4:
				verifyWater();
				break;

			case 5:
				verifyShampoo();
				break;

			case 6:
				checkIfHasPetInMachine();
				break;

			case 7:
				setPetInPetMachine();
				break;
			case 8:
				petMachine.removePet();
				break;

			case 9:
				petMachine.wash();
				break;

			case 0:
				System.exit(0);
				break;

			default:
				System.out.println("Opção inválida");
			}
		} while (true);

	}

	private static void setWater() {
		System.out.println("Tentando colocar água na máquina");
		petMachine.addWater();
	}

	private static void setShampoo() {
		System.out.println("Tentando colocar shampoo na máquina");
		petMachine.addShampoo();
	}

	private static void verifyWater() {
		{
			int amount = petMachine.getWater();
			System.out.println("A máquina está no momento com " + amount + " litros(s) de água");
		}
		;
	}

	private static void verifyShampoo() {
		{
			int amount = petMachine.getShampoo();
			System.out.println("A máquina está no momento com " + amount + " litros(s) de shampoo");
		}
		;
	}

	private static void checkIfHasPetInMachine() {
		boolean hasPet = petMachine.hasPet();
		System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
	}

	public static void setPetInPetMachine() {
		String name = "";
		while (name == null || name.isEmpty()) {
//			scanner.useDelimiter("\\n");
			System.out.println("Informe o nome do pet");
			name = scanner.next();
		}

		Pet pet = new Pet(name);
		petMachine.setPet(pet);
	}
}
