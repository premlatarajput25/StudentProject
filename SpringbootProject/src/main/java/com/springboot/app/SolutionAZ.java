package com.springboot.app;

import java.io.*;
import java.math.*;
import java.security.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'sortOrders' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY orderList as parameter.
     */

    public static List<String> sortOrders(List<String> orderList) {
    // Write your code here
    List<String> returnOrderList = new ArrayList<>();
    List<String> numberLst = new ArrayList<>();
    List<String[]> orderStringArray = new ArrayList<String[]>();
    // for(String str :returnOrderList){
    //     orderStringArray.add(str.split("\\s"));
    // }
    if(orderList.size() ==0) 
        return orderList;
        
    // orderList.forEach( (str) -> {orderStringArray.add(str.split("\\s"));});
   
    TreeMap<String,String> tree = new TreeMap<>();
    orderList.forEach( (str) -> {       String[] sArray = str.split(" ");
                                        if(!sArray[1].matches(".*[0-9].*")){
                                            
                                            StringJoiner sj = new StringJoiner(" ");
                                            for(int i=1;i< sArray.length;i++){
                                                sj.add(sArray[i]);
                                            }
                                            sj.add(sArray[0]);
                                            tree.put(sj.toString(),str);
                                       }
                                       
                                       else{
                                           numberLst.add(str);
                                       }
                                });
    
    for(Map.Entry<String,String> e: tree.entrySet()){
        returnOrderList.add(e.getValue());
    }
    
    returnOrderList.addAll(numberLst);
    return returnOrderList;
    
    }

}

public class SolutionAZ {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int orderListCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> orderList = new ArrayList<String>();
        orderList.add("");

        List<String> result = Result.sortOrders(orderList);
        System.out.println(result.toString());
        
//        bufferedWriter.write(
//            result.stream()
//                .collect(joining("\n"))
//            + "\n"
//        );

        bufferedReader.close();
        bufferedWriter.close();
    
    }
}


