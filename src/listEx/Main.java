package listEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> produse = new ArrayList<>();
        produse.add("lapte");
        produse.add("paine");
        produse.add("sare");
        produse.add("paine");
        produse.add("lapte");
        produse.add("cafea");
        produse.add("branza");
        produse.add("cascaval");
        produse.add("branza");
        HashSet<String> list1 = new HashSet<>(produse);
        List<String> finalList = new ArrayList<>(list1);
        System.out.println(finalList);
        for (String produs : finalList){
            System.out.println(produs);

        }

    }
}
