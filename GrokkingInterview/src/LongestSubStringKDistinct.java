import java.util.HashMap;
import java.util.Map;

public class LongestSubStringKDistinct {
    public static void main(String[] args) {
        String s = "asdasdaaaabcd";
        Map<Character,Integer> map = new HashMap<>();
        int ans = Integer.MIN_VALUE;
        int windowstart = 0;
        for (int windowend = 0; windowend < s.length(); windowend++) {
            char c = s.charAt(windowend);
            map.put(c , map.getOrDefault(c , 0)+1);

            while (map.size() > 2){
                char removeChar = s.charAt(windowstart);
                map.put(removeChar , map.get(removeChar)-1);
                if (map.get(removeChar) == 0){
                    map.remove(removeChar);
                }
                windowstart++;
            }
            ans = Math.max(ans , windowend - windowstart + 1);
        }
        System.out.println(ans);
    }
}
