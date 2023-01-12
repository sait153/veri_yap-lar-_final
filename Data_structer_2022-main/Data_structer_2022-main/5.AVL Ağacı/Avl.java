// 1-10 : "Node" sınıfı tanımlanıyor. Bu sınıf, her bir ağaç düğümünü 
//temsil etmek için kullanılır. Her düğüm, bir "item" (int) değeri ve sol ve sağ çocukları olan 
//iki Node tipinden bir "left" ve "right" özelliği içerir. Düğümlerin 
//yüksekliği (height) de aynı şekilde tutulmaktadır.
class Node {
  int item, height;
  Node left, right;

  Node(int d) {
    item = d;
    height = 1;
  }
}
/*11-24 : "AVLTree" sınıfı tanımlanıyor. Bu sınıf, AVL ağacını temsil etmek için kullanılır. Bu sınıf içinde 
ağaç yapısını oluşturmak, eklemek, silmek ve düğümleri döndürmek için metodlar bulunur. 
Ayrıca düğümlerin denge durumlarını kontrol
etmek için balance faktörünü hesaplamak için metodlar içerir. */

class AVLTree {
  Node root;

  int height(Node N) {
    if (N == null)
      return 0;
    return N.height;
  }
/*25-38 : "height" metodu tanımlanıyor. Bu metod, verilen düğümün yüksekliğini döndürür.
 Eğer düğüm null ise yükseklik 0 döndürülür. */
  int max(int a, int b) {
    return (a > b) ? a : b;
  }

  Node rightRotate(Node y) {
    Node x = y.left;
    Node T2 = x.right;
    x.right = y;
    y.left = T2;
    y.height = max(height(y.left), height(y.right)) + 1;
    x.height = max(height(x.left), height(x.right)) + 1;
    return x;
  }
/*39-45 : "max" metodu tanımlanıyor. Bu metod, verilen iki 
integer değerin en büyüğünü döndürür. */
  Node leftRotate(Node x) {
    Node y = x.right;
    Node T2 = y.left;
    y.left = x;
    x.right = T2;
    x.height = max(height(x.left), height(x.right)) + 1;
    y.height = max(height(y.left), height(y.right)) + 1;
    return y;
  }

  /*46-54 : "rightRotate" metodu tanımlanıyor. Bu metod, verilen düğümü sağa döndürür. */
  int getBalanceFactor(Node N) {
    if (N == null)
      return 0;
    return height(N.left) - height(N.right);
  }

  
  Node insertNode(Node node, int item) {
/*55-63 : "leftRotate" metodu tanımlanıyor. Bu metod, verilen düğümü sola döndürür. */
    if (node == null)
      return (new Node(item));
    if (item < node.item)
      node.left = insertNode(node.left, item);
    else if (item > node.item)
      node.right = insertNode(node.right, item);
    else
      return node;
/*64-74 : "getBalanceFactor" metodu tanımlanıyor. Bu metod, verilen düğümün denge 
faktörünü hesaplar ve döndürür. Eğer düğüm 
null ise, denge faktörü 0 olarak döndürülür. */
    node.height = 1 + max(height(node.left), height(node.right));
    int balanceFactor = getBalanceFactor(node);
    if (balanceFactor > 1) {
      if (item < node.left.item) {
        return rightRotate(node);
      } else if (item > node.left.item) {
        node.left = leftRotate(node.left);
        return rightRotate(node);
      }
    }
    if (balanceFactor < -1) {
      if (item > node.right.item) {
        return leftRotate(node);
      } else if (item < node.right.item) {
        node.right = rightRotate(node.right);
        return leftRotate(node);
      }
    }
    return node;
  }

  Node nodeWithMimumValue(Node node) {
    Node current = node;
    while (current.left != null)
      current = current.left;
    return current;
  }
/*75-103 : "insertNode" metodu tanımlanıyor. Bu metod, verilen 
düğümü ağaca ekler. Eğer düğüm null ise, yeni bir düğüm oluşturulur ve 
eklenir. Eğer eklenecek düğüm zaten 
ağaçta varsa, işlem yapılmaz. Ağacın denge durumu kont */
  
  Node deleteNode(Node root, int item) {

    
    if (root == null)
      return root;
    if (item < root.item)
      root.left = deleteNode(root.left, item);
    else if (item > root.item)
      root.right = deleteNode(root.right, item);
    else {
      /*04-116: "nodeWithMinimumValue" metodu tanımlanıyor. Bu metod, 
      ağacın en sol düğümünü döndürür. */
      if ((root.left == null) || (root.right == null)) {
        Node temp = null;
        if (temp == root.left)
          temp = root.right;
        else
          temp = root.left;
        if (temp == null) {
          temp = root;
          root = null;
        } else
          root = temp;
      } else {
        Node temp = nodeWithMimumValue(root.right);
        root.item = temp.item;
        root.right = deleteNode(root.right, temp.item);
      }
    }
    if (root == null)
      return root;
/*117-138 : "deleteNode" metodu tanımlanıyor. Bu metod, verilen 
düğümü ağaçtan siler. Eğer silinecek düğüm ağaçta yoksa işlem yapılmaz. Ağacın denge
 durumu kontrol edilir ve eğer gerekirse, düğümler döndürülür. */
    
    root.height = max(height(root.left), height(root.right)) + 1;
    int balanceFactor = getBalanceFactor(root);
    if (balanceFactor > 1) {
      if (getBalanceFactor(root.left) >= 0) {
        return rightRotate(root);
      } else {
        root.left = leftRotate(root.left);
        return rightRotate(root);
      }
    }
    if (balanceFactor < -1) {
      if (getBalanceFactor(root.right) <= 0) {
        return leftRotate(root);
      } else {
        root.right = rightRotate(root.right);
        return leftRotate(root);
      }
    }
    return root;
  }

  void preOrder(Node node) {
    if (node != null) {
      System.out.print(node.item + " ");
      preOrder(node.left);
      preOrder(node.right);
    }
  }

  
  private void printTree(Node currPtr, String indent, boolean last) {
    if (currPtr != null) {
      System.out.print(indent);
      if (last) {
        System.out.print("R----");
        indent += "   ";
      } else {
        System.out.print("L----");
        indent += "|  ";
      }
      System.out.println(currPtr.item);
      printTree(currPtr.left, indent, false);
      printTree(currPtr.right, indent, true);
    }
  }

  
  public static void main(String[] args) {
    AVLTree tree = new AVLTree();
    tree.root = tree.insertNode(tree.root, 33);
    tree.root = tree.insertNode(tree.root, 13);
    tree.root = tree.insertNode(tree.root, 53);
    tree.root = tree.insertNode(tree.root, 9);
    tree.root = tree.insertNode(tree.root, 21);
    tree.root = tree.insertNode(tree.root, 61);
    tree.root = tree.insertNode(tree.root, 8);
    tree.root = tree.insertNode(tree.root, 11);
    tree.printTree(tree.root, "", true);
    tree.root = tree.deleteNode(tree.root, 13);
    System.out.println("Silindikten Sonra: ");
    tree.printTree(tree.root, "", true);
  }
}