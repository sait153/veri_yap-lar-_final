
public class ikiliAgac {
    Node root;
    
    
    private class Node
    {
        private Node parent;
        private Node left; 
        private Node right;
        private int data;
        
        Node(int k)        
        {
            left = right = null;   
            data = k;              
        }   
    }
    
   
    public void insert(int k)
    {
        Node n = new Node(k);
        insert(root,n);    
    }
    
    private void insert(Node kok, Node yeni)
    {
        if(root == null) 
            root = yeni;
        else{ 
            if(kok.data > yeni.data)
            {
                if(kok.left == null) 
                {
                    kok.left = yeni;
                    yeni.parent = kok.left;
                }
                else insert(kok.left,yeni); 
            }
            else
            { 
                if(kok.right == null) 
                {
                    kok.right = yeni;
                    yeni.parent = kok.right;
                }
                else insert(kok.right,yeni); 
            }
        }
    }
    
    public void search(int k)
    {
        boolean control = search(root, k);
        if(control) System.out.println("Bulundu");
        else System.out.println("Bulunamadı");
    }
    
    private boolean search(Node kok, int k)
    {
        if( kok != null)
        {
            if(kok.data == k) return true;
            else if(kok.data > k) search(kok.left,k);
            else if(kok.data < k) search(kok.right,k);
        }
        return false;
    }
    
    public void max()
    {
        System.out.println(max(root));
    }
    // en büyük değer için ağacın en sağına gideriz
    private int max(Node kok)
    {
        if(kok!=null)
            max(kok.right);
        return kok.data;
    }
    
    public void min()
    {
        System.out.println(min(root));
    }
   
    private int min(Node kok)
    {
        if(kok!=null)
        {
            min(kok.left);
        }
        return kok.data;
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