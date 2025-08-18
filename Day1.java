public class Day1 {
    public static void sort(int[] arr) {
        int low = 0;                // boundary for 0s
        int mid = 0;                // current element
        int high = arr.length - 1;  // boundary for 2s
        // Dutch National Flag problem solution
        // Sorts the array in-place so that all 0s come first, then
        // all 1s, and finally all 2s.
        while (mid <= high) {
            switch (arr[mid]) {
                case 0 -> {
                    // Swap arr[low] and arr[mid], expand 0s section
                    swap(arr, low, mid);
                    low++;
                    mid++;
                }

                case 1 -> // 1 is already in the correct place
                    mid++;

                case 2 -> {
                    // Swap arr[mid] and arr[high], shrink 2s section
                    swap(arr, mid, high);
                    high--;
                    // Don't move mid forward yet
                }
            }
        }
    }

    // Helper function to swap two elements
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to print array manually (without Arrays.toString)
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", "); // add comma between elements
            }
        }
        System.out.println("]");
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 0, 2, 1, 0};  // input array
        sort(arr);                       // sort array
        printArray(arr);                       // print array manually
    }
}
