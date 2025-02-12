class Solution {
    public String reversePrefix(String word, char ch) {
        if (!word.contains(String.valueOf(ch))){
            return word;
        }

        StringBuilder sb = new StringBuilder();

        char[] worrdArr = word.toCharArray();

        for(int i = 0; i < worrdArr.length; i++){
            if(worrdArr[i] == ch){
                for(int j = i; j >=0; j--){
                    sb.append(String.valueOf(worrdArr[j]));
                }
                for(int j = i+1; j < worrdArr.length; j++){
                    sb.append(String.valueOf(worrdArr[j]));
                }
                break;
            }
        }

        return sb.toString();
    }
}