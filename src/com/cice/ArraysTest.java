package com.cice;

import java.util.Arrays;

/**
 *
 * @author formador
 */
public class ArraysTest {
    
    static int[] arrayNumeros = {1,2};
    
    public static void main(String... args){
        
        arrayNumeros = new int[]{1,2,3,4,5};
        arrayNumeros[0] = 2;
        arrayNumeros[1] = 2;
        
        int nombreArray[] = {1,2,3};
        
        int numeros[] = new int[4];
        //numeros[4] = 4;
        
        int[] nuevo = Arrays.copyOf(nombreArray, 12);
        
        for (int i : nuevo) {
            System.out.println(i);
        }
        
        //arrays bidimensionales
        int[][] bidi = new int[2][4];
        /*
            [ [1,1,1,1] ,  [1,1,1,1]  ]
        */
        
        int[][][] tri = new int[2][4][8];
        /*
        [[ [] [] [] [8,8,8,8,8,8,8,8,8] ] []]
        */
        
        int[] bi[] = new int[2][3];
        
        bi[0] = new int[3];
        bi[1] = new int[3];
        
        bi[0] = new int[]{1,2};
        bi[1] = new int[]{1,2,3,4};
        
        bi[0] = new int[]{1,1,1,1,1,1,1,1,1,};
        System.out.println("------");
        bi[0][10] = 1;
        for (int[] is : bi) {
            for (int i : is) {
                System.out.println(i);
            }
        }
        
        
        
        // [ x x x x x x ]
        // [ x x x x x x ]
        
        // [ [ x x x x x x ] [x x ] [ x x x x x x x] ]
        
        
        
        
        
        /*
        int [][][][] tetra = new int[2][4][8][64];
        
        int [][][][][] cinco = new int [2][4][8][64][256];
        
        int [][][][][][][][][][] diez = new int [2][4][8][16][32][64][128][256][512][1024];
        */
}
    
}
