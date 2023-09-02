package designpattern.structural.proxy;

public class ProxyMain {
    public static void main(String[] args) {


        Image image = new ProxyImage("poza.jpg");

        image.display();
        image.display();

    }
}
