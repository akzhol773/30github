class Solution {
    public boolean digitCount(String num) {

        int [] res = new int[10];

        for(int i = 0; i < num.length(); i++){
            res[Integer.parseInt(String.valueOf(num.charAt(i)))]++;
        }

        for(int i = 0; i < num.length(); i++){
            if(Integer.parseInt(String.valueOf(num.charAt(i))) != res[i]){
                return false;
            }
        }

        return true;
    }
}