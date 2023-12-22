public class Tree {
    int key;
    Tree right;
    Tree left;
    Tree(int value){
        key=value;
    }
    public static void print(Tree root){
        if(root==null) return;
        System.out.println(root.key);
        print(root.left);
        print(root.right);
    }
    public static void main(String[] args) {
        Tree root=new Tree(1);
        Tree left=new Tree(2);
        Tree right=new Tree(3);
        root.left=left;
        root.right=right;
        print(root);

    }
}
