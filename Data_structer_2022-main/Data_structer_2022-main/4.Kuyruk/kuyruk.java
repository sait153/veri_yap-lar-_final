class kuyruk{//DİZİ KUYRUK KODLARI
    private int boyut;//boyutu almak için kullanılır.
    private int[] kuyrukDizi;//dizi tipinde kuyruk tanımlanır
    private int bas;//kuyruğun başı
    private int son;//kuyruğun sonu
    private int elemanSayisi;
    public kuyruk(int s){
        /*Bu metot, kuyruk nesnesi oluşturulduğunda çağrılır. Parametre olarak 
        verilen s değeri kuyruğun boyutunu belirler. Aynı zamanda kuyrukDizi adlı 
        dizi oluşturulur ve boyutu s olarak belirlenir. Bas ve son değişkenleri sıfırlandı.
         elemanSayisi değişkeni 0 olarak belirlenir. */
        boyut=s;
        kuyrukDizi=new int[boyut];
        bas=0;
        son=-1;
        elemanSayisi=0;
    }
    
    public void ekle(int e){
        /*Bu metot, kuyruğa bir eleman ekler. Eklenecek eleman e olarak parametre olarak alır. 
        Eğer son değişkeni kuyruk dizisinin boyutunun bir azına eşitse -1 yapılır, 
        kuyruk dizisi sonuna eklenir, son bir arttırılır ve elemanSayisi bir arttırılır. */
        if(son==boyut-1)
            son=-1;
        kuyrukDizi[++son]=e;
        elemanSayisi++;
    }

    
    public int cikart(){
        int tmp=kuyrukDizi[bas++];
        if(bas==boyut)
            bas=0;
        elemanSayisi--;
        return tmp;
    }
    /*u metot, kuyruğun boş olup olmadığını kontrol eder ve boşsa true, doluysa false değerini döndürür. */
    public boolean bosmu(){
        return(elemanSayisi==0);
    }

}