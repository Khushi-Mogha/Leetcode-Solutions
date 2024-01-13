class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();
        int count = 0;
        char ch;
        int i;
        for (i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (h1.containsKey(ch))
                h1.put(ch, h1.get(ch) + 1);
            else
                h1.put(ch, 1);
        }
        for (i = 0; i < t.length(); i++) {
            ch = t.charAt(i);
            if (h2.containsKey(ch))
                h2.put(ch, h2.get(ch) + 1);
            else
                h2.put(ch, 1);
        }
        for (Character c : h1.keySet()) {

            if (h2.containsKey(c)) {

                if (h2.get(c) < h1.get(c))
                    count += h1.get(c) - h2.get(c);
            } else {
                count += h1.get(c);
            }
        }
        return count;
    }
}