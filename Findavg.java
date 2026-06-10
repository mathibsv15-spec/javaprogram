public class Findavg {

    public static void main(String[] args) {
        int[] arr = {89, 78, 56, 90, 44};

        double average = num(arr);
        System.out.println("Average = " + average);

        int count = countEven(arr);
        System.out.println("Even Numbers Count = " + count);
    }

    public static double num(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return (double) sum / arr.length;
    }

    public static int countEven(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}