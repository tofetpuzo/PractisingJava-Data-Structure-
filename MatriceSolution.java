package PractiseJavaDataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MatriceSolution {
    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    int rows;
    int cols;
    // ArrayList matArows = new ArrayList();

    public List<List<Integer>> buildMatrices() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first matrix dimension value: ");
        rows = input.nextInt();
        // System.out.print("You want a matrix of " + numbs1);
        System.out.print("Enter the second matrix dimension value: ");
        cols = input.nextInt();

        int[][] numbers = new int[rows][cols];

        for (int i = 0; i < numbers.length; i++) {
            // System.out.println("Enter digits for rows:" + i + 1);
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print("Enter digits for rows:" + (i + 1) + ", cols: " + (j + 1) + ": ");
                numbers[i][j] = input.nextInt();

                // System.out.println("Enter numbers for the cols in the matrix: ");
            }

        }
        List<List<Integer>> nestedLists = Arrays.stream(numbers)
                .map(internalArray -> Arrays.stream(internalArray).boxed().collect(Collectors.toList()))
                .collect(Collectors.toList());
        nestedLists.forEach(System.out::println);
        return nestedLists;
    }

    public ArrayList<Integer> buildMatriceB() {

        buildMatrices();
        return null;

    }

    public void addMatrices(List<List<Integer>> matA, List<List<Integer>> matB) {
  
        int[][] matriceA = matA.stream().map(u -> u.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new));
        int[][] matriceB = matB.stream().map(u -> u.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new));
        int[][] res = new int[matriceA.length][matriceB.length];

        // ystem.out.println("FOR ARRAY ARRAY ----- ");
        for (int i = 0; i < matriceA.length; i++) {
            // System.out.print("[" );
            for (int j = 0; j < matriceB.length; j++) {

        }
        System.out.println("FOR LIST LIST ----- ");
        List<List<Integer>> nestedLists = Arrays.stream(res).map(internalArray -> Arrays.stream(internalArray).boxed().collect(Collectors.toList())).collect(Collectors.toList());
        nestedLists.forEach(System.out::println);
    }

    // int[] matArows = [];
    public static void main(String[] args) {
        MatriceSolution buls = new MatriceSolution();

        List<List<Integer>> matA = buls.buildMatrices();
        List<List<Integer>> matB = buls.buildMatrices();
        // buls.buildMatrices();
        buls.addMatrices(matA, matB);
        // buls.buildMatriceB();
    }

}
