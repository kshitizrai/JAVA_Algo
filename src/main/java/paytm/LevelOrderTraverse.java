package paytm;

class Node{

    int data;
    Node right;
    Node left;

    Node(int data){

        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTree{

    Node root;

    public void printSpiral(Node root){

        int height = height(root);
        System.out.println("Height : " + height);
        boolean flag = true;
        for(int i=1 ; i<=height ; i++){
            printCurrentLevel(root, i, flag);
            flag = !flag;
        }
    }

    public void printCurrentLevel(Node root, int level, boolean flag){
        if(root == null){
            return;
        }
        if(level == 1){
            System.out.println(root.data);
        } else {
            if(flag) {
                printCurrentLevel(root.left, level - 1, flag);
                printCurrentLevel(root.right, level - 1, flag);
            } else{
                printCurrentLevel(root.right, level - 1, flag);
                printCurrentLevel(root.left, level - 1, flag);
            }
        }
    }

    private int height(Node node){

        if(node == null){
            return 0;
        }
        else{
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
            if(leftHeight>rightHeight){
                return leftHeight+1;
            }
            else{
                return rightHeight+1;
            }
        }
    }
}

public class LevelOrderTraverse {

    public static void main(String[] args){

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(4);
        System.out.println("Spiral order traversal of Binary Tree is ");
        tree.printSpiral(tree.root);
    }
}
