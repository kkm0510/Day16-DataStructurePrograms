package primeanagrams;

public class AnagramArray {

    public int[][] arr;

    public AnagramArray(){
        fillArray();
    }

    public  void printArray() {
        for (int[] a : arr) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void fillArray(){
        AnagramList al = new AnagramList();
        arr = new int[al.listAboveHundred.size() + al.listBelowHundred.size()][];
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
    }

    public static void main(String[] args) {
        AnagramArray aa=new AnagramArray();
        aa.printArray();
    }
}
