package twoDArray;

import java.util.Scanner;

public class ArrayExample1 {
    public static void main(String[] args) {
//        int arr[] = {1,2,3};
//        int brr[] = {1,2,3};
//
//        for(int i =0; i<arr.length-1; i++){
//            for(int j=0; j<brr.length-1;j++){
//                if(arr[i]>brr[j]){
//                    System.out.println("1");
//                } else if (arr[i]<brr[j]) {
//                    System.out.println("2");
//                } else if (arr[i]==brr[j]) {
//                    System.out.println("0");
//                }
//            }
//        }



        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int i;
        int a []=new int[n];
        int b[] =new int[n];

        for(i=0; i<n; i++){
            a[i]=sc.nextInt();

        }
        for(i=0; i<n ;i++){
            b[i]=sc.nextInt();
        }
        for(i=0; i<n; i++){
            if(a[i]>b[n-1])
                System.out.println("1");
            else if (a[i]<b[n-1]) {
                System.out.println("2");
            } else if (a[i]==b[n-1]) {
                System.out.println("0");
            }
        }
    }
}
