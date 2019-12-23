package ucollection.utree;

public class TreeNode<V> {
    //用作扩展
    private V parent;

    public V val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(V root){
        this.val = root;
        this.left = null;
        this.right = null;
    }


}
