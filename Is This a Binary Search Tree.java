   boolean checkBST(Node root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean checkBST(Node node, int min, int max){
        return node==null
            || (
            (min<node.data && node.data<max) 
            && checkBST(node.left, min, node.data) && checkBST(node.right,node.data, max)
        );
    }