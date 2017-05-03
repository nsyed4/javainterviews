package com.noor.binarysearchtree;


public class BinarySearchTreeInsertion {


    public static void main(String[] args) {
        Node<Integer> one = new Node<>(1);
        Node<Integer> two = new Node<>(2);
        Node<Integer> three = new Node<>(3);
        Node<Integer> four = new Node<>(4);
        Node<Integer> five = new Node<>(5);
        Node<Integer> six = new Node<>(6);
        Node<Integer> seven = new Node<>(7);
        Node<Integer> eight = new Node<>(8);
        Node<Integer> nine = new Node<>(9);

        Node<Integer> head = insert(null, five);

        insert(head, one);
        insert(head, seven);
        insert(head, three);
        insert(head, eight);
        insert(head, two);
        insert(head, nine);
        insert(head, six);
        insert(head, four);

        inOrder(head);
    }

    public static void print(Node<Integer> node) {
        System.out.print(node.getData() + "->");
    }

    public static void inOrder(Node<Integer> root) {
        if (root == null) {
            return;
        }

        inOrder(root.getLeftChild());
        print(root);
        inOrder(root.getRightChild());
    }

    public static Node<Integer> insert(Node<Integer> head, Node<Integer> node) {
        if (head == null) {
            return node;
        }
        
        if (node.getData() <= head.getData()) {
            Node<Integer> leftChild = head.getLeftChild();
            Node<Integer> n1 = insert(leftChild, node);
            head.setLeftChild(n1);
        } else {
            Node<Integer> rightChild = head.getRightChild();
            Node<Integer> n1 = insert(rightChild, node);
            head.setRightChild(n1);
        }
        
        return head;
    }
    
    public static class Node<T> {
        private T data;
        private Node<T> leftChild;
        private Node<T> rightChild;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public Node<T> getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node<T> leftChild) {
            this.leftChild = leftChild;
        }

        public Node<T> getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node<T> rightChild) {
            this.rightChild = rightChild;
        }
    }

}
