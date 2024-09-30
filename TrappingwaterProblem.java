package twoDArray;

public class TrappingwaterProblem {
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(height));
    }
    public static int trappedRainWater(int height[]){
        //algorithm
       /* step 1 find leftborder,rightborder
                step2 find water level and also compare to find minimum (lb,rb)
        step 3 find trapped water byb formula (watetlevel-height of bar)
        step 4  add all trapped water and return into result*/
        int n =height.length;
        // calculate left max boundry
        int leftmax[]=new int [n];
        leftmax[0]=height[0];
        for(int i =1 ; i<n ; i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1] );

        }
        //calculate rightmax boundry of the waterlev el
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i =n-2;i>=0; i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        int trapwater=0;
        //looping
        for(int i =0;i<n; i++){
            int waterlevel =Math.max(leftmax[i],rightmax[i] );
            //calculate total trapwater

            trapwater+= waterlevel=height[i];
        }
        return trapwater;
    }
}
