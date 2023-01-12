import javax.lang.model.util.ElementScanner6;
/*
satırı, Java için ElementScanner6 adında bir utility sınıfını 
projede kullanabilmek için eklenmiş. Bu sınıf bu kod bloğunda 
kullanılmamış, bu satırı kodunuzdan çıkarabilirsiniz. */


public class bst {
    /* satırı, bst isimli bir sınıfı tanımlar. Bu sınıfın içerisinde 
    ikili arama ağacı için gerekli olan metodlar yer alır. */
    Node root=null;//satırı arama ağacının root düğümünü başlangıçta null olarak tanımlar.
    
    class Node
    /*satırı, arama ağacındaki her bir düğümü temsil edecek Node sınıfını tanımlar. Bu sınıf içerisinde 
    düğümün sol ve sağ alt düğümlerini, data (veri) değerini saklar. */
    {
        private Node root;
        private Node left;  
        private Node right; 
        private int data; 
        
        Node(int k)    
        /*
        onstructor, yeni bir Node nesnesi oluştururken verilen değeri data değişkenine atar. */     
        {
            left = right = null;   
            data = k;              
        }   
    }
    public void Ekle(int deger){//metodu, arama ağacına verilen değeri ekler./
        Node temp=null;
        Node p=root;
        while (p!=null){
            temp=p;
            if(deger==p.data) 
                return;
            else if(deger<p.data)
                p=p.left;
            else
                p=p.right;
        }
        Node z=new Node(deger);
        z.data=deger;
        z.left=z.right=null;
        if(root==null)
            root=z;
        else if(deger<temp.data)
            temp.left=z;
        else
            temp.right=z;        
    }

   
    public void BulWhile(Node root, int deger) {
        /*metodu arama ağacında belirli bir değer arar ve 
        eğer bulursa ekrana yazdırır. Bulunamazsa bulunamayan değer yazılır */
        Node p=root;
        while (p!=null){
            if(deger==p.data){
                System.out.println("Bulunan değer: "+deger);
                break;
            }
            else if(deger<p.data)
                p=p.left;
            else if(deger>p.data)
                p=p.right;
        }
        System.out.println("Bulunamayan değer: "+deger);

    }

    public int Min()//metodu arama ağacındaki en küçük değeri döndürür.
    {
        Node p=root;
        if (p == null)
            return 0;
        while (p.left != null){
        p = p.left;
        }
        return p.data;
        
    } 

    public int Max()//metodu arama ağacındaki en büyük değeri döndürür.
    {
        Node p=root;
        if (p == null)
            return 0;
        while (p.right != null){
        p = p.right;
        }
        return p.data;
    } 

    public void Arama(int k)
    /*metodu arama ağacında belirli bir değer arar ve eğer bulursa 
    "Bulundu k" yazdırır. 
    Bulamazsa "Bulunamadı! k" yazdırır */
    {
        boolean control = Arama2(root, k);
        if(control) 
            System.out.println("Bulundu "+k);
        else 
            System.out.println("Bulunamadı! "+k);
    }
    
    public boolean Arama2(Node root, int k)
    /*metodu arama ağacında belirli bir değer arar ve eğer bulursa true, bulamazsa false döndürür. */
    {
        Node yeni;
        if( root != null)
        {
            if(root.data == k) 
                return true;
            else if(root.data > k){
                yeni=root.left;
                return Arama2(yeni,k);
            } 
            else if(root.data < k) 
            {
                yeni=root.right;
                Arama2(yeni,k);
            } 
        }
        return false;
    }

    public void Sil(int k)
    /*metodu arama ağacından belirli bir değeri siler 
    ve eğer başarılı bir şekilde silindiyse
     "Silindi" yazdırır. Başarısız ise "Silinmedi" yazdırır */
    {
        bst.Node control = Sil2(root, k);
        if(control != null)
            System.out.println("Silindi");
        else System.out.println("Silinmedi");
    }

    public static Node Sil2(Node root, int key) {
        Node p=root;
        if(p==null)                    
            return p;                    
        if(key<p.data)                 
            p.left=Sil2(p.left, key);  
            /*metodu arama ağacının root düğümünden başlar ve verilen anahtara 
            göre sol veya sağ alt düğümlerde arama yapar. Eğer verilen anahtar, root
             düğümündeki anahtardan küçükse, metod root düğümünün sol alt düğümüne geçer 
            ve arama orada devam eder. Aynı şekilde, eğer verilen anahtar, root düğümündeki 
            anahtardan büyükse, metod root düğümünün sağ alt düğümüne geçer ve arama orada 
            devam eder.
            Eğer anahtar bulunur, silme işlemi gerçekleştirilir ve 
            silinen düğümün parent düğümüne bağlı olarak, o düğümün sol veya
            sağ alt düğümü silinen düğüm yerine bağlanır.

            metod silme işlemi gerçekleştirirse, true döner. Eğer silinemeyen 
            düğüm bulunamazsa, metod null değer döndürür. */
        else if(key>p.data)            
            p.right=Sil2(p.right,key); 
        else{
            if(p.left!=null && p.right!=null) {
                p.data=(p.right).data;         
                p.right=Sil2(p.right,p.data);  
            }
            else if(p.left!=null)  
                p=p.left;            
            else                      
                p=p.right;            
            return p; 
        }
        return p;                        
                             
    }

    
    public Node findMax() {
        if(root==null) return null;   
            return findMax(root);         
    }
    
    
    private static Node findMax(Node root) {
        Node p=root;
        if(p.right==null) return p; 
            return findMax(p.right);   
    }
    
    
    public Node findMin() {
        Node p=root;                 
        if(p!=null)                 
            while(p.left!=null)    
                p=p.left;            
        return p;                    
    }


    public void printInorder(Node kok)
    {
        if( kok != null )
        {
            printInorder(kok.left);
            System.out.print(kok.data + " ");
            printInorder(kok.right);
        }
    }

    public void printPreorder(Node kok)
    {
        if( kok != null )
        {
            System.out.print(kok.data + " ");
            printPreorder(kok.left);
            printPreorder(kok.right);
        }
    }

    public void printPostorder(Node kok)
    {
        if( kok != null )
        {
            printPostorder(kok.left);
            printPostorder(kok.right);
            System.out.print(kok.data + " ");
        }
    }
}
