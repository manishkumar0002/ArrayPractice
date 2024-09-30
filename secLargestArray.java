package twoDArray;

public class secLargestArray {
    static private int SecondLargestArray(int arr[],int n){
        if(n<2)
            return -1;
        int large =Integer.MIN_VALUE;
        int secondLage=Integer.MIN_VALUE;
        int i =0;
        for(i=0; i<n; i++){
            if(arr[i]> large){
                secondLage=large;
                large =arr[i];
            }else if(arr[i]>secondLage && arr[i]!=large){
                secondLage=arr[i];
            }
        }return secondLage;
    }
    public static void main(String[] args) {
        int arr []={1,2,3,4,7,7,5};
        int n =arr.length;

        System.out.println("second largset array is "+SecondLargestArray(arr,n));
    }
}
