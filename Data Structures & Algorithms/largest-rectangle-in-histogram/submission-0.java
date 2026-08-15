class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> psei = new Stack<>();
        Stack<Integer> nsei = new Stack<>();
        int n = heights.length;
        int[] pseiA = new int[n];
        int[] nseiA = new int[n];
        Arrays.fill(pseiA,-1);
        Arrays.fill(nseiA,n);
        for(int i=0;i<heights.length;i++){
            while(!nsei.isEmpty() && heights[i] < heights[nsei.peek()]){
                nseiA[nsei.pop()] = i;
            }
            nsei.push(i);
        }
        for(int i= n-1;i>=0;i--){
            while(!psei.isEmpty() && heights[i] < heights[psei.peek()]){
                pseiA[psei.pop()] = i;
            }
            psei.push(i);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int width = nseiA[i] - pseiA[i] - 1;
            int area = width*heights[i];
            ans = Math.max(ans,area);
        }
        return ans;
    }
}
