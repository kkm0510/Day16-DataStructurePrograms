package anagrams.primeanagrams;

import java.util.*;

import primenumbers.PrimeList;

public class AnagramMap extends PrimeList {

    public Map<Integer, ArrayList<Integer>> anagramMapAboveHundred;
    public Map<Integer, ArrayList<Integer>> anagramMapBelowHundred;

    public AnagramMap() {
        anagramMapAboveHundred = new HashMap<>();
        anagramMapBelowHundred = new HashMap<>();
        fillBelowHundredMap();
        fillAboveHundredMap();
    }

    private int sort(int n) {
        ArrayList<Integer> digitsList = new ArrayList<>();
        while (n != 0) {
            digitsList.add(n % 10);
            n = n / 10;
        }
        Collections.sort(digitsList);
        int newNum = 0;
        for (int i : digitsList) {
            newNum = newNum * 10 + i;
        }
        return newNum;
    }

    private void fillAboveHundredMap() {
        fillListsOfPrimes();
        for (int k = 1; k < listsOfPrimes.size(); k++) {
            for (int i = 0; i < listsOfPrimes.get(k).size(); i++) {
                int sortedNum = sort(listsOfPrimes.get(k).get(i));
                if (anagramMapAboveHundred.containsKey(sortedNum))
                    anagramMapAboveHundred.get(sortedNum).add(listsOfPrimes.get(k).get(i));
                else {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(listsOfPrimes.get(k).get(i));
                    anagramMapAboveHundred.put(sortedNum, temp);
                }
            }
        }
    }

    private void fillBelowHundredMap() {
        PrimeList prime = new PrimeList();
        prime.fillListsOfPrimes();
        for (int i = 0; i < prime.listsOfPrimes.get(0).size(); i++) {
            int sortedNum = sort(prime.listsOfPrimes.get(0).get(i));
            if (anagramMapBelowHundred.containsKey(sortedNum))
                anagramMapBelowHundred.get(sortedNum).add(prime.listsOfPrimes.get(0).get(i));
            else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(prime.listsOfPrimes.get(0).get(i));
                anagramMapBelowHundred.put(sortedNum, temp);
            }
        }

    }

}
