class Solution {
    public char findTheDifference(String s, String t) {

        char [] sortedS = s.toCharArray();
        char [] sortedT = t.toCharArray();

        Arrays.sort(sortedS);
        Arrays.sort(sortedT);

        for(int i = 0; i < sortedS.length; i++){
            if(sortedS[i] != sortedT[i]){
                return sortedT[i];
            }
        }

        return sortedT[t.length() - 1];
    }
}