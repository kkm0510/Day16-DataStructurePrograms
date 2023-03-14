package primenumbers;

import java.util.ArrayList;

public class PrimeList {

    ArrayList<ArrayList<Integer>> listsOfPrimes;
    int k;

    public PrimeList(){
        listsOfPrimes =new ArrayList<>();
        k=-1;
    }

    public void fillListsOfPrimes(){
        for(int i=0; i<1000; i++){
            if(i%100==0){
                listsOfPrimes.add(new ArrayList<>());
                k++;
            }
            if(checkPrime(i)) listsOfPrimes.get(k).add(i);
        }
    }

    public boolean checkPrime(int num){
        for(int i=2; i<num; i++){
            if(num%i==0) return false;
        }
        return true;
    }

}
