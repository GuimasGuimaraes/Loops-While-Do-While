
public class LoopFor {

	public static void main(String[] args) {

		for (int i = 0; i < 200; i++) {
			System.out.println("Contando o i: " + i);
		}

		for (int count = 0; count <= 10; count += 2) {
			System.out.println("Contando o count " + count);
		}

		int soma = 0;
		for (int i = 1; i < 5; soma += i++) {
			System.out.println("i tem valor de :" + i);
		}

	}

}
