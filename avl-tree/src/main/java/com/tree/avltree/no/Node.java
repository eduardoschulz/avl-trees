package com.tree.avltree.no;

public class Node {
  private int valor;
  private Node left, right;
  private int height;

  public Node (int valor){
    this.valor = valor;
  }

  public Node(int valor, Node left, Node right){
    this.valor  = valor;
    this.left = left;
    this.right = right;
  }

  public int getHeight(){
    return this.height;
  }

  public void setHeight(int height){
    this.height = height;
  }

  public void evalPos(int valor){
    if(valor < this.valor && left == null){
      this.left = new Node(valor);
      return;
    }

    if(valor > this.valor && right == null){
      this.right = new Node(valor);
      return;
    }

    if (valor == this.valor)
    return;

    if (valor < this.valor)
    this.left.evalPos(valor);

    else if (valor > this.valor)
    this.right.evalPos(valor);
  }

  private Node rotateRight(Node n) {
    Node novaRaiz = node.left;
    node.left = novaRaiz;
    novaRaiz.right = node;
    
    node.setHeight(Math.max(getHeight(node.left),
                              getHeight(node.right)) + 1);

    novaRaiz.setHeight(Math.max(getHeight(novaRaiz.left),
                              getHeight(novaRaiz.right)) + 1);

    return novaRaiz;
  }

  private



}
