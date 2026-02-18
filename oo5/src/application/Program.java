package application;

public class Program {

	public static void main(String[] args) {
		
		int x = 20;
		//boxing
		Object obj = x;		
		System.out.println(obj);
		//unboxing
		int y = (int) obj;		
		System.out.println(y);
		//wrapper classes -> classes equivalentes aos tipos primitivos
		// Byte, Short, Integer ....
		// aceitam valor null, diferentemente dos tipos primitivos que não aceitam o valor null

	}

}
