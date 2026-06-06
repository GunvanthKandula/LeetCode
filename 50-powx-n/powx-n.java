class Solution {
    public double myPow(double x, int n) {
        double result = 1;
        long N = n;
        if(n < 0){
            x = 1 /x;
            N = -1L * n;
        }
        while(N > 0)
        {
            if(N%2 == 0){
                 N = N/2;
                 x = x *x;
            }
            else{
                result = result * x;
                N = N -1;
            }
        }
        return result;
    }
}