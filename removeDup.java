package twoDArray;

public class removeDup {
    static int removeDuplicate(int nums[]){
        int j =1;
        for(int i =1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[j]=nums[i];
                j++;
            }

        }return j;
    }

    public static void main(String[] args) {
        int nums[]={1,1,2,2,3,3};
        int k =removeDuplicate(nums);
        System.out.println("the array after removing duplicate array is "+k);
        for(int i =0; i <k; i++ ){
            System.out.print(nums[i]+ " ");
        }
    }
}
