import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		
		//declaração da lista
		List<String> list; //não aceita tipos primitivos
		
		//instanciação da lista
		list = new ArrayList<>(); //List é interface, não pode ser instanciada diretamente, mas uma classe que implementa a interface
		
		//add elemento
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2,"Marco"); //add na posição 2 sem prejudiar o restante da lista
		
		//tamanho da lista
		System.out.println(list.size());
		
		//remover elemento da lista
		list.remove("Anna"); //remove pela comparação do valor
		list.remove(1); //remove pela posição
				
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("----------");
		
		//remover por predicado: todos que começam por M
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("----------");
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("----------");
		
		//encontrar a posição de um elemento
		System.out.println("Index of Alex: " + list.indexOf("Alex"));
		System.out.println("Index of Marco: " + list.indexOf("Marco")); //quando não encontra o elemento = -1
		
		System.out.println("----------");
		
		//filtrar para ficar somente quem tem o nome iniciado por M
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		//encontrar elemento da lista que atenda a um determinado predicado: 1 elemento que começa com a letra A
		System.out.println("----------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
		
		
	}
}
