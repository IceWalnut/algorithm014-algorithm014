public class Solution {
	public void rotate(int[] nums, int k) {
		k %= nums.length - 1;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}
	public void reverse(int[] nums, int srart, int end) {
		while (srart < end) {
			int temp = nums[srart];
			nums[srart] = nums[end];
			nums[end] = temp;
			start++;
			end--; 
		}
	}
	
}