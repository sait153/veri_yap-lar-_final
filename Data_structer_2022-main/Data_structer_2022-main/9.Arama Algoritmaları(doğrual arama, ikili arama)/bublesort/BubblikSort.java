//Bubble sort, en basit sıralama algoritmalarından biridir. Karşılaştırma temelli olan bu algoritmada, listedeki her bir eleman yanındaki eleman ile karşılaştırılır.
class BubbleSort{//u satır, sınıfın yükünü sağlar. Sınıf adı "bubbleSort" olarak belirlenmiştir.
    void bubbleSort(int dizi[])//Bu satır, bir dizi alır ve diziyi bubble sort yöntemi ile sıralar.
    {
        int n= dizi.length;//dizinin uzunluğunu n değişkenine atar
        for (int i=0;i<n-1;++i){/*dış döngü başlar ve n-1 kez çalışır, diziyi yineler ve her değeri 
            bir sonrakiyle karşılaştırır*/
                for (int j=0;j<n-i-1;++j){/*ç döngü başlar ve dizinin sonunda zaten sıralanmış öğelerin 
                    yeniden yapılmasını önlemek için n-1-i kez çalışır */
                if(dizi[j]>dizi[j+1])//mevcut eleman bir sonrakinden büyükse
                {
                int temp=dizi[j];//geçerli öğeyi bir geçici değişkene atar
                dizi[j]=dizi[j+1];//sonraki öğeyi geçerli öğeye atar
                dizi[j+1]=temp;//sonraki öğeye geçici değişken atar
                }
                System.out.println(i+1+".asama");//i+1'inci yinelemeyi yazdırır
            }
        }
    }
    
    public static void main(String args[]){//Bu metod, dizinin sıralanmasını ve sonuç ekranlarını yazdırır.
        
        BubbleSort bs = new BubbleSort();//sınıfın bir nesnesini oluşturur.
        int dizi[]={20,34,13,5,9,80,1};//bir dizi oluşturur
        bs.bubbleSort(dizi);//diziyi sıralayan işlevi çağırır.
        System.out.print("Sirali Dizi");//Sıralı Dizi" yazdırır
        int n=dizi.length;
        for (int i=0;i<n;++i//dizi boyunca döngüler yapar ve öğeyi yazdırır
        ){
            System.out.print(dizi[i]+" ");
        System.out.println();//eni bir hat yaparişlevi kapatır
    }
    
    }
    }