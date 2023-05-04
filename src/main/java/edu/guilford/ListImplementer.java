package edu.guilford;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ListImplementer {
    public static void main(String[] args) {
        final int MAX = 10000;
        // ArrayList of Hare objects
        ArrayList<Hare> hares = new ArrayList<Hare>(MAX);
        for (int i = 0; i < MAX; i++) {
            hares.add(new Hare("Hare" + i, "Brown", 10.0));
        }
        // time sorting it
        long startTime = System.nanoTime();
        Collections.sort(hares);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList sort " + MAX + " Hare objects: " + duration * 1.0/1000000 + " milliseconds");
        // time shuffling it
        startTime = System.nanoTime();
        Collections.shuffle(hares);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("ArrayList shuffle " + MAX + " Hare objects: " + duration * 1.0/1000000 + " milliseconds");
        // get random element 1000000 times
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            int random = (int) (Math.random() * MAX);
            hares.get(random);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("ArrayList get random element " + 1000000 + " times: " + duration * 1.0/1000000 + " milliseconds");
        // get each element sequentially
        startTime = System.nanoTime();
        for (int i = 0; i < MAX; i++) {
            hares.get(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("ArrayList get each element sequentially: " + duration * 1.0/1000000 + " milliseconds");
        // LinkedList of Hare objects
        LinkedList<Hare> hares2 = new LinkedList<Hare>();
        for (int i = 0; i < MAX; i++) {
            hares2.add(new Hare("Hare" + i, "Brown", 10.0));
        }
        // time sorting it
        startTime = System.nanoTime();
        Collections.sort(hares2);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("LinkedList sort " + MAX + " Hare objects: " + duration * 1.0/1000000 + " milliseconds");
        // time shuffling it
        startTime = System.nanoTime();
        Collections.shuffle(hares2);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("LinkedList shuffle " + MAX + " Hare objects: " + duration * 1.0/1000000 + " milliseconds");
        // get random element 1000000 times
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            int random = (int) (Math.random() * MAX);
            hares2.get(random);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("LinkedList get random element " + 1000000 + " times: " + duration * 1.0/1000000 + " milliseconds");
        // get each element sequentially
        startTime = System.nanoTime();
        for (int i = 0; i < MAX; i++) {
            hares2.get(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("LinkedList get each element sequentially: " + duration * 1.0/1000000 + " milliseconds");
    }
}
