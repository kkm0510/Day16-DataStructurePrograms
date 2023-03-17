package calender;

import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter year : ");
        int year=sc.nextInt();
        System.out.print("Enter month : ");
        int month=sc.nextInt();
        int[][] calender=new int[4][7];
        int day=1;
        for(int i=0; i<4; i++){
            for(int j=0; j<7; j++){
                calender[i][j]=day++;
            }
        }
        for(int[] week : calender){
            for(int i : week){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
