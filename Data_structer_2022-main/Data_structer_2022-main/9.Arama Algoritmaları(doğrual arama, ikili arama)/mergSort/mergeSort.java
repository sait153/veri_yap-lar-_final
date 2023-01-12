public class mergeSort {//bir sınıf tanımlanıyor.
private int[] list;//özel dizi tanımlanıyor.

public mergeSort(int[] listToSort) {list = listToSort; }//sınıfın constructor metodu tanımlanıyor. Bu metodun görevi, sıralanması istenen dizinin list adlı özel diziye atanmasıdır.

public int[] getList() { return list; }//ir metod tanımlanıyor. Bu metodun görevi, list adlı özel dizinin döndürülmesidir.


public void sort() { list = sort(list); }//bir metod tanımlanıyor. Bu metodun görevi, list adlı özel dizinin 


private int[] sort(int[] dizi) {//bir metod tanımlanıyor. Bu metodun görevi, bir dizi alıp sıralamaktır.
    if (dizi.length == 1) //Eğer dizinin uzunluğu 1 ise dizi döndürülür.
        return dizi;//dizinin uzunluğu 1 değilse dizi ikiye bölünür.
    else 
    {
        
        int[] left = new int[dizi.length/2];//İlk bölünen dizi "left" adlı diziye atanır.
        System.arraycopy(dizi, 0, left, 0, left.length);// Satır: left dizi ekrana yazdırılır.
        
        for(int i = 0;i< dizi.length ; i++)
            System.out.print(dizi[i] + " ");
        System.out.println("");

        
        int[] right = new int[dizi.length-left.length];//dizi "left" adlı diziye atanır.
        System.arraycopy(dizi, left.length, right, 0, right.length);// left dizi ekrana yazdırılır.

        for(int i = 0;i< dizi.length ; i++)
            System.out.print(dizi[i] + " ");
        System.out.println("");
        
        
        left = sort(left);//left ve right dizileri tekrar sıralanır.
        right = sort(right);// Right dizi ekrana yazdırılır.
        
        for(int i = 0;i< dizi.length ; i++)
            System.out.print(dizi[i] + " ");
        System.out.println("");
        
        
        merge(left, right, dizi);//"merge" adlı private bir metod tanımlanıyor. Bu metodun görevi, iki diziyi ve sonuç dizisini alıp sıralamaktır.

        

        return dizi;
    }
}


private void merge(int[] left, int[] right, int[] sonuc) {
    int x = 0; int y = 0; int k = 0;// 3 index tanımlanıyor. x, y ve k
    
    while (x < left.length && y < right.length)
    { 
        if (left[x] < right[y]) 
        { 
            sonuc[k] = left[x]; x++; 
        }
        else 
        { 
            sonuc[k] = right[y]; y++; 
        }
        k++;
    }
    int[] rest; int restIndex;
    if (x >= left.length) 
    { 
        rest = right; 
        restIndex = y; 
    }
    else 
    { 
        rest = left; 
        restIndex = x; 
    }
    for (int i=restIndex; i<rest.length; i++) 
    { 
        sonuc[k] = rest[i]; 
        k++; 
    }
}

public static void main(String[] args) {
    int[] dizi = {10,35,36,98,74,56,51,2,7,9};
    System.out.println("Sırasıs:");
    for(int i = 0;i< dizi.length ; i++)
    {
        System.out.print(dizi[i] + " ");
    }
    mergeSort sortObj = new mergeSort(dizi);
    sortObj.sort();
    System.out.println("");
    System.out.println("Sıralı:");
    int [] sirali = sortObj.getList();
    for(int i = 0;i< sirali.length ; i++)
    {
        System.out.print(sirali[i] + " ");
    }
}
}
