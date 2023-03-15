package anagramsinqueue;

import cashcounter.MyQueue;
import primeanagrams.AnagramArray;

public class AnagramsInQueue {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        AnagramArray anagramArray = new AnagramArray();
        for (int[] a : anagramArray.arr) {
            for (int i : a) {
                queue.enqueue(i);
            }
        }
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
