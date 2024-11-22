public class search {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,2,1,3,5,6};
        int target = 5;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    //search in the array: return the index if item found , otherwise print item not found
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
    

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }        
}
  

