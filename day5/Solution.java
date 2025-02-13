class Solution {
public int countDigits(int num) {

    int res = 0;
    char [] chars = String.valueOf(num).toCharArray();

    for(int i = 0; i < chars.length; i++){
        if(num % Integer.parseInt(String.valueOf(chars[i])) == 0){
            res++;
        }
    }
   return res;
  }
}