import java.util.Locale;
import java.util.Scanner;

public class Estruturas_repetitivas_for {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

//		quando se sabe a condição de parada		
//		for (inicio; condicao; incremento) {
//			comando 1
//			comando 2
//		}

		int n = sc.nextInt();
		int soma = 0;
		
		for (int i=0; i<n; i++) {
			soma += sc.nextInt();
		}	
		System.out.println(soma);
		sc.close();
	}
}
