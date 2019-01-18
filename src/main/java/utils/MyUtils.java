package utils;

import java.util.ArrayList;
import java.util.List;

public class MyUtils {

	public Integer sum(List<Integer> list) {
		Integer res = 0;
		for (int i = 0; i < list.size(); i++) {
			// res = res + list.get(i); // un tableau aurait été écrit comme "list[i]"
			res += list.get(i);
		}

		return res;

		/*
		 * for (int i : list){
		 * 
		 * res += i; }
		 */

	}

	public String emptyToNull(String s) {

		if(s == null || s.isEmpty()) //trim().equals("") ) // subtring(0).equals(""))retire non pas des lettres comme explique la definition officielle, ici substring(0) retire les espaces enregistrés
		{
		return null;}
		return s; // ou alors tu retournes s
	}
	
	public List<Integer> filterEvenNumbers(List<Integer> integers){
		
		List<Integer> res = new ArrayList<Integer>(); // mes résultats comprennent une Liste de nomhres entiers; elle se représente par une liste 
		for (int i = 0; i < integers.size(); i++) {
			if(integers.get(i) %2 == 0) {
				res.add(integers.get(i));
			}	
		}
		return res;
	}
	
	
	public List<Float> transformSquarePlusPointFive(List<Integer> integers){
		
		List<Float> res = new ArrayList<Float>();
		for (int i = 0; i < integers.size(); i++) {
			res.add((float) (Math.pow(integers.get(i), 2) + 0.5)); // transforme au carré et additionne 0.5
			// le (float) est ajouté car le calcul ne peut se faire entre un format int et format float
			// on "cast" le format int en float
		}
		
		return res;
	}
	
	
	public List<Integer> racine(List<Float> integers){
		
		List<Integer> res = new ArrayList<>();
		for (Float i : integers) { // a chaque boucle i recupère automatiquement le intergers.get(i)
			res.add((int)(Math.sqrt(i)));
		}
		
		return res;
	
	}

}
