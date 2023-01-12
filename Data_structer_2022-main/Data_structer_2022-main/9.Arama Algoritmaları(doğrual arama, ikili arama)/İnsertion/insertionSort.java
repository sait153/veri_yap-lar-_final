class insertionSort{//isimli bir sınıf tanımlanmıştır.
    void insertionSort(int dizi[])/*simli bir void metod tanımlanmıştır. 
    Bu metod bir parametre olarak integer tipinde bir dizi almaktadır. */
    {
        int i,k,y;
        int n=dizi.length;/*  "n" isimli bir değişken tanımlanmış ve dizinin uzunluğu bu değişkene atanmıştır.*/
        for(k=1; k<n; k++)//Bir "for" döngüsü başlatılmıştır ve dizinin 1. elemanından başlayarak tüm elemanları dönecektir.
        {
            y=dizi[k];// "y" isimli bir değişken tanımlanmış ve dizinin k. elemanı bu değişkene atanmıştır.
            for(i=k-1; i>=0 && y<dizi[i]; i--)
                dizi[i+1]=dizi[i];/**ir iç içe "for" döngüsü başlatılmıştır ve "i" değişkeni ile dönecektir. Bu döngü, dizinin k-1. 
            elemanından başlayarak tüm elemanları dönecektir. */
            dizi[i+1]=y;/*"i" değişkeni 1 azaltılır. */
        }
    }

    void diziyiYazdir(int dizi[])
    { 
        int n = dizi.length; 
        for (int i=0; i<n; ++i)/*İç içe "for" döngüsü sonlandığında, y değişkeni i+1. indexte yerleştirilir. */
            System.out.print(dizi[i] + " "); /*diziyiYazdir" isimli bir metod tanımlanmıştır. Bu metod bir parametre 
            olarak integer tipinde bir dizi almaktadır. */
        
            System.out.println(); 
    }// Döngü sonlandırılır.
  
    
    public static void main(String args[]) //main" methodu başlatılmıştır. Bu method programın çalışmasını başlatır.
    { 
        insertionSort ob = new insertionSort();//insertionSort" isimli bir nesne oluşturulmuş ve "ob" isimli bir değişkene atanmıştır. 
        int dizi[] = {20, 34, 13, 5, 9, 80, 1}; /*
        dizi" isimli bir integer dizisi tanımlanmış ve sırasıyla 
        20, 34, 13, 5, 9, 80, 1 değerleri atanmıştır. */
        ob.insertionSort(dizi); /*nesnesi üzerinden "insertionSort" methodu çağrılmış ve 
        "dizi" dizisi parametre olarak verilmiştir. */
        System.out.println("Sıralı Dizi: "); //Sıralı Dizi: " yazdırılır.
        ob.diziyiYazdir(dizi); //programı sonlandırır.
    } 
}
