package primeanagrams;

import java.util.ArrayList;
import java.util.Map;

public class AnagramList extends AnagramMap {

    ArrayList<Map.Entry<Integer, ArrayList<Integer>>> listBelowHundred;
    ArrayList<Map.Entry<Integer, ArrayList<Integer>>> listAboveHundred;

    public AnagramList() {
        listBelowHundred = new ArrayList<>(anagramMapBelowHundred.entrySet());
        listAboveHundred = new ArrayList<>(anagramMapAboveHundred.entrySet());
        filterLists();
    }

    private void filterLists() {
        ArrayList<Map.Entry<Integer, ArrayList<Integer>>> temp = new ArrayList<>();
        for (Map.Entry<Integer, ArrayList<Integer>> entry : listBelowHundred) {
            if (entry.getValue().size() != 1) {
                temp.add(entry);
            }
        }
        listBelowHundred = temp;
        temp = new ArrayList<>();
        for (Map.Entry<Integer, ArrayList<Integer>> entry : listAboveHundred) {
            if (entry.getValue().size() != 1) {
                temp.add(entry);
            }
        }
        listAboveHundred = temp;
    }
}

