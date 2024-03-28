package com.company;

public class Main {

    public static void main(String[] args) {
        Child child = new Child();
        GenParent<String> child2 = new Child();
        child.setItem("hi");
        Object o = child.getItem();
        System.out.println(o);

        Child6 child6 = new Child6();
        GenParent<Integer> child6_2 = new GenParent<>();
        child6.setItem(5);
        int i = (Integer) child6.getItem();
        System.out.println(i);
    }
}

// Допустим у нас есть родительский класс
class Parent{}

// мы его можем наследовать в дочерний у которого мы еще не знаем тип данных (дженерик)
// в нашем случае дженерик <T>
class GenParent<T> extends Parent{
    T item;

    public T getItem(){return item;}

    public void setItem(T item){this.item = item;}
}


// здесь указаны все возможные наследственные связи с дженериком
class Child extends GenParent{}
class Child2 extends GenParent<String>{}
class Child3<T> extends GenParent<T>{}
class Child4<X, T, Y> extends GenParent<T>{}
class Child5<X, T, Y> extends GenParent{}
class Child6<X, T, Y> extends Child5<String, T, Integer>{}

class newGenParent<T, E> {}
class GenChild extends newGenParent{}
class GenChild2<T> extends newGenParent<T, String>{}



// наследование в интерфейсах
interface GenParentInterface<T>{
    T getT();
}
class genIn implements GenParentInterface{
    @Override
    public Object getT() {
        return null;
    }
}

class genIn2 implements GenParentInterface<String>{
    @Override
    public String getT() {
        return null;
    }
}

class genIn3<T> implements GenParentInterface<T>{
    @Override
    public T getT() {
        return null;
    }
}