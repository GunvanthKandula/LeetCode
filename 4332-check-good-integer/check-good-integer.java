class Solution {
    public boolean checkGoodInteger(int n) {
        int temp = n;
        int digitsum = 0;
        int squaresum = 0;
        int tempo = 0;
        while(temp>0 && n>0){
            digitsum += (temp % 10);
            tempo = n%10;
            temp = temp/10;
            n = n/10;
            squaresum += (tempo * tempo);
        }
        if((squaresum-digitsum) >= 50){
            return true;
        }
    return false;
    }
}