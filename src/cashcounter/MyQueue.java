package cashcounter;

import unorderedlist.UnorderedList;

public class MyQueue <T extends Comparable<T>> {

    private final UnorderedList<T> list;

    public MyQueue(){
        list=new UnorderedList<>();
    }

    public void enqueue(T data){
        list.add(data);
    }

    public void dequeue(){
        list.removeFromHead();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

}
