package designpattern.behavioral.observer;

public class ObserverMain {
    public static void main(String[] args) {
        Author mark = new Author();
        Student ion = new Student();
        Employee maria = new Employee();

        mark.subscribe(ion);
        mark.subscribe(maria);

        mark.publishArticle("Un super articol");

        mark.unsubscribe(maria);
        mark.publishArticle("Un nou articol");


    }
}
