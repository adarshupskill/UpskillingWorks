import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testing {
    public static void main(String[] args) {
      int arr[] = {2,3,4,5,6};
        List<Integer> list = new ArrayList<>();
        list.toArray();

        for (int i = 0; i < arr.length * 2 ; i++) {
            System.out.print(arr[i % arr.length]+"\t ");
        }



    }
    /*public static void print(String s){
        if(s.length() == 1){
            System.out.println(s);
            return;
        }
        else{
            System.out.println(s);
            print(s.substring(0 ,s.length() - 1));
            print(s.substring(1,s.length()));
        }
    }*/
}
