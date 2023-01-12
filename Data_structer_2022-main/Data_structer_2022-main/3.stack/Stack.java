public class Stack {//class sınıfı oluşturma
    private int[] elements;//satırı, yığın için kullanılacak diziyi tanımlar.
    private int top;//yığının en üstündeki elemanın dizideki indeksini tutar.
    private int max;//yığının maksimum boyutunu tutar.    
    Stack(int size)//yığının boyutunu alır ve "elements" dizisini o boyutta oluşturur"top" ve "max" değişkenlerini ilklendirir.     
    {
        elements = new int[size];
        top = 0;        
        max = size;     
    }
    public void push(int element)/*metodu, eğer yığın dolu değilse, verilen elemanı yığının
     en üstüne ekler ve "top" değişkenini 1 arttırır. */
    {
        if(!isFull()){
            elements[top] = element;    
            top++;                     
        }
    }
    
    public int pop()/*yığının en üstündeki elemanını döndürür ve "top" değişkenini 1 azaltır. */
    {
        top--;                      
        return elements[top];      
    }
    
    public int peek()//metodu, yığının en üstündeki elemanını döndürür.          
    {
        return elements[top];
    }
    
    public boolean isEmpty()//yığının boş olup olmadığını kontrol eder.    
    {
        if(top > 0) return true;
        else return false;     
    }
    
    public boolean isFull()//yığının dolu olup olmadığını kontrol eder. 
    {
        if(top == max) return true;
        else return false;         
    }
    
    public int size()   
    {
        return top;
    }
    
    public void list()//yığının boyutunu döndürür.  
    {
        for(int i = max - 1; i >= 0; i--) 
        {                                  
            if(elements[i] != 0)                    
                System.out.print(elements[i] + " ");
        }
    }
}