package Week1;
import java.util.Iterator;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example8();
	}

	private static void Example1() {

		// En büyük sayıyı bulma

		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 27;

		int enBuyuk = sayi1;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}

		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}

		System.out.println("En Buyuk Sayi : " + enBuyuk);
	}

	private static void Example2() {
		// Not uygulaması - switch örneği

		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel geçtiniz");
			break;
		case 'B':
			System.out.println("Çok güzel geçtiniz");
			break;
		case 'C':
			System.out.println("İyi geçtiniz");
			break;
		case 'D':
			System.out.println("Fena değil geçtiniz");
			break;
		case 'E':
			System.out.println("Maalesef kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
		}
	}

	private static void Example3() {
		String mesaj = "Bugün hava çok güzel";
		System.out.println(mesaj);

		System.out.println("Eleman Sayısı : " + mesaj.length());
		System.out.println("5. Eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" .Yaşasın!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.endsWith("e"));
	}

	private static void Example4() {
		// Sayı asal mı?

		int sayi = 18;
		int count = 0;

		if (sayi < 1) {
			System.out.println("geçersiz sayi");
			return;
		}
		
		if (sayi == 1) {
			System.out.println("Sayi asal değildir");
			return;
		}

		for (int i = 2; i <= sayi; i++) {
			if (sayi % i == 0) {
				count++;
			}
		}

		if (count == 1)
			System.out.println(sayi + " sayısı asaldır");
		else
			System.out.println(sayi + " sayısı asal değildir");

	}

	private static void Example5() {
		
		char harf = 'A';
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("İnce sesli harf");
			break;
		default:
			System.out.println("Sessiz harf");
			
		}
	}

	private static void Example6() {
		// Mükemmel Sayı
		
		int number = 21;
		int total = 0;
		
		for (int i = 1; i < number; i++) {
			if(number % i == 0) {
				total += i;
			}
		}
		
		if(total == number)
			System.out.println(number + " mükemmel sayıdır");
		else
			System.out.println(number + " mükemmel sayı değildir");
			
	}

    private static void Example7() {
    	//Arkadaş sayılar
    	int number = 220;
    	int total = 0;
    	int total2 = 0;
    	
    	for(int i=1; i<number; i++){
    		if(number % i == 0) {
    			total += i;
    		}
    	}
    	
    	for(int i=1; i<total; i++){
    		if(total % i == 0) {
    			total2 += i;
    		}
    	}
    	
    	if(number == total2){
    		System.out.println(number + " - " + total + " arkadaş sayılardır");
    	}
    	else {
    		System.out.println(number + " - " + total + " arkadaş sayı değillerdir");
    	}
    		
    }
	
    private static void Example8() {
    	// Sayı Bulma
    	
    	int[] sayilar = new int[] {1,2,5,7,9,0};
    	int aranacak = 5;
    	
    	boolean found = false;
    	for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i] == aranacak)
				found = true;
		}
    	
    	if(found)
    		System.out.println("Sayı vardır");
    	else
    		System.out.println("Sayı yoktur");
    }
}
