

import.java.util.;

public class String {

        public static void main(String[] args) {
            String str = "abccba";
            Substrings(s);
        }
        public static void Substrings(String str) {
            int n = str.length();
            for (int i = 0; i < n; i++){
                for (int j = i + 1; j<= n; j++) {
                    String substring = i.substring(i,j);
                    System.out.println(substring);
                }
            }
        }
    }