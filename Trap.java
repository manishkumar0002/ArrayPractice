package twoDArray;

public class Trap {
    public static void main(String[] args) {
        int height[]={4,2,0,3,2,5};
        System.out.println(TrapWaterProb(height));
    }
    public static int TrapWaterProb(int []height){
        int n =height.length;
        int res = 0,left=0,right=0;
        int rmax=height[right];
        int lmax=height[left];
        while(left<right){
            if(rmax<lmax){
                left++;
                lmax=Math.max(lmax,height[left]);
                res +=lmax-height[left];
            }else {
                right--;
                rmax=Math.max(rmax,height[right]);
                res +=rmax-height[right];
            }
        }
        return res;
    }
}
