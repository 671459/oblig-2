package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}

	
	// b)
	public static String tilStreng(int[] tabell) {
		
		String tab = "[";
		for (int i = 0; i < tabell.length; i++) {
			tab += tabell[i];
			if (i < (tabell.length - 1))
				tab += ",";
		}
		tab += "]";
		return tab;
	}

	
	// c)
	// vanlig for-løkke
	public static int summerFor(int[] tabell) {
		
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	// while-løkke
	public static int summerWhile(int[] tabell) {
		
		int sum = 0;
		int i = 0;
		while (i < tabell.length){
			sum += tabell[i];
			i++;
		}
		return sum;
	}

	// utvidet for-løkke
	public static int summerUtvFor(int[] tabell) {
		
		int sum = 0;
		for (int tab: tabell) {
			sum += tab;
		}
		return sum;
	}

	
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		boolean result = false;
		for (int tab: tabell) {
			if (tab == tall)
				result = true;
		}
		return result;
	}

	
	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int result = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				result = i;
				break;
			}
		}
		return result;
	}

	
	// f)
	public static int[] reverser(int[] tabell) {
		int[] revTab = new int[tabell.length];
		int revI = (tabell.length - 1);
		for (int i = 0; i < tabell.length; i++) {
			revTab[revI] = tabell[i];
			revI--;
		}
		return revTab;
	}

	
	// g)
	public static boolean erSortert(int[] tabell) {
		boolean result = true;
		if (tabell.length != 0) {
			int check = tabell[0];
			for (int tab: tabell) {
				if (check > tab) {
					result = false;
					break;
				}
				check = tab;
			}
		}
		return result;
	}

	
	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] result = new int[(tabell1.length + tabell2.length)];
		int pos = 0;
		for (int i: tabell1) {
			result[pos] = i;
			pos++;
		}
		for (int i: tabell2) {
			result[pos] = i;
			pos++;
		}
		return result;
	}
}
