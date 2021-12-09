package HashMap;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class CharFinder {
    public char FirstNonRepeatedCharacter(String str) {
        var chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (var ch : chars) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        for (char ch : chars) {
            if (map.get(ch) == 1)
                return ch;
        }
        return Character.MIN_VALUE;
    }
    
    public char FirstRepeatedCharacter(String str) {
        Set<Character> set = new HashSet<>();
        for (var ch : str.toCharArray()) {
            if(set.contains(ch))
                return ch;
            set.add(ch);
        }
        return Character.MIN_VALUE;
    }
}