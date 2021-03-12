import java.util.HashMap;

public class TwoStrings {

    public static void main(String[] args) {
        System.out.println(twoStrings("hello", "world"));;
    }
    static String twoStrings(String s1, String s2) {

        String flag = "NO";
        for(char c :"abcdefghijklmnopqrstuvwxyz".toCharArray()){
            System.out.println(c);
            if(s1.indexOf(c) > -1 && s2.indexOf(c) > -1) {
                flag = "YES";
            }
        }

        return flag;
    }

    //some cases exceed time limit
    /*static String twoStrings(String s1, String s2) {

        HashMap<String, Integer> first = putAllSubStringAsMapKeys(new StringBuilder(s1));
        HashMap<String, Integer> second = putAllSubStringAsMapKeys(new StringBuilder(s2));

        for (String key: first.keySet()) {
            if(second.containsKey(key)) {
                return "Yes";
            }
        }

        String s = "dasdas";
        char[] ha = s.toCharArray();
        "dadas".indexOf("d");

        return "No";
    }*/

/*    static HashMap<String, Integer> putAllSubStringAsMapKeys(StringBuilder s1) {
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {

            for (int j = i; j < s1.length(); j++) {
                map.put(s1.substring(i, j + 1), 1);
            }
        }
        return map;
    }*/
}