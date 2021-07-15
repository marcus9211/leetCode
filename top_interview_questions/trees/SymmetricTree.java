package trees;

import java.util.Queue;
import java.util.LinkedList;



 class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        // return validateSymmetry(root, root) ;
        return validateSymmetryIterative(root);
    }
    
    //recursion
     public boolean validateSymmetry(TreeNode t1, TreeNode t2){
         //fail caes
         //case 1 , null, value
         if(t1 == null && t2 == null)
             return true;
         if(t1 ==null || t2== null)
             return false;
         if(t1.val != t2.val)
             return false;
         return validateSymmetry(t1.left, t2.right) && validateSymmetry(t1.right, t2.left);
     }
    
   //iterative
    public boolean validateSymmetryIterative(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);

        while(!q.isEmpty()){
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if(t1 == null && t2 == null)
                continue;    
            if(t1 == null || t2 == null)
               return false;
            if( t1.val != t2.val)
                return false;
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);   
        }
       return true;
    }
}