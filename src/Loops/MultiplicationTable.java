package Loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int[][] table =new int [10][10];
        for(int i=0;i<table.length;i++){
            for(int j=0;j<table[i].length;j++){

                table [i][j]= (i+1)*(j+1);
                System.out.print(table[i][j]);

            }
            System.out.println("");
        }
    }
}
