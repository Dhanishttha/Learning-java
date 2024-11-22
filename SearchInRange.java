public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,1,3,5,6};
        int target = 5;
        System.out.println(LinearSearchInRange(arr, target, 1, 6));
    }


    static int LinearSearchInRange (int[] arr, int target, int start, int end) {
        if (arr.length == 0 ) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
    return -1;
    }   
}
