package com.epam.Questions;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question2 {
    static List<String> search(List<String> l1)
    {
        return l1.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()==3).collect(Collectors.toList());
    }
    public static void main(String args[]) {
        List<String> l1 = new ArrayList<String>();
        l1.add("aba");
        l1.add("abb");
        l1.add("addddda");
        l1=search(l1);
        for(String i:l1)
            System.out.println(i);
    }
}
