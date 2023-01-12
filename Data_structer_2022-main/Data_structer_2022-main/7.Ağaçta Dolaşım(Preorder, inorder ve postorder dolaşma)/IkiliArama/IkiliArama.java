import java.util.Scanner;//kodu, Scanner sınıfını projemize dahil eder. Bu sınıf, kullanıcının girdi almak için kullanılır.
class BinarySearch// BinarySearch isimli bir sınıf tanımlar.
{
  public static void main(String args[])//kodu, Java uygulamalarının çalışmaya başladığı main methodunu tanımlar. Bu method, programın ne yapması gerektiğini içerir.
  {
    int c, first, last, middle, n, search, array[];// kodu, sayı değişkenleri tanımlar. c, first, last, middle ve n, ikili arama algoritması için gerekli olan değişkenlerdir. search, aranacak sayıyı temsil eder. array ise, arama yapılacak olan dizidir.
 
    Scanner in = new Scanner(System.in);// kodu, kullanıcının girdi almak için bir Scanner nesnesi oluşturur.
    System.out.println("Eleman sayisini girin");//kodu, ekrandan dizinin eleman sayısını almak için kullanıcıya bir istekte bulunur.
    n = in.nextInt();//kodu, kullanıcının girdiği sayıyı n değişkenine atar.
    array = new int[n];// kodu, n elemanlı bir dizi oluşturur.
 
    System.out.println("Giris:" + n + " tane tam sayi girin");//kodu, kullanıcıya diziye elemanlarını girme isteği yapar.
 
 
    for (c = 0; c < n; c++)// kodları kullanıcı tarafından girilen elemanları diziye atar.
      array[c] = in.nextInt();

    System.out.println("Bulunacak  degeri girin");//kodu, kullanıcıya arama yapılacak olan sayıyı girme isteği yapar.
    search = in.nextInt();//kodu, kullanıcı tarafından girdi olarak alır
 
    first  = 0;//kodu, ikili arama algoritması için ilk indisi 0 olarak tanımlar.
    last   = n - 1;// kodu, ikili arama algoritması için son indisi n-1 olarak tanımlar.
    middle = (first + last)/2;// kodu, ikili arama algoritması için ortanca indisi (first + last) / 2 olarak tanımlar.
 
    while( first <= last )//kodu, ikili arama algoritmasının ana döngüsünü başlatır. Bu döngü, ilk indeks ile son indeks arasında arama yapar.
    {
      if ( array[middle] < search )//kodu, aranacak sayının ortanca indeksteki sayıdan küçük olduğu durumda, first indeksini middle + 1 olarak günceller.
        first = middle + 1;   //kodu, aranacak sayının ortanca indeksteki sayı ile eşit olduğu durumda, aranacak sayının konumunu ekrana yazdırır ve döngüden çıkar. 
      else if ( array[middle] == search )//ayının ortanca indeksteki sayı ile eşit olduğu durumda, aranacak sayının konumunu ekrana yazdırır ve döngüden çıkar.
      {
        System.out.println(search + " Bu konumda bulundu " + (middle ) + ". indexte olarak bulundu");//kodu, kullanıcıya arama yapılacak olan sayıyı girme isteği yapar.
        break;
      }
      else
         last = middle - 1;// - 1 olarak günceller.
 
      middle = (first + last)/2;//kodu, ortanca indisi yeniden hesaplar.
   }
   if (first > last)//kodu, arama yapıldıktan sonra eğer aranacak sayı bulunamazsa, kullanıcıya aranacak sayının listede olmadığını bildirir.
      System.out.println(search + " listede yok.\n");//kodu, kullanıcıya arama yapılacak olan sayıyı girme isteği yapar.
  }
}