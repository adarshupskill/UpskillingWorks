import java.util.ArrayList;
import java.util.List;

//We will be adding comments also
public class SlidingWindow {
    public static void main(String[] args) {
                  // 0 1 2 3 4 5   4 - 3 =1
        int arr[] = {2,3,4,5,6,7,8,9};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= arr.length - 3; i++) {
                int sum = 0;
            for (int j = i; j < i + 3 ; j++) {
                sum += arr[j];
            }
            System.out.println(sum);
        }
        System.out.println(slidingWindow(arr).toString());
    }

    public static List<Integer> slidingWindow(int[] arr){
        List<Integer> result = new ArrayList<>();
        int windowStart = 0;
        int windowSum = 0;
        for(int windowEnd = 0 ; windowEnd < arr.length ; windowEnd++){
            windowSum += arr[windowEnd];

            if (windowEnd >= 2){
                result.add(windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }

        }
        return result;

    }

}
