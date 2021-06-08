package com.springboot.app;

import java.io.*;
import java.util.*;
 
class Solution {
    public void solution(int R,int C, int[][] M){
      int i =0,j=0;
      int index = 1;
      boolean down = false;
     while(i < R && j< C){
         
       while(i< index){     
        System.out.println(M[i][j]);
        j++;
       }
       
       if(i == index){
           i = 0;
           j++;
       System.out.println(M[i][j]);
        System.out.println(M[++i][j]);
 
       }
 
       
 
     }
      
    }
}
 
// Following is the part of the program and is provided as an assistance to read the input.
class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] M = new int[R][C];
        for(int i=0; i< R; i++)
            for(int j=0; j<C;j++)
                M[i][j]= sc.nextInt();
        Solution s = new Solution();
        s.solution(R, C, M);
        }
    }