package odevler;

public class ArraysDemo {

	public static void main(String[] args) {
		String ogrenci1 = "Babür";
		String ogrenci2 = "Dino";
		String ogrenci3 = "Naşuk";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		System.out.println("----------------");
		
		String[] ogrenciler = new String[3];
		ogrenciler[0]= "Babür";
		ogrenciler[1]="Dino";
		ogrenciler[2]="Naşuk";
		
		for (int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("----------------");
		
		for (String ogrenci: ogrenciler) {
			System.out.println(ogrenci); 
		}

	}

}
