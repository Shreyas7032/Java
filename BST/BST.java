package BST;

class BST {
    int data;
    BST left, right;

    // Constructor
    public BST(int data) {
        this.data = data;
        this.left = this.right = null;
    }

    // Insert Node
    public void insert_Node(BST newnode) {
        if (newnode.data < this.data) {
            if (this.left == null) {
                this.left = newnode;
            } else {
                this.left.insert_Node(newnode);
            }
        } else {
            if (this.right == null) {
                this.right = newnode;
            } else {
                this.right.insert_Node(newnode);
            }
        }
    }

    // Inorder Traversal (Left, Root, Right)
    public void inorder_traversal() {
        if (this.left != null) {
            this.left.inorder_traversal();
        }
        
        System.out.print(this.data + " ");
        
        if (this.right != null) {
            this.right.inorder_traversal();
        }
    }

    // Preorder Traversal (Root, Left, Right)
    public void preorder_traversal() {
        System.out.print(this.data + " ");
        
        if (this.left != null) {
            this.left.preorder_traversal();
        }
        if (this.right != null) {
            this.right.preorder_traversal();
        }
    }

    // Postorder Traversal (Left, Right, Root)
    public void postorder_traversal() {
        if (this.left != null) {
            this.left.postorder_traversal();
        }
        if (this.right != null) {
            this.right.postorder_traversal();
        }
        System.out.print(this.data + " ");
    }

    // Find Min Value
    public int min() {
        if (this.left == null) {
            return this.data;
        }
        return this.left.min();
    }

    // Find Max Value
    public int max() {
        if (this.right == null) {
            return this.data;
        }
        return this.right.max();
    }

    // Search for a Node
    public boolean search_Node(int value) {
        if (this.data == value) {
            System.out.println("Node Found: " + value);
            return true;
        }
        if (value < this.data && this.left != null) {
            return this.left.search_Node(value);
        }
        if (value > this.data && this.right != null) {
            return this.right.search_Node(value);
        }
        System.out.println("Node Not Found: " + value);
        return false;
    }


    public static void main(String[] args) {
        BST root = new BST(10);
        root.insert_Node(new BST(12));
        root.insert_Node(new BST(14));
        root.insert_Node(new BST(11));

        System.out.println("Inorder Traversal:");
        root.inorder_traversal(); // Expected: 10 11 12 14
        System.out.println();

        System.out.println("Preorder Traversal:");
        root.preorder_traversal(); // Expected: 10 12 11 14
        System.out.println();
//
        System.out.println("Postorder Traversal:");
        root.postorder_traversal(); // Expected: 11 14 12 10
        System.out.println();
//
        System.out.println("Min Value: " + root.min()); // Expected: 10
        System.out.println("Max Value: " + root.max()); // Expected: 14
//
        root.search_Node(70); // Expected: Node Not Found: 70
        root.search_Node(11); // Expected: Node Found: 11
    }
}
