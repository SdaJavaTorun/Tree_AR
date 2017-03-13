package com.sda.tree;

import java.util.LinkedList;

/* Created by Artur Rózgowski on 3/13/17 */
public interface INode<T> {
    /// drzewo typu generycznego
    public Node<T> getParent();  // zwracamy rodzica
    public void setParent(Node<T> parent); // ustawienie rodzica/wezla
    public T getData();  // pobranie przechowywanych danych
    public void setData(T date);    // wstawienie danych
    public int getDegree();    // zwraca stopień wezla
    public Node<T> getChild(int id);  // zwraca obiekt dziecka o danym id
    public boolean isLeaf();  // sprawdza czy wezel jest lisciem
    public Node<T> addChild(Node<T> data);  // dodanie do wezla dziecka
    public Node<T> addChildData(T data);    // dodanie danych do dziecka
    public Node<T> removeChild(int id);    // usuwanie
    public LinkedList<Node <T>> getChildren();   // zwraca liste dzieci
    public String toString();   // wyswietla dane
}
