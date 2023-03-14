package BalancedParantheses;

import unorderedlist.UnorderedList;

public class MyStack<T extends Comparable<T>> {

    private final UnorderedList<T> list;

    public MyStack(){
        list=new UnorderedList<>();
    }

    public void push(T data){
        list.push(data);
    }

    public void pop(){
        list.pop();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

}
