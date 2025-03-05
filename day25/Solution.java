class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder st = new StringBuilder();

        while (columnNumber > 0) {  // Fix loop condition
            int col = (columnNumber - 1) % 26 + 65;
            st.append((char) col);
            columnNumber = (columnNumber - 1) / 26;
        }

        return st.reverse().toString();

    }
}