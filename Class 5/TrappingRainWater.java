class TrappingRainWater {
    public static int getWaterUnits(int[] height) {
        int n = height.length;
        int pMax[] = new int[n];
        int sMax[] = new int[n];

        pMax[0] = height[0];
        sMax[n-1] = height[n-1];

        for (int i = 1; i < n; i++)
            pMax[i] = Math.max(pMax[i-1], height[i]);
        
        for (int i = n-2; i >= 0; i--)
            sMax[i] = Math.max(sMax[i+1], height[i]);
        
        int ans = 0;
        for (int i = 1; i < n-1; i++) {
            ans += Math.min(pMax[i], sMax[i]) - height[i];
        }
        return ans;
    }

    public static void main(String[] args) {
      int heights[] = {0,1,0,2,1,0,1,3,2,1,2,1};
      System.out.println(getWaterUnits(heights));
    }
}