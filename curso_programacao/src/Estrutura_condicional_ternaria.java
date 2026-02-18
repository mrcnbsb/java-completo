
public class Estrutura_condicional_ternaria {
	public static void main(String[] args) {
//		(condicao) ? valor_se_verdadeiro : valor_se_falso;
//		(2 > 4) ? 50 : 80; => 80
//		(10 != 3) ? "Maria" : "Alex"; => "Maria"
				
//		double preco = 34.5;
//		double desconto;
//		if (preco > 20.0) {
//			desconto = preco * 0.1;
//		} else {
//			desconto = preco * 0.05;
//		}
//		System.out.printf("Desconto: R$ %.2f%n", desconto);
		
		//Operador ternário
		double preco = 34.5;
		double desconto = (preco > 20) ? preco * 0.1 : preco * 0.05;
		System.out.printf("Desconto: R$ %.2f%n", desconto);
			

	}
}
