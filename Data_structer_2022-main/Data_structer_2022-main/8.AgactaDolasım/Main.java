
   class Node {//Bu satır ile başlayan bölüm, binary tree için node (düğüm) sınıfı tanımlanıyor.
    int key;//Bu satır ile her bir node için bir anahtar (key) değeri tanımlanıyor.
    Node left, right;//Her bir node için sol ve sağ alt düğümler tanımlanıyor.
 
    public Node(int item)//Bu yapılandırıcı metod, yeni bir node oluşturulurken key değerini atamak için kullanılıyor.
    {
        key = item;
        left = right = null;
    }
}
 
class BinaryTree { //Bu satır ile başlayan bölüm, ikili ağacın sınıfı tanımlanıyor.
  
    Node root;//Bu satır ile ikili ağacın kök düğümü tanımlanıyor.
 
    BinaryTree() { root = null; }//Bu yapılandırıcı metod, yeni bir ikili ağacın kök düğümünün null olduğu bir ağaç oluşturulmasını sağlar.
 
   
    void printPreorder(Node node)// Bu metod, ağacın preorder taramasını yapmak için kullanılıyor. Bu tarama, kök-sol-sağ şeklindedir.
    {
        if (node == null)//Bu metod, ağacın inorder taramasını yapmak için kullanılıyor. Bu tarama, sol-kök-sağ şeklindedir.
            return;
 
        
        System.out.print(node.key + " ");
 
        
        printPreorder(node.left);
 
        printPreorder(node.right);
    }
    void printInorder(Node node)//Bu metod, ağacın preorder taramasını yapar ve ağacın kök düğümünü argüman olarak kullanır.
    {
        if (node == null)
            return;
 
        
        printInorder(node.left);
 
       
        System.out.print(node.key + " ");
 
       
        printInorder(node.right);
    }
    void printPostorder(Node node)
    {
        if (node == null)
            return;
 
     
        printPostorder(node.left);
 
       
        printPostorder(node.right);
 
        System.out.print(node.key + " ");
    }
 
    void printPostorder() { printPostorder(root); }//Bu metod, ağacın inorder taramasını yapar ve ağacın kök düğümünü argüman olarak kullanır.
    
    void printPreorder() { printPreorder(root); }
    void printInorder() { printInorder(root); }
   
 
    
    public static void main(String[] args)//Bu metod, programın çalıştırılması için kullanılır.
    {
        BinaryTree tree = new BinaryTree();//Bu satır ile yeni bir ikili ağaç oluşturulur.
        tree.root = new Node(1);//Bu satır ile ağacın kök düğümüne 1 değeri atanır.
        tree.root.left = new Node(2);//Bu satır ile ağacın kök düğümünün sol alt düğümüne 
        tree.root.right = new Node(3);//Bu satır ile ağacın kök düğümünün sağ alt düğümüne 3 değeri atanır.
        tree.root.left.left = new Node(4);//Bu satır ile ağacın sol alt düğümünün sol alt düğümüne 4 değeri atanır.
        tree.root.left.right = new Node(5);//Bu satır ile ağacın sol alt düğümünün sağ alt düğümüne 5 değeri atanır.
 
          
        System.out.println(//Bu satır ile ağacın preorder taramasına başlamadan önce bilgi yazdırılır.
            "Preorder ağacı");
        tree.printPreorder();//Bu satır ile ağacın preorder taraması gerçekleştirilir.
        System.out.println(//Bu satır ile ağacın inorder taramasına başlamadan önce bilgi yazdırılır.
            "\nInorder ağacı ");//Bu satır ile ağacın inorder taraması gerçekleştirilir.
        tree.printInorder();

        System.out.println(//Bu satır ile ağacın postorder taramasına başlamadan önce bilgi yazdırılır.
            "\nPostorder ağacı ");
        tree.printPostorder();// Bu satır ile ağacın postorder taraması gerçekleştirilir.
    }
}