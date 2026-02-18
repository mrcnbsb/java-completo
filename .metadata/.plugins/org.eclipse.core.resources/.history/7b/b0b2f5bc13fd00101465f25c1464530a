package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program2 {

	public static void main(String[] args) {

		// operações de conjunto

		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		// union
		Set<Integer> c = new TreeSet<>(a); //'c' será uma cópia de 'a'
		c.addAll(b); //tudo dos dois
		System.out.println(c);
		
		// intersection
		Set<Integer> d = new TreeSet<>(a); //'d' será cópia de 'a'
		d.retainAll(b);//somente os comuns
		System.out.println(d);
		
		// difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b); //tudo que tem no primeiro e não tem no segundo
		System.out.println(e);

	}
}
