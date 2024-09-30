package twoDArray;

public class linearSEarch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7};
        int n =arr.length;
        System.out.print(solve(arr,n));

    }
    static int solve(int arr[], int n){
        int target=1;
        for(int i =0 ; i<n ; i++){
            if(arr[i]== target)
                System.out.print("index no of target valvue of  "+ arr[i]+ " is  ");
                return i;
        }
        return -1;
    }
}
