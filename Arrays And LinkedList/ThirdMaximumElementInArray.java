import java.util.*;

public class Source {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        thirdMaxInteger(arr);
    }

    // Method to find the third maximum integer in the array
    static void thirdMaxInteger(int[] arr) {
        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] < firstMax && arr[i] > secondMax) {
                thirdMax = secondMax;
                secondMax = arr[i];
            } else if (arr[i] < secondMax && arr[i] > thirdMax)
                thirdMax = arr[i];
        }
        if (thirdMax != Integer.MIN_VALUE)
            System.out.println(thirdMax);
        else
            System.out.println("The array doesn't have a third maximum element");
    }
}
