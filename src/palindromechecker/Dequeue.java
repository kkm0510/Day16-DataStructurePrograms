package palindromechecker;

import unorderedlist.UnorderedList;

public class Dequeue<T extends Comparable<T>> {

    private UnorderedList<T> list;

    public Dequeue(){
        list=new UnorderedList<>();
    }

    public void addRear(T data){
        list.addAtHead(data);
    }

    public T removeRear(){
        return list.removeFromHead();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
}
