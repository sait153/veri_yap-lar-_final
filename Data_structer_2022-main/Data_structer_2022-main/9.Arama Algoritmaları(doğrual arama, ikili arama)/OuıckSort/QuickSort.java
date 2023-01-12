class QuickSort //adlı yeni bir sınıfı tanımlar.
{ 
    int partition(int dizi[], int low, int high) 
    /*parametresi olarak "dizi" tamsayı dizisini, "low" tamsayısını ve "high" tamsayısını 
    alan bir yöntemdir. Dizinin son elemanını pivot olarak kullanarak ve pivottan küçük veya 
    ona eşit olan tüm elemanları 
    pivotun soluna taşıyarak dizinin bölüm dizinini bulur. */
    { 
        int pivot = dizi[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++) 
        { 
            
            if (dizi[j] <= pivot) 
            { 
                i++; 
                
                int temp = dizi[i]; 
                dizi[i] = dizi[j]; 
                dizi[j] = temp; 
            } 
         
        int temp = dizi[i+1]; 
        dizi[i+1] = dizi[high]; 
        dizi[high] = temp; 
        } 
        return i+1;
    }

    void sort(int dizi[], int low, int high) 
    { 
        if (low < high) 
        { 
            
            int pi = partition(dizi, low, high); 
  
            sort(dizi, low, pi-1); 
            sort(dizi, pi+1, high); 

        }
    } 

  
    static void printdiziay(int dizi[]) 
    { 
        int n = dizi.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(dizi[i]+" "); 
        System.out.println(); 
    } 


    public static void main(String args[]) 
    { 
        int dizi[] = {20, 77, 18, 9, 12, 5}; 
        int n = dizi.length; 
  
        QuickSort ob = new QuickSort(); 
        ob.sort(dizi, 0, n-1); 
  
        System.out.println("Sıralı dizi: "); 
        printdiziay(dizi); 
    } 
} 
