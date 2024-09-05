public class Main {
	public static void main(String[] args) {
		System.out.println("Teste 1: " + fibonacciSequence(9));
		System.out.println("Teste 2: " + charExists("Target"));
	}

	/**
	 * Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores
	 * anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde,
	 * informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado
	 * pertence ou não a sequência.
	 */
	public static String fibonacciSequence(int number) {
		int x = 0;
		int y = 1;

		if (number == x || number == y) return "O valor " + number + " faz parte da sequencia de Fibonacci";

		int next = x + y;
		while (next <= number) {
			if (next == number) return "O valor " + number + " faz parte da sequencia de Fibonacci";

			x = y;
			y = next;
			next = x + y;
		}

		return "O valor " + number + " não faz parte da sequencia de Fibonacci";
	}

	/**
	 * Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de
	 * informar a quantidade de vezes em que ela ocorre.
	 */
	public static String charExists(String str) {
		int amount = 0;
		boolean isExists = false;

		for (int i = 0; i < str.length(); i++) {
			char character = str.charAt(i);

			if (character == 'a' || character == 'A') {
				amount++;
				isExists = true;
			}
		}

		return (isExists)
				? "A String \"" + str + "\" contem o caractere \"a\", desprezando maiúsculas e minúsculas, em quantidade de " + amount
				: "A String \"" + str + "\" NÃO contem o caractere \"a\", desprezando maiúsculas e minúsculas";
	}
}