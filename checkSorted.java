package twoDArray;

public class checkSorted {
    static boolean isSortedArray(int arr[],int n){
        for(int i =1; i<n ; i++){

            if(arr[i]<arr[i-1])
                //when the return false that time array is not sorted
                return false;

        }//when array is sorted then return true
        return true;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n =arr.length;
        System.out.println(isSortedArray(arr,n));
    }
}
