package application;

public class For_each {

	public static void main(String[] args) {
		
		//for(Tipo apelido : colecao){
		//	comando1
		//	comando2
		//}
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		for(int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("----------");
		
		//for_each -> 'para cada objeto obj contido no vetor vect faça'
		for(String obj : vect) {
			System.out.println(obj);
		}

	}
}
