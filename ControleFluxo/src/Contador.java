import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		try {
			// chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException e) {
			System.err.println("Erro: " + e.getMessage());
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) {

			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
		}

		int contagem = parametroDois - parametroUm;
		// realizar o for para imprimir os números com base na variável contagem
		System.out.println("Contagem: " + contagem);

		for (int contador = contagem; contador > 0; contador--) {
			System.out.println("Imprimindo o número " + contador);

		}
	}
}

// Controle de Fluxo - Desafio

// O sistema deverá receber dois parâmetros via terminal que representarão dois
// números inteiros, com estes dois números você deverá obter a quantidade de
// interações (for) e realizar a impressão no console (System.out.print) dos
// números incrementados, exemplo:

// Se você passar os números 12 e 30, logo teremos uma interação (for) com 18
// ocorrências para imprimir os números, exemplo: "Imprimindo o número 1",
// "Imprimindo o número 2" e assim por diante.
// Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar
// a exceção customizada chamada de ParametrosInvalidosException com a segunda
// mensagem: "O segundo parâmetro deve ser maior que o primeiro"
// Crie o projeto DesafioControleFluxo
// Dentro do projeto, crie a classe Contador.java para realizar toda a
// codificação do nosso programa.
// Dentro do projeto, crie a classe ParametrosInvalidosException que
// representará a exceção de negócio no sistema.
// Abaixo temos um trecho de código no qual você poderá seguir alterando as
// partes que contenham ??
