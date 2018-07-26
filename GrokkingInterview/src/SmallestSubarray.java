public class SmallestSubarray {
    public static void main(String[] args) {
        int target = 7 ;
        int arr[] = {1,2,3,4,5,6,7};
        int size = Integer.MAX_VALUE;
        int windowstart = 0;
        int sum = 0;
        for (int windowend = 0; windowend < arr.length ; windowend++) {
            sum += arr[windowend];
            while (sum >= 7){
                size = Math.min(size , windowend - windowstart + 1);
                sum -= arr[windowstart];
                windowstart++;
            }
        }
        System.out.println(size);
    }
}
