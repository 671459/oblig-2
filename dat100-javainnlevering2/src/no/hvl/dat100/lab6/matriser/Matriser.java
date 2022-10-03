package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] tab: matrise) {
			for (int i: tab) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}
	}
	

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String result = "";
		for (int[] tab: matrise) {
			for (int i: tab) {
				result += i + " ";
			}
			result += "\n";
		}
		return result;
	}

	
	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int ax1 = 0;
		for (int[] tab: matrise) {
			ax1++;
		}
		for (int j = 0; j < ax1; j++) {
			for (int i = 0; i < matrise[j].length; i++) {
				matrise[j][i] *= tall;
			}
		}
		return matrise;
	}

	
	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean result = false;
		if (a == b) {
			result = true;
		}
		return result;
	}
	
	
	// e)
	public static int[][] speile(int[][] matrise) {
		
	/*	final int[][] MATRISE = matrise;
		int[][] result = MATRISE;
		System.out.println(MATRISE[0][1]);
		result[0][1] = MATRISE[1][0];
		System.out.println(MATRISE[0][1]);
		result[0][2] = MATRISE[2][0];
		result[1][0] = MATRISE[0][1];
		result[1][2] = MATRISE[2][1];
		result[2][0] = MATRISE[0][2];
		result[2][1] = MATRISE[1][2];
		
		skrivUt(result);
		return result;
		
	*/
		throw new UnsupportedOperationException("speile ikke implementert");
	}

	
	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		throw new UnsupportedOperationException("multipliser ikke implementert");
	}
}
