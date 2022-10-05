package odevler2;

public class methods {

	public static void main(String[] args) {
		sayıBulmaca();
		sayıBulmaca();
		sayıBulmaca();
		sayıBulmaca();
		sayıBulmaca();

	}
	
	public static void sayıBulmaca() {
		int[] sayilar = new int[] { 1, 2, 3, 5, 7, 9, 0 };
		int aranacak = 3;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			mesajVer("Sayı mevcuttur: "+aranacak);
		} else {
			mesajVer("Sayı mevcut değildir: " +aranacak);
		}
	}
	//parametreliMetod
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
		
	}

}
