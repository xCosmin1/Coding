package recap;

import jdk.jshell.execution.Util;

public class Person {
    private static int id= 0;
    private int age;
    private String name;

    public Person() {
    id += 1;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = Utils.transformText(name);
    }


    public Person(int age) {
        this();
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }


}
