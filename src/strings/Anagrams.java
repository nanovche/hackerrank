package strings;

import java.util.ArrayList;
import java.util.List;

public class Anagrams {

    public static void main(String[] args) {

        System.out.println(makeAnagram("fcrxzwscanmligyxyvym",
                                        "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
//        System.out.println(makeAnagram("cde", "abc"));
        System.out.println(makeAnagram("mama", "mata"));

    }

    static int makeAnagram(String a, String b) {

        List<Character> firstString = new ArrayList<>();
        for (Character character: a.toCharArray()) {
            firstString.add(character);
        }

        List<Character> secondString = new ArrayList<>();
        for (Character character: b.toCharArray()) {
            secondString.add(character);
        }

        int deletions = 0;
        for (int i = 0; i < firstString.size();) {
            Character currentElement = firstString.get(i);
            if (!secondString.contains(firstString.get(i))){
                deletions++;
                i++;
            } else {
                firstString.remove(currentElement);
                secondString.remove(currentElement);
            }
        }
        for (int i = 0; i < secondString.size(); i++) {
            Character currentElement = secondString.get(i);
            if (!firstString.contains(secondString.get(i))){
                deletions++;
            } else {
                firstString.remove(currentElement);
                secondString.remove(currentElement);
            }
        }
        return deletions;
    }
}
