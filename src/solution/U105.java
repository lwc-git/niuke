package solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class U105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder==null || preorder.length==0) return null;
        if(preorder.length==1) return new TreeNode(preorder[0]);

        TreeNode root = new TreeNode(preorder[0]);
        int index = getIndex(inorder,preorder[0]);


        int[] lPreorder = Arrays.copyOfRange(preorder,1,1+index);
        int[] lInorder = Arrays.copyOfRange(inorder,0,index);
        root.left = buildTree(lPreorder,lInorder);


        if(inorder.length>index+1) {
            int[] rPreorder = Arrays.copyOfRange(preorder,index+1,preorder.length);
            int[] rInorder = Arrays.copyOfRange(inorder,index+1,inorder.length);
            root.right = buildTree(rPreorder,rInorder);
        }
        else root.right=null;

        return root;

    }

    public int getIndex(int[] a,int value){
        for(int i = 0;i<a.length;i++){
            if(a[i]==value) return i;
        }
        return -1;
    }


}
