package lab01;

public class task12 {
    public static void main(String[] args) {
        int arr[] = {1, -1, 0, 4, 6, 10, 15, 25};

        getSumCheckArray(arr);
    }

    public static void getSumCheckArray(int array[]) {

        System.out.print("false, false");
        for (int i = 2; i < array.length; i++) {
            boolean isSum = (array[i] == array[i - 1] + array[i - 2]);
            System.out.print(", " + isSum);
        }

        System.out.println();
    }

}
