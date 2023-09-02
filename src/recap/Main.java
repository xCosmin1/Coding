package recap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<Person>();
             for(int i = 0; i < 100; i++) {
                 Person p = new Person();
                 p.setName("Catalin" + i);
                 personList.add(p);
             }
            for(int i = 0; i<100; i++){
                Person p = personList.get(i);
                System.out.println("id: " + p.getId() + " name: " +p.getName());
            }
        }



    }


