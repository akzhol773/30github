class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String  word = new String(chars);
            map.putIfAbsent(word, new ArrayList<>());
            map.get(word).add(str);
        }

        return new ArrayList<>(map.values());

    }
}