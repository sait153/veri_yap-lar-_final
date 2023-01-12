import java.util.Scanner;

class main{

    public static void main (String[] args)
    {
        ikiliAgac tree = new ikiliAgac();
        bst agac=new bst();
   
        agac.Ekle(25);                
        agac.Ekle(20);      
        agac.Ekle(8);    
        agac.Ekle(5);   
        agac.Ekle(10);
        agac.Ekle(38);       
        agac.Ekle(3);   
        agac.Ekle(19);     
        agac.Ekle(24);
        agac.Ekle(95);                
        agac.Ekle(87);      
        agac.Ekle(63);    
        agac.Ekle(55);   
        agac.Ekle(84);
        agac.Ekle(70);       
        agac.Ekle(72);   
        agac.Ekle(43);     
        agac.Ekle(31);  


        System.out.println("");
        System.out.print("Inorder sonucu: ");
        agac.printInorder(agac.root);
        System.out.println("");
        System.out.print("Postorder sonucu: ");
        agac.printPostorder(agac.root);
        System.out.println("");
        System.out.print("Predorder sonucu: ");
        agac.printPreorder(agac.root);

        System.out.println("Ağacın En küçük değeri: "+agac.Min());
        System.out.println("Ağacın En BÜYÜK değeri: "+agac.Max());
 
        Scanner oku=new Scanner(System.in);
        System.out.println("Ağaçta aranacak sayıyı giriniz: ");
        int sayi=oku.nextInt();
       
        agac.printInorder(agac.root);

        if(agac.Arama2(agac.root, sayi))
            System.out.println("Bulundu..... "+ sayi);
        else
            System.out.println("Bulunamadı..... "+ sayi);
        
        


    }
}