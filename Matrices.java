package PractiseJavaDataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrices {

    int rows;
    int cols;
    ArrayList<Integer> matArows = new ArrayList<>(rows);
    ArrayList<Integer> matAcols = new ArrayList<>(cols);
    // ArrayList matArows = new ArrayList();

    void buildMatrices() {
        Scanner row = new Scanner(System.in);
        Scanner col = new Scanner(System.in);
        Scanner dataA = new Scanner(System.in)
        Scanner dataB = new Scanner(System.in);
        System.out.print("Enter the first matrix dimension value: ");
        int numsrowA = row.nextInt();
        // System.out.print("You want a matrix of " + numbs1);
        System.out.print("Enter the second matrix dimension value: ");
        int numscolA = col.nextInt();
        rows = numsrowA;
        cols = numscolA;
        int[][] numbers = new int[rows][cols];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter numbers for the rows in the matrix: ");
            int dataforrowsMatA = dataA.nextInt();
            matArows.add(dataforrowsMatA);
            System.out.println("Enter numbers for the digit in cols matrix: ");
            int dataforcolsMatA = dataB.nextInt();
            matAcols.add(dataforcolsMatA);
            // for (int j = 0; j < numbers[0].length - 1; j++) {
            // //System.out.println("Enter numbers for the cols in the matrix: ");
            // } //System.out.println(matArows);
            // System.out.print(i + "" + j + " ");//System.out.print(i + "" + j + " ");
        }System.out.println(matAcols); System.out.println(matArows);

    public ArrayList<Integer> buildMatriceB() {
        buildMatrices();
        return null;

    }
    // System.out.println();

    // int[] matArows = [];
    public static void main(String[] args) {
        Matrices buls = new Matrices();
        buls.buildMatrices();
        buls.buildMatriceB();
    }

}
