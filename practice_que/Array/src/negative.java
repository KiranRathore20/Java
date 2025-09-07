public class negative {
        public static void main(String[] args) {
            int[] arr = {1, -2, 3, -4, -5, 6, -7, 8, 9};

            moveNegativesToLeft(arr);

            // Print the rearranged array
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

        public static void moveNegativesToLeft(int[] arr) {
            int left = 0; // Pointer for the next position of a negative element
            int right = arr.length - 1; // Pointer for the next position of a non-negative element

            while (left <= right) {
                if (arr[left] < 0) {
                    // If the element at 'left' is negative, it's already in the correct place
                    left++;
                } else if (arr[right] >= 0) {
                    // If the element at 'right' is non-negative, it's already in the correct place
                    right--;
                } else {
                    // Swap arr[left] and arr[right]
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }
        }
    }