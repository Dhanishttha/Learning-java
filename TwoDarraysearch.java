public class TwoDarraysearch {
    public static void main(String[] args) {
        
        int[][] array = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int target = 8;
        
        int[] result = search(array,  target); 

        System.out.println("Element found at row " + result[0] + ", column " + result[1]);
        }

    static int[] search (int[][] array, int target){
        for(int  row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                if(array[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }

}
