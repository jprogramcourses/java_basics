package java_collection.arrays;

public class PruebaArrays {

	public static void main(String[] args) {

		int[] arrayInts = new int[10];
		arrayInts[5] = 12;
		
		System.out.println("Tamaño del array " + arrayInts.length);
		
		for(int i : arrayInts) {
			System.out.println("Contenido del elemento " + i);
		}

	}

}
