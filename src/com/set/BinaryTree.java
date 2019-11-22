package com.set;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    public BinaryTree leftNode;
    public BinaryTree rightNode;
    public Object value;

    public BinaryTree(){}

    public BinaryTree(Object value) {
        this.value = value;
    }

    public void add(Object value) {
        if (this.value == null) {
            this.value = value;
        } else if ((int) value < (int) this.value) {
            if (leftNode == null){
                leftNode = new BinaryTree();
            }
            leftNode.add(value);
        } else {
            if (rightNode == null) {
                rightNode = new BinaryTree();
            }
            rightNode.add(value);
        }
    }

    public List inOrder() {
        List result = new ArrayList();

        if (leftNode != null) {
            result.addAll(leftNode.inOrder());
        }
        result.add(value);
        if (rightNode != null) {
            result.addAll(rightNode.inOrder());
        }

        return result;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] values = {5, 3, 4, 9, 10, 7, 1, 100};
        for (int value : values) {
            tree.add(value);
        }

        System.out.println(tree.inOrder());
    }
}
