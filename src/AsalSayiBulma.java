import java.util.Scanner;

public class AsalSayiBulma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kaç sayının asal durumunu kontrol etmek istiyorsunuz: ");
		int girilecekSayiMiktari=scanner.nextInt();
		
		int[] sayilar=new int[girilecekSayiMiktari];
		int asalToplamAdet=0, asalOlmayanToplamAdet=0;
		String asalSayilar="", asalOlmayanSayilarString = "";
		boolean asalMi=true;
		
		
		for (int i = 0; i < sayilar.length; i++) {
			System.out.print((i+1)+". sayıyı giriniz: ");
			sayilar[i]=scanner.nextInt();
		}
		
		for (int item : sayilar) {
			for (int j = 2; j < sayilar.length; j++) {
				if (item%j==0) {
					asalOlmayanToplamAdet++;
					asalOlmayanSayilarString+=String.valueOf(item)+" ";
					asalMi=false;
					break;
				}
			}
			if(asalMi) {
				asalToplamAdet++;
				asalSayilar+=String.valueOf(item);
			}
			asalMi=true;
		}
		
		System.out.println("Giriş yapılan "+girilecekSayiMiktari+" adet sayıdan;\n"
		+asalToplamAdet+" adet Asal Sayı\n"
		+asalOlmayanToplamAdet+" adet Asal olmayan sayı bulunmaktadır.");
		
		System.out.println("Asal olan Sayılar: "+asalSayilar);
		System.out.println("Asal olmayan Sayılar: "+asalOlmayanSayilarString);

	}

}
