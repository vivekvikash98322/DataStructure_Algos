package array_strings.arraysProbems.TwoSortedArrayMerge;

/**
 *  Given two sorted integer arrays arr1 and arr2, return a new array that combines both of them and is also sorted.
 */
public class TwoSortedArrayMerge {

    public static void main(String[] args) {

        int arr1[] = { 1, 4, 7, 20 };
        int arr2[] = { 3, 5, 6 };

        int arr1P = 0;
        int arr2P = 0;

        int ans[] = new int[arr1.length + arr2.length];
        int index = 0;
        while (arr1P < arr1.length && arr2P < arr2.length) {

            if (arr1[arr1P] < arr2[arr2P]) {
                ans[index] = arr1[arr1P];
                arr1P++;
            } else {
                ans[index] = arr2[arr2P];
                arr2P++;
            }

            index++;
        }

        while (arr1P < arr1.length ) {

            ans[index] = arr1[arr1P];
            arr1P++;
            index++;
        }

        while (arr2P < arr2.length) {

            ans[index] = arr2[arr2P];
            arr2P++;
            index++;
        }


        for (int i : ans) {
            System.out.println(i);
        }
    }
}
