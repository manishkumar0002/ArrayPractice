package twoDArray;

public class ArrayTwice {
    public static void main(String[] args) {
        int arr[]={1,1,3,3,3,3,5,55,6,7,8,8};
        System.out.println(arrayTwicereturn(arr));
    }
    public static boolean arrayTwicereturn(int[] arr){
        for(int i =0; i<arr.length-1; i++){
            for(int j =i+1; i<arr.length;j++)
            if(arr[i]==arr[j]){
               /* System.out.println(arr[i]);
                arr[i]++;*/
                return true;
            }
        }
        return false;
    }
}
