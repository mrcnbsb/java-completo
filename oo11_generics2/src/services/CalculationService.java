package services;

import java.util.List;

public class CalculationService {
	
	public static <T extends Comparable<T>> T max(List<T> list) {
//	public static Integer max(List<Integer> list) {
//		//exemplo com inteiro
//		if(list.isEmpty()) { //programação defensiva
//			throw new IllegalStateException("List can't be empty");
//		}
//		Integer max = list.get(0);
//		for(Integer item : list) {
//			if(item.compareTo(max) > 0) {
//				max = item;
//			}
//		}
//		return max;
		
		//exemplo com qq tipo
		if(list.isEmpty()) { //programação defensiva
			throw new IllegalStateException("List can't be empty");
		}
		T max = list.get(0);
		for(T item : list) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}

}
