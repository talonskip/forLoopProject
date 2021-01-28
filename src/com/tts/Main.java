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
                List<Integer> myArr = new ArrayList<>();
                Scanner whatNum = new Scanner(System.in);
                System.out.println("Please enter 5 numbers:");


                int num = 0;
                for (int i = 0; i <= 4; i++) {

                    num = Integer.parseInt(whatNum.nextLine());
                    myArr.add(num);

//            System.out.println(myArr);
//            myArr.add(whatNum.nextInt());
                }

                int sum = 0;
//        System.out.println(myArr);
                for (int i : myArr) {
                    sum = sum + i;
//            System.out.println(sum);


                }
                System.out.println("the sum is " + sum);
                //product, largest, and smallest of those numbers


               // public static void main(String[] args)
               // {
                  //  int ar[] = { 1, 2, 3, 4, 5 };
                  //  int n = ar.length;
                  //  System.out.printf("%d", product(ar, n));

                int product = (int ar[], int n)
                {
                    int result = ();
                    for (int i = 0; i < n; i++)
                        result = result * ar[i];
                    return result;
                }
                System.out.println("the product is " + product);

            }

    }



