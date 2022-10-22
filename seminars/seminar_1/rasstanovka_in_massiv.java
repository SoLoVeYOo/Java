// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

package seminars.seminar_1;

import java.util.Arrays;

public class rasstanovka_in_massiv {
    public static void main(String[] args) {
        int[] nums = new int[] {3,2,2,5,3,2,2};
        System.out.println(Arrays.toString(nums));
        int val = 3;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = nums.length-1; j > i; j--) {
                    if (nums[j] != val) {
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    // static void pushToEnd(int arr[], int n)
    // {
    //     int count = 0;

    //     for (int i = 0; i < n; i++)
    //         if (arr[i] != 3) {
    //             arr[count++] = arr[i];
    //             System.out.println(arr[i]);
    //         }
    //     while (count < n)
    //         arr[count++] = 3;
    // }
    // public static void main (String[] args)
    // {
    //     int arr[] = {5, 3, 2, 3, 2};
    //     int n = arr.length;
    //     pushToEnd(arr, n);
    //     System.out.println("Тройки в конце ");
    //     for (int i=0; i<n; i++)
    //         System.out.print(arr[i]+" ");
    // }
}