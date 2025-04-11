public class Main
{
	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Input array
        int[] expectedNums = {0,1,2,3,4}; // The expected answer with correct length
        
        int k = removeDuplicates(nums); // Calls your implementation
        
        System.out.println(k);
        //assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            if (!(nums[i] == expectedNums[i])){System.out.println("Error");}
            else {System.out.println("Success");}
        }
	}
	
    public static int removeDuplicates(int[] nums) {
        int[] uniqueList = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }

        System.out.println("-------");
        int unique = nums.length;
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = 0; j < uniqueList.length; j++){
                if (nums[i] != uniqueList[j]){
                    
                }
            }
            uniqueList[count++] = nums[i];
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    //System.out.println(unique);
                    for (int x = j; x < nums.length - 1; x++){
                        //int aux = nums[x + 1];
                        
                        nums[x] = nums[x + 1];
                    }
                }
            }
        }

        System.out.println("-------");
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }

        return count;
    }
}