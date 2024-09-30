package twoDArray;

public class Duplicate {
    public static void main(String[] args) {
        int [] nums ={5,7,8,9,5,32,23,4,4};
        System.out.println(duplicateValues(nums));
    }
    public static boolean duplicateValues(int []nums){
        for(int i =0; i<nums.length-1;i++){
            for(int j =i+1;j<nums.length;j++){
                if(nums[i]==nums[j])

                    return true ;
            }
        }
        return false;
    }
}
