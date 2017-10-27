import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Fusion {
	/*
	 * private static <T extends Comparable<T>> T myMax(T first, T... args) { T
	 * imax= first; for (T i : args) { if (i.compareTo(imax) == 1) { imax = i; } }
	 * return imax; } public static void main(String[] args) { // TODO
	 * Auto-generated method stub System.out.println(myMax(42,1664)); //1664
	 * System.out.println(myMax(2014,86,13)); //2014
	 * System.out.println(myMax(8.6,16.64)); //16.64
	 * System.out.println(myMax("Denis", "Cornaz")); //Denis
	 * //System.out.println(myMax(8.6, "Denis")); //ne doit pas }
	 */
	// EXO1
	private static void print(List<?> list) {
		for (Object o : list)
			System.out.println(o);
	}

	// EXO02
	/*
	 * private static void myChar(List<? extends CharSequence> list) {
	 * 
	 * for(CharSequence i : list) {
	 * 
	 * System.out.println( i.length()); }
	 * 
	 * 
	 * }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * List<CharSequence> list=Arrays.asList("foo", "toto"); print(list);
	 * myChar(list); }
	 */

	/* EXO4
	public static  List<Integer> listLength(List<? extends CharSequence> list) {
		ArrayList<Integer> length = new ArrayList<>(); // length sera super d'une classe
		for (int i = 0; i < list.size(); i++) {
			CharSequence seq =list.get(i); // seq sera extends d'une classe
			length.add(seq.length());
		}
		return length;
	}

	public static void main(String[] args) {
		List<String> l = Arrays.asList("colonel", "reyel");
		System.out.println(listLength(l));
	}
*/
	
	// EXO 4
	
	public static <T>List<T> fusion(List<? extends T> l1, List<? extends T> l2){
		// 
		
		if(l1.size()!=l2.size())
			throw new IllegalArgumentException();
		if(l1.isEmpty())
			return Collections.EMPTY_LIST;
		
		//
		
		Iterator<? extends T> it1 = l1.iterator();
		Iterator<? extends T> it2 = l2.iterator();
		
		List <T> ret = new ArrayList<>();
		while (it1.hasNext()) {
			ret.add(it1.next());
			ret.add(it2.next());
		}
		
		return ret;
		
		
	}
}
