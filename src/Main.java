public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,7,5,6,8}; //nums = [1,2,10,5,7]t [541, 783, 433, 744]f [1,1,1]f [100,21,100]t [2,3,1,2]f
        System.out.println("Result is " + canBeIncreasing(nums));
    }

    public static boolean canBeIncreasing(int[] nums) {

        int count=0;
        int p=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1] || nums[i]==nums[i+1]) {
                count++;
                p=i;
            }
        }
        if(count>1) return false;
        else if(count==1){
            if(p==0 || p== nums.length-2) return true;
            if(nums[p+1]>nums[p-1] || nums[p+2]>nums[p]) return true;
            else return false;
        }
        return true;
    }
}
