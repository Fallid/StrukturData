package DemoModul5;

public class BinaryTreeInt {
    public NodeInt root;

    public void AddNodeInt(int data){
        root = newNode(root, new NodeInt(data));
    }

    private NodeInt newNode(NodeInt root, NodeInt nodeInt){
        if(root == null){
            root = nodeInt;
            return root;
        }
        if(nodeInt.data < root.data){
            root.left = newNode(root.left, nodeInt);
        }else{
            root.right = newNode(root.right, nodeInt);
        }
        return root;
    }
    public void inOrder(NodeInt node){
        if(node != null){
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    public void preOrder(NodeInt node){
        if(node != null){
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(NodeInt node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }
}
