package it.unibo.oop.lab05.ex1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
        TreeSet<String> ts = new TreeSet<>();
        for(int i = 1; i<=20; i++){
            ts.add(Integer.toString(i));
            /* if(i%3 == 0){
                ts.remove(Integer.toString(i));
            }
                */
        }
        for(String str: ts){
            System.out.println(str);
        }
        for(int i = 3; i<=18; i+=3){
            ts.remove(Integer.toString(i));
        }
        for(String str: ts){
            System.out.println(str);
        }

        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            hs.add(i);
        }

        for(Integer hint : hs){
            if(hint %2 == 0){
                hs.remove(hint);
            }
        }

        System.out.println(hs.toString());

    }
}
