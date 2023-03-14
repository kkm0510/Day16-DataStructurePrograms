package searchnumberinslot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr={3, 4, 5, 6, 7, 8, 9, 10, 23, 4, 54, 23, 23, 5, 656, 234, 1, 234};
        ChainOfSlots<Integer> chain=new ChainOfSlots<>();
        for(int i: arr){
            chain.add(i);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to search : ");
        int n=sc.nextInt();
        if(chain.search(n)) chain.remove(n);
        else chain.add(n);

    }
}
