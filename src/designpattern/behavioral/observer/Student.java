package designpattern.behavioral.observer;

public class Student extends Observer{
    @Override
    public void notifyNewArticle(String text) {
        System.out.println("Studentul a fost notificat ca articolul a fost publicat si citeste articolul " +text);
    }
}
