package searchnumberinslot;

import orderedlist.OrderedList;

import java.util.ArrayList;

public class ChainOfSlots<T extends Comparable<T>> {

    ArrayList<OrderedList<T>> chain;

    public ChainOfSlots(){
        chain =new ArrayList<>(10);
        for(int i=0; i<10; i++){
            chain.add(new OrderedList<>());
        }
    }

    public int getIndex(T data){
        return Math.abs(data.hashCode())%10;
    }

    public void add(T data){
        chain.get(getIndex(data)).add(data);
    }

    public void remove(T data){
        chain.get(getIndex(data)).remove(data);
    }

    public boolean search(T data){
        return chain.get(getIndex(data)).search(data);
    }

}
