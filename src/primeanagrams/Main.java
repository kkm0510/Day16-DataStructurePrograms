package primeanagrams;

public class Main {

    public static void printArray(int[][] arr) {
        for (int[] a : arr) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AnagramList al = new AnagramList();
//        System.out.println(al.listBelowHundred);
//        System.out.println(al.listAboveHundred);
        int[][] arr = new int[al.listAboveHundred.size() + al.listBelowHundred.size()][];
        int i = 0;
        for (int j = 0; j < al.listBelowHundred.size(); j++) {
            arr[i] = new int[al.listBelowHundred.get(j).getValue().size()];
            for (int k = 0; k < arr[i].length; k++) {
                arr[i][k] = al.listBelowHundred.get(j).getValue().get(k);
            }
            i++;
        }
        for (int j = 0; j < al.listAboveHundred.size(); j++) {
            arr[i] = new int[al.listAboveHundred.get(j).getValue().size()];
            for (int k = 0; k < arr[i].length; k++) {
                arr[i][k] = al.listAboveHundred.get(j).getValue().get(k);
            }
            i++;
        }
        printArray(arr);
    }
}
