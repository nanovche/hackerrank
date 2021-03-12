package strings;

import java.util.LinkedList;
import java.util.List;

public class AlternatingCharacters {

    public static void main(String[] args) {
        System.out.println(alternatingCharacters("ABABABABAB"));
    }

    static int alternatingCharacters(String s) {

        StringBuilder sb = new StringBuilder(s);

        int deletions = 0;
        for (int i = 0; i < sb.length() - 1;) {
            if(sb.charAt(i) == sb.charAt(i + 1)){
                sb.deleteCharAt(i);
                deletions++;
            } else {
                i++;
            }
        }

        //exceeds time limit of some test cases
       /* List<Character> list = new LinkedList<>();
        for (Character c: s.toCharArray()) {
            list.add(c);
        }

        int deletions = 0;
        for (int i = 0; i < list.size() - 1;) {
            if(list.get(i) == list.get(i + 1)){
                list.remove(i);
                deletions++;
            } else {
                i++;
            }
        }*/
        return deletions;
    }

}
