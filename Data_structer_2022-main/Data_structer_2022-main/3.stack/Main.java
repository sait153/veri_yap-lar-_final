public class Main {

    public static void main(String [] args)
    {
        Stack yigin = new Stack(10);
        yigin.push(5);      
        yigin.push(10);     
        yigin.push(15);     
        yigin.push(24);     
        yigin.push(43);     
        yigin.push(65);     
        yigin.push(12);     
        
       
        System.out.println("eleman : "+ yigin.pop());
        System.out.println("eleman : "+ yigin.pop());
        yigin.push(50);                              
        System.out.println("pop : "+ yigin.pop());  
        System.out.println("pop : "+ yigin.pop());  
        System.out.println("pop : "+ yigin.pop());  
        
        yigin.push(75);                            
        System.out.println("peek : "+ yigin.peek());
        

        while(yigin.isEmpty())
        {
            System.out.print(+yigin.pop()+"-->");
            System.out.print("");
        }
        System.out.print("");
}
    
}