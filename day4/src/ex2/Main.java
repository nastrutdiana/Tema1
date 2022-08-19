package ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(10);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(20);
        list.addAll(list2);
        list.remove(1);
        System.out.println(list.contains(20));
        System.out.println(list);
        Set<Double> list3 = new HashSet<>();
        list3.add(2.5);
        list3.add(7.5);
        list3.add(1.7);
        list3.remove(2.5);
        for (Double elem:list3){
            System.out.println(elem + " ");
        }

    }
}
