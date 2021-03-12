package stacksAndQueues;

import java.util.HashMap;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        System.out.println(isBalanced("}][}}(}][))]"));
        System.out.println(isBalanced("[](){()}"));
        System.out.println(isBalanced("()"));
        System.out.println(isBalanced("({}([][]))[]()"));
        System.out.println(isBalanced("{)[](}]}]}))}(())("));
        System.out.println(isBalanced("[["));
    }
        /*System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("{[(])}"));
        System.out.println(isBalanced("{{[[(())]]}}"));
        System.out.println(isBalanced("([][])"));
        System.out.println(isBalanced("[()][{}()][](){}([{}(())([[{}]])][])[]([][])(){}{{}{[](){}}}()"));
        System.out.println(isBalanced("[]({})[{}{{}([{}][])}]"));
        System.out.println(isBalanced("[]({})[{}{{}([{}][])}]"));*/
        /*System.out.println(isBalanced("[()][{}()][](){}([{}(())([[{}]])][])[]([][])(){}{{}{[](){}}}()[]({})[{}{{}([{}][])}]"));
        System.out.println(isBalanced("[()][{}[{}[{}]]][]{}[]{}[]{{}({}(){({{}{}[([[]][[]])()]})({}{{}})})}"));
        System.out.println(isBalanced("(])[{{{][)[)])(]){(}))[{(})][[{)(}){[(]})[[{}(])}({)(}[[()}{}}]{}{}}()}{({}](]{{[}}(([{]"));
        System.out.println(isBalanced("){[]()})}}]{}[}}})}{]{](]](()][{))])(}]}))(}[}{{)}{[[}[]"));
        System.out.println(isBalanced("}(]}){"));
        System.out.println(isBalanced("((]()(]([({]}({[)){}}[}({[{])(]{()[]}}{)}}]]{({)[}{("));
        System.out.println(isBalanced("{}{({{}})}[][{{}}]{}{}(){{}[]}{}([[][{}]]())"));
        System.out.println(isBalanced("(){}[()[][]]{}(())()[[([])][()]{}{}(({}[]()))()[()[{()}]][]]"));*/
/*        System.out.println(isBalanced("([{{}(({[]}{{}})[][]())}]){}{}(){[[]][]}([{}{()[][((){}(){[]}){}({}[])]({()}())}][])[(({(()())}[])[]{{}}{({({{{()()[[({()[]({[[[][][[]][]{}[[](())[(({}{(()(){}{{[][]}}){}}([()]))[{}{(([]))}]())]]()()](){}[][[][[[{({({[([])]})})}]{}]()]()]()[{}]{()}{()()[([(){([[[][{}]{[]{[{[{}[(({}[]([]({[][([()]){[]{}}{}]})())){})[]]{{{}{}}}{}{{}}]([[[]]])}(([()]()[]{()}){(((()))(){((((()))))()[]({}((){{{[]}[{}{[]}[]]}{}})[{}])})[]{[({}[]())(([()([])])())]}{}})[((){({[{(()[][]{}){}}]}([])[{[][]{}[][[[]{{{{()}}[(()[])[()(())]{}({([{[]()(({[]}){[[{}]]})}]{[][]}()()[{([]({}[[{}([([])]{})()]]))}])()[]}[])]{}}{{}}}]{{}}()]{()}(())[({{}[([{}][](){[{{}}][({{[](())({[[{}[]][()]]}[]())({})}[][]})([{(([()([]{[][([{()[][]}][[[{()[(())]{}[]([()({})])()}{{}}[]{}{{}}]][()({{}([[([{}]{}[[]])][]({}())]{}{([]{[]})})})[()]]]{()[]})({}{{}})]}[{}[()]]{[[{{}}]()]}(){()}[]([]))]{{}()})){()}([]{})}{[]([])()}][[][]])()]{{[((({}))())]{}}{}([])()({[]})}({}{()})}{[[]]}())([])]})]}])})]]}}]])}])]}]})})]]}}})})})]\n" +
                "[))]]][{[](]{][{])])()[]{)]({({)([}({}([(}[}}][{)(}}{[))))()()())}}{{}[}})){()()]}[{([[]}]{]}]]]}))((]}])})[({{{)){[})({[{({}[]([{({)]}{{)[(([}{}){()[}({()}]{]]]]])((){]}){(){}[[]}}]){])((]](](]([{)[}{{{}}{}()){){}]())){({]]{[{(]])])))(}}){([])){(})])[(][}){)}[))(])}})){{](]{({[{)(]]{][((}{{)())]{}[))][][][}([(}{(()]([({[[[]{(}[[[][({})[[{[}[()((]){)(]](})[[}]]}}]][()]}{]{{(){{{[})}[(}()])]})]{}]}}](([){[[))(}[)[)[)](}}}})}{]}]]]}[){{(}{)({)]}}[([)}[)[[))]]{}{{({))((){]][([{[{}}}]]]}{[})[}})){)](]}(}]}}{[})({{{){[]})]}}{)](}{{([](){[({{}([(([[)](({)(]{[[[))][[}([))(]{"));*/


    static String isBalanced(String s) {

        //if length is not even -> unbalanced
        //if it does not start with opening -> unbalanced
        //if it does not end with closing -> unbalanced
        if ((s.length() % 2 != 0) ||
                (s.charAt(0) != '{') &&
                        (s.charAt(0) != '(') && (s.charAt(0) != '[') ||
                (s.charAt(s.length() - 1) != '}') &&
                        (s.charAt(s.length() - 1) != ')') && (s.charAt(s.length() - 1) != ']')) {
            return "NO";
        }

        HashMap<Character, Character> map = new HashMap<>();
        map.put(']', '[');
        map.put('}', '{');
        map.put(')', '(');

        Stack<Character> brackets = new Stack<>();
        brackets.push(s.charAt(0));
        for (int j = 1; j != s.length(); j++) {
            char currentBracket = s.charAt(j);
            if (currentBracket == '{' || currentBracket == '(' || currentBracket == '[') {
                brackets.push(currentBracket);
            } else {
                if (!brackets.isEmpty()) {
                    if (map.get(currentBracket) != brackets.peek()) {
                        return "NO";
                    } else {
                        brackets.pop();
                    }
                }
            }
        }
        return "YES";
    }
}
        /*Stack<Character> leftSide = new Stack<>();
        Stack<Character> rightSide = new Stack<>();


        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
            leftSide.push(s.charAt(i));
            rightSide.push(s.charAt(j));
        }

        while(!leftSide.isEmpty()) {
            char currentLeftBracket = leftSide.pop();
            char currentRightBracket = rightSide.pop();
            if(!((currentLeftBracket == '[' && currentRightBracket == ']') ||
               (currentLeftBracket == '(' && currentRightBracket == ')') ||
               (currentLeftBracket == '{' && currentRightBracket == '}'))){
                return "NO";
            }
        }
        return "YES";*/


