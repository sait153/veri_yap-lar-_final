public class DBList {// sınıfın tanımlanmasını 
    Nod head;/*
  "head" adlı bir Nod tipinde bir değişken tanımlar., 
    linked listin başlangıç noktasını temsil eder. */
    
    public void ekle(String sehir)//Bu metod, bir sehir adı alır ve linked liste ekler.
    {
        Nod yeniNod=new Nod();//  yeni bir düğüm oluşturur.
        yeniNod.setIsim(sehir);/*yönteme geçirilen şehir olarak yeni düğümün adını ayarlar. */
        if(head==null)/*listenin boş olup olmadığını kontrol eder ve boşsa yeni düğüm baş olur. */
        {
            head=yeniNod;
            head.setSonraki(yeniNod);
            head.setOnceki(yeniNod);
            
            return;
        }
        Nod temp=head.getOnceki();//listenin son düğümünü alır
        temp.setSonraki(yeniNod);/*yeni düğümü önceki son düğüme bağlar */
        yeniNod.setOnceki(temp);/*yeni düğümü önceki son düğüme bağlar */
        yeniNod.setSonraki(head);/*yeni düğümü ana düğüme bağlar */
        head.setOnceki(yeniNod);/*ana düğümü yeni düğüme bağlar. */
    }


    public void sil(String ad)/*Bu metod, belirtilen ada sahip bir düğümü linked list'ten siler. */
    {
        if(head==null)/*Listenin boş olup olmadığını kontrol eder ve boşsa "liste boş" yazdırır ve yöntemden çıkar. */
        {
            System.out.println("Liste boş"); return;
        }
        Nod temp=head;//geçici bir değişkene kafa atama
        while(temp.getIsim()!=ad)/*eşleşen ada sahip düğüm bulunana kadar listede yinelenir */
        {
            temp=temp.sonraki; /*önceki düğümü sonraki düğüme mürekkepler, silinecek düğümü atlar */
        }
        temp.onceki.setSonraki(temp.sonraki);/*Sonraki düğümü sonraki düğüme mürekkepler, silinecek düğümü atlar */
        temp.sonraki.setOnceki(temp.onceki);/*önceki düğümü sonraki düğüme mürekkepler, silinecek düğümü atlar */
    
    }
    public void listele()
    {
        if(head==null)//Listenin boş olup olmadığını kontrol eder ve boş ise "liste boş" yazdırır ve yöntemden çıkar.
        {
        System.out.println("liste boş");//konsola "Listesi: " yazdırır
        return;
        }

        System.out.println("Listesi: ");//baş düğümün adını ve ardından  yazdırır
        System.out.print(head.sehir+" <--> ");
        Nod temp=head.sonraki;//sonraki düğümü geçici değişkene atar
        while(temp!=head)
        /*son düğüme ulaşılana kadar listede yinelenir */
        {
            System.out.print(temp.sehir+" <--> ");
            temp=temp.sonraki;
            if(temp.sonraki==null)
                System.out.print("dddddd");
        }
    }
    
}