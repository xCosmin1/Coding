package designpattern.behavioral.observer;

public class Employee extends Observer {


    @Override
    public void notifyNewArticle(String text) {
        System.out.println("Angajatul citeste noul articol " +text);
    }
}
