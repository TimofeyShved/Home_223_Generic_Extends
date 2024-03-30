package com.company;

public class Metods {
    public static void main(String[] args) {
        // вызов дженериков
        Cell<String> cell = new Cell<>(new Main());
        System.out.println(cell.getE(new Integer(5)));
    }
}

class Cell<T>{
    T t;

    // можно так-же делать конструктор дженерик
    <X> Cell(X x){

    }

    // работа с мотодами джинериками
    public void setT(T t){
        this.t = t;
    }

    <E> E getE(E e){
        return e;
    }
}