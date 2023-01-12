import java.util.Scanner;//Java'da kullanıcıdan veri almak için kullanabileceğiniz Scanner sınıfını içerecek bir kütüphaneyi ekler.

public class LinearSearch {// Programın sınıfını tanımlar. Programın adı LinearSearch'dir.
  public static int linearSearch(int[] array, int x) {// Linear arama fonksiyonunun başlangıcı. Bu fonksiyon, iki
                                                      // parametre alır: aranacak dizi ve aranacak sayı. Fonksiyon int
                                                      // türünde bir değer döndürür.
    for (int i = 0; i < array.length; i++) {// Dizinin tüm elemanlarını kontrol etmek için bir döngü oluşturulur. i
                                            // değişkeni 0 ile başlar ve dizinin boyutu kadar devam eder.
      if (array[i] == x) {// Eğer dizinin i-inci elemanı aranan sayıya eşit ise,
        return i;// Fonksiyon, aranan sayının dizideki indexini döndürür.
      } // if bloğu sonlandırılır.
    }
    return -1;// Eğer aranan sayı dizide bulunamazsa, fonksiyon -1 değerini döndürür.
  }// linearSearch fonksiyonu sonlandırılır.

  public static void main(String[] args) {// Programın çalıştırılacağı ana metodun başlangıcı.
    Scanner scanner = new Scanner(System.in);// Kullanıcıdan veri almak için Scanner nesnesi oluşturulur.
    System.out.print("Bir Dizi giriniz: ");// Kullanıcıya bir dizi girmesi için bir talimat verilir.
    int size = scanner.nextInt();// Kullanıcıdan dizinin boyutu alınır.
    int[] array = new int[size];// Dizi, verilen boyut kadar bellekte oluşturulur.
    for (int i = 0; i < size; i++) {// Dizinin elemanlarını almak için bir döngü oluşturulur.
      System.out.print("Lütfen bir eleman sayısı" + (i + 1) + ": ");// Kullanıcıya belirli bir elemanın girilmesi için
                                                                    // talimat verilir. i değişkeni dizinin kaçıncı
                                                                    // elemanının girileceğini gösterir.
      array[i] = scanner.nextInt();// Kullanıcıdan girilen eleman dizinin i-inci elemanı olarak atanır.
    } // Döngü sonlandırılır.
    System.out.print("Lütfen bir Aranacak elamanı gir: ");
    int x = scanner.nextInt();// Kullanıcıya aranacak sayının girilmesi için bir talimat verilir.
    int result = linearSearch(array, x);// Kullanıcı tarafından girilen sayı x değişkenine atanır.
    if (result == -1) {// Eğer arama sonucu -1 dönerse,
      System.out.println("elemani yok");// Kullanıcıya elemanın dizideki index numarası bildirilir.
    } else {// if else bloğu sonlandırılır.
      System.out.println("eleman index numarası " + result);// Kullanıcıya elemanın dizideki index numarası bildirilir.
    }
  }
}
