public class FindAverage {
    public static void main(String[] args) {
        int[] arr = {89, 78, 56, 90, 44};

        double average = num(arr);

        System.out.println("Average = " + average);
    }

    public static double num(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return (double) sum / arr.length;
    }
public 
}