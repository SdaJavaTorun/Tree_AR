package com.sda.tree;

import java.util.LinkedList;

/* Created by Artur Rózgowski on 3/13/17 */
public class Node<T> implements INode<T> {

    private T data; // dane
    private Node<T> parent; // rodzic
    private LinkedList<Node <T>> children; // lista dzieci

    // konstruktor domyslny
    public Node(){
        parent = null;
        children = new LinkedList<Node <T>>();
    }

    public Node(Node<T> parent){
        this.parent = parent;
    }

    public Node(T data, Node<T> parent) {
        this.data = data;
        this.parent = parent;
        this.children = new LinkedList<Node <T>>();
    }

    @Override
    public Node<T> getParent() {
        return parent;
    }

    @Override
    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T date) {
        this.data = data;
    }

    @Override
    public int getDegree() {
        return 0;
    }

    @Override
    public Node<T> getChild(int id) {
        return children.get(id);
    }

    @Override
    public boolean isLeaf() {
        return children.isEmpty();
    }

    @Override
    public Node<T> addChild(Node<T> child) {
        child.setParent(this);
        children.add(child);
        return child;
    }

    @Override
    public Node<T> addChildData(T data) {
        Node<T> child = new Node<T>(data, this);
        children.add(child);
        return child;
    }

    @Override
    public Node<T> removeChild(int id) {
        return children.remove(id);
    }

    @Override
    public LinkedList<Node<T>> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return data.toString();
    }

    public Node<T> getLeftChild() {
        if (children.isEmpty()) return null;
        return children.get(0);
    }

    public Node<T> getRightChildren() {

        if (parent != null) {
            LinkedList<Node<T>> childrenOfParent =
                    parent.getChildren();

            int index = childrenOfParent.indexOf(this);
            if (childrenOfParent.size() > index + 1) {
                return childrenOfParent.get(index + 1);
            }

        }

        return null;
    }
}
