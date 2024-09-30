package twoDArray;

import java.util.ArrayList;

public class MovetoZeroend {
    public static int[] movesZero(int n , int [] a){
       int j =-1;

       //place the pointer j ;

        for(int i=0; i<n; i++){
            if(a[i]==0){
                j=1;
                break;
            }
        }
        //non zero element
        if(j == -1) return a;

        //move the pointer i and j and swap accordingly

        for(int i =j+1; i<n ; i++){
            if(a[i]!=0){
                //swap a[i] & a[j]
                int temp =a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int [] arr ={1,0,2,3,2,0,0,0,4,5,1};
        int n =arr.length;
        int ans[]=movesZero(n,arr);
        for(int i =0; i<n ; i++){
            System.out.print(ans[i]+ " ");
        }
        System.out.println("");
    }
}
