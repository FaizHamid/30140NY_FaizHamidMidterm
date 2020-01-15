package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        public static boolean isAnagram(String s, String t) {
                if (s.length() != t.length()) {
                    return false;
                }

                s = s.replaceAll("\\s+","").toLowerCase();
                t = t.replaceAll("\\s+","").toLowerCase();
                int[] count = new int[26];
                for (int i = 0; i < s.length(); i++) {
                    count[s.charAt(i) - 'a']++;
                }
                for (int i = 0; i < t.length(); i++) {

                    count[t.charAt(i) - 'a']--;
                    if (count[t.charAt(i) - 'a'] < 0) {
                        return false;
                    }
                }
                return true;
            }

    public static void main(String[] args) {
        String s = "Debit card", t = "Bad credit";
        System.out.println(isAnagram(s, t) ? "The two strings are anagram." : "The two strings are not anagram.");






            }
}
