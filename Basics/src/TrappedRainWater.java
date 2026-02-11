public class TrappedRainWater {
    public static int trappedRainwater(int[] height ){
        // calculate left max boundary
        // calculate right max boundary
        int n = height.length;
        int[] leftmax = new int[n];
        leftmax[0] = height[0];
        for (int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i=n-2;i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedwater =0;
        for (int i=0;i<n;i++){
            int waterLevel = Math.min(leftmax[i],rightMax[i]);
            trappedwater += waterLevel-height[i];
        }

        return trappedwater;
    }
    static void main(String[] args) {
        int height[] ={4,2,0,6,3,2,5};
        int trappedWater = trappedRainwater(height);
        System.out.println("Total Trapped water is: "+trappedWater);
    }
}
