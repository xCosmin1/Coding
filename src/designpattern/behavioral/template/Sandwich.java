package designpattern.behavioral.template;

public abstract class Sandwich {

    private void cutBread(){
        System.out.println("The bread is cut in half");
    }

    abstract void addMeat();

    abstract void addCheese();

    abstract void addVegetables();

    private void wrap(){
        System.out.println("The sandwich is ready");
    }

    public void makeSandwich(){
        cutBread();
        if(customerWantsMeat()) {
            addMeat();
        }
        addCheese();
        addVegetables();
        wrap();
    }

    protected boolean customerWantsMeat(){
        return  true;
    }


}
