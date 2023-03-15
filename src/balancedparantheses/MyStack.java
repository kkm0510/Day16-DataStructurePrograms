package balancedparantheses;

import unorderedlist.UnorderedList;

public class MyStack<T extends Comparable<T>> {

    private final UnorderedList<T> list;

    public MyStack(){
        list=new UnorderedList<>();
    }

    public void push(T data){
        list.addAtHead(data);
    }

    public T pop(){
        T ele=list.removeFromHead();
        return ele;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

}
