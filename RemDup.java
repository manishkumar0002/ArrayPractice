package twoDArray;

public class RemDup {
    public static void main(String[] args) {
        int nums[] ={1,1,1,2,2,3};

        System.out.println(removeduplicate(nums));
    }
//here twice no of duplicate will be allowed in this problem
    public static int removeduplicate ( int nums[]){

        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (i==1 || nums[j] != nums[i-2]) {
                nums[i++] = nums[j];

            }
        }
        return i ;
    }

}
