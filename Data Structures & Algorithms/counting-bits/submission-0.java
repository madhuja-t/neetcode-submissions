class Solution {
    public int[] countBits(int n) {
        int [] a = new int[n+1];
      //  a[0]= 0;
        //a[1] = 1;
        for(int i=0;i<=n;i++){
            int num = i;
            int c=0;
            while(num>0){
                int d= (num&1);
                if(d==1)c++;
                num = num>>1;
            }
            a[i] = c;
        }
        return a;
    }
}
