public class sorting {
        public static void main(String[] args) {
            int[] arr = {0, 1, 2, 1, 0, 2, 1, 0, 2};

            sort012(arr);

            // Print the sorted array
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

        public static void sort012(int[] arr) {
            int low = 0; // Points to the next position for 0
            int mid = 0; // Points to the current element
            int high = arr.length - 1; // Points to the next position for 2

            while (mid <= high) {
                switch (arr[mid]) {
                    case 0:
                        // Swap arr[low] and arr[mid], increment low and mid
                        int temp0 = arr[low];
                        arr[low] = arr[mid];
                        arr[mid] = temp0;
                        low++;
                        mid++;
                        break;

                    case 1:
                        // Just increment mid
                        mid++;
                        break;

                    case 2:
                        // Swap arr[mid] and arr[high], decrement high
                        int temp2 = arr[high];
                        arr[high] = arr[mid];
                        arr[mid] = temp2;
                        high--;
                        break;
                }
            }
        }
    }



