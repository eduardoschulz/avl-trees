package com.tree.avltree.no;

public class Node {
    private int valor;
    private Node left, right;

    public Node (int valor){
        this.valor = valor;
    }
    public Node(int valor, Node left, Node right){
        this.valor  = valor;
        this.left = left;
        this.right = right;
    }
    public void evalPos(int valor){
        if(left == null || right == null){
           if(valor > this.valor)
               this.right = new Node(valor);
           if(valor > this.valor)
               this.right = new Node(valor);
        }

        if (valor < this.valor)
            left.evalPos(valor);
        else if (valor > this.valor)
            right.evalPos(valor);

    }
}
