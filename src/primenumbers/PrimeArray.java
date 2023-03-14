package primenumbers;

public class PrimeArray {

    int[][] arrOfPrimes;

    public PrimeArray(){
        arrOfPrimes=new int[10][];
    }

    public void fillArrayOfPrimes(){
        PrimeList prime=new PrimeList();
        prime.fillListsOfPrimes();
        for(int i=0; i<10; i++){
            arrOfPrimes[i]=new int[prime.listsOfPrimes.get(i).size()];
            for(int j=0; j<arrOfPrimes[i].length; j++){
                arrOfPrimes[i][j]=prime.listsOfPrimes.get(i).get(j);
            }
        }
    }

    public void printArrayOfPrimes(){
        for(int[] arr: arrOfPrimes){
            for(int i: arr){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
