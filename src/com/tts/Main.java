//package com.tts;

//import java.util.ArrayList;
//import java.util.Scanner;

//public class Main {

 //   public static void main(String[] args) {
	// write your code here
        //from slide 25
       // Scanner scan = new Scanner(System.in);
       // ArrayList<Integer> myArrayList = new ArrayList<>();
       // for (int i =1; i <= 5; i++) {
        //    int myNum = scan.nextInt();
        //    myArrayList.add(myNum);
      //  }

       // int sum = 0;
       // for (int theNumberFromArray : myArrayList) {
        //    sum = sum + theNumberFromArray;
       // }
       // System.out.println("Your sum is : " + sum);


        package com.tts;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;



        public class Main {

            public static void main(String[] args) {

//                List<Integer> myArr = new ArrayList<>();
//                Scanner whatNum = new Scanner(System.in);
//                System.out.println("Please enter 5 numbers:");


                System.out.println("Please enter 5 numbers");
                Scanner scan = new Scanner(System.in);
                ArrayList<Integer> myArr = new ArrayList<>();
                for (int i = 1; i <= 5; i++) {
                    int myNum = scan.nextInt();
                    myArr.add(myNum);
                }


                int sum = 0;
                for (int num : myArr) {
                    sum = sum + num;
                }

                System.out.println("Your Sum is: " + sum);

                int firstNum = (myArr.isEmpty()) ? 0 : myArr.get(0);
                for (int num : myArr) {
                    if (num < firstNum) {
                        firstNum = num;
                    }
                }
//
//                int num = 0;
//                for (int i = 0; i <= 4; i++) {
//                    num = Integer.parseInt(scan.nextLine());
//                    myArr.add(num);
//                }
//
//                int sum = 0;
//                for (int i : myArr) {
//                    sum = sum + i;
//                }
//
//                System.out.println("the sum is " + sum);


                // Find Product

                int product = 1;
                for (int i : myArr) {
                    product *= i;
                }



                System.out.println("Your Product is: " + product);

                //Find Max
                int max = 0;
                for (int i : myArr) {
                    if (i > max) {
                        max = i;
                    }
                }
                System.out.println("Your Maximum Number Is: " + max);


                //Find Min
                int min = Integer.MAX_VALUE;
                for (int i : myArr) {
                    if (i < min) {
                        min = i;
                    }
                }
                System.out.println("Your Minimum Number Is: " + min);



                HashMap<String, String> myMap = new HashMap<>();
                myMap.put("VW","Beetle?");
                myMap.put("Honda","Civic?");
                myMap.put("Pontiac","Grand Prix?");


                for (Map.Entry<String,String> entry: myMap.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                }

                System.out.println("Please enter desired Model");
                String modelString = scan.next();
                    if (modelString.equals("VW")) {
                    System.out.println(myMap.get("VW"));
                }  if (modelString.equals("Honda")) {
                    System.out.println(myMap.get("Honda"));
                }  if (modelString.equals("pontiac")) {
                    System.out.println(myMap.get("Pontiac"));
                }
                if (myMap.containsKey(modelString)){
                    System.out.println("Oh, you're looking for a " + modelString + "? " + "Right this way you stupid idiot.");
                }
                    else {
                    System.out.println("I'm sorry... Have you tried Scott Elder?");
                }
            }
        }


                //product, largest, and smallest of those numbers
               // public static void main(String[] args)
               // {
                  //  int ar[] = { 1, 2, 3, 4, 5 };
                  //  int n = ar.length;
                  //  System.out.printf("%d", product(ar, n));
//                int product = (int x =  )
//                {
//                    int result = 0;
//                    for (int i = 0; i < n; i++)
//                        result = result * i;
//                    return result;
//                }
//                System.out.println("the product is " + product);







