



public class DictionaryTree  {
   private DictionaryNode root;
   
   public DictionaryTree() {
      root = null;
   }


   public void insert (int key) {
      root = insert_Recursive(root, key);
   }

   DictionaryNode insert_Recursive(DictionaryNode root, int key) {
      if (root == null) {
         root = new DictionaryNode(key);
         return root;
      }
      
      if (key < root.key) {
         root.left = insert_Recursive(root.left, key);
      } else if (key > root.key) {
         root.right = insert_Recursive(root.right, key);
      }
      return root;
      
   }


   void delete (int key) {
      root = delete_Recursive(root, key);
   }
   
   DictionaryNode delete_Recursive(DictionaryNode root, int key) {
      if (root == null) {
         return root;
      }
      
      if (key < root.key) {
         root.left = delete_Recursive(root.left, key);
      } else if (key > root.key) {
         root.right = delete_Recursive(root.right, key);
      } else {
         if (root.left == null) {
            return root.right;
         } else if (root.right == null) {
            return root.left;
         } 
         
         root.key = minValue(root.right);
         root.right = delete_Recursive(root.right, root.key);
         
      }
      return root;
   
   }
   
   int minValue(DictionaryNode root) {
      int minVal = root.key;
      
      while (root.left == null) {
         minVal = root.left.key;
         root = root.left;
      }
      return minVal;
   
   }
   
   
   void postOrder(DictionaryNode node)  { 
        if (node == null) 
            return; 
   
        postOrder(node.left); 
        postOrder(node.right); 
        System.out.print(node.key + " "); 
    }
   
   void inOrder(DictionaryNode node)  { 
        if (node == null) 
            return; 

        inOrder(node.left); 
        System.out.print(node.key + " "); 
        inOrder(node.right); 
    }
   
   void preOrder(DictionaryNode node)  { 
        if (node == null) 
            return; 
   
        System.out.print(node.key + " "); 
        preOrder(node.left); 
        preOrder(node.right); 
    }
   
   void postOrderTrav() {    
        postOrder(root);  
        } 
    void inOrderTrav() { 
        inOrder(root);   
        } 
    void preOrderTrav() {
        preOrder(root);  
        }
   

}//end of DictionaryTree