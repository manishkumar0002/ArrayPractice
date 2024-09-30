package twoDArray;

public class leftRotateone {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n =arr.length;
        solve (arr, n);
    }
    static void solve (int arr[], int n){
        int temp =arr[0];//store the value of first index into a temp variable
        for(int i =0; i<n-1 ; i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;// assign a value of temp into the last index of array
        for(int i =0; i<n ; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
