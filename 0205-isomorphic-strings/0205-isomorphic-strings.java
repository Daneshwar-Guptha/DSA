class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null) return s == t;
        if (s.length() != t.length()) return false;

        int[] lastS = new int[256]; // last seen index+1 for chars in s
        int[] lastT = new int[256]; // last seen index+1 for chars in t

        for (int i = 0; i < s.length(); i++) {
            int cs = s.charAt(i);
            int ct = t.charAt(i);

            if (lastS[cs] != lastT[ct]) {
                return false; // inconsistent mapping
            }

            // store i+1 because default is 0 (meaning unseen)
            lastS[cs] = i + 1;
            lastT[ct] = i + 1;
        }

        return true;
    }
}
