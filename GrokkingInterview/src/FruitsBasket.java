import java.util.HashMap;
import java.util.Map;

public class FruitsBasket {
    public static void main(String[] args) {
        char fruit[] = {'A', 'B', 'C', 'B', 'B', 'C'};
        int windowstart = 0;
        int trees = Integer.MIN_VALUE;
        Map<Character , Integer> basket = new HashMap<>();
        for (int windowend = 0; windowend < fruit.length; windowend++) {
                char c = fruit[windowend];
                basket.put(c , basket.getOrDefault(c , 0)+1);
                while (basket.size() > 2){
                    char temp = fruit[windowstart];
                    basket.put(temp , basket.get(temp) - 1);
                    if (basket.get(temp) == 0){
                        basket.remove(temp);
                    }
                    windowstart++;
                }
                    trees = Math.max(trees,windowend - windowstart+1);
             }
        System.out.println(trees);
        }
    }