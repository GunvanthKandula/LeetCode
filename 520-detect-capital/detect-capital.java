class Solution {
    public boolean detectCapitalUse(String word) {
       int caps = 0,low = 0,first = 0;
       for(char ch :word.toCharArray()){
        if(ch >='A' && ch <='Z'){
            caps++;
            if(first == 0){
                first = 1;
            }
        }
        else{
            low++;
            if(first ==0){
                first =2;
            }
        }
       }
       if(low==0||caps==0|| (first == 1&&caps==1))
       return true;

    return false;
    }
}