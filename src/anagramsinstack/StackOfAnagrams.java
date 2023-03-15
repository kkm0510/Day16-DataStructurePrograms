package anagramsinstack;

import balancedparantheses.MyStack;
import primeanagrams.AnagramArray;

public class StackOfAnagrams {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        AnagramArray anagramArray = new AnagramArray();
        for (int[] a : anagramArray.arr) {
            for (int i : a) {
                stack.push(i);
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
