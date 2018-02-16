public class CodingBatRecursion2 {
    public boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;
        return groupSum(start + 1, nums, target - nums[start])
                || groupSum(start + 1, nums, target);
    }

    public boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;
        if (nums[start] == 6)
            return groupSum6(start + 1, nums, target - nums[start]);
        return groupSum6(start + 1, nums, target - nums[start])
                || groupSum6(start + 1, nums, target);
    }

    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;
        return groupNoAdj(start + 2, nums, target - nums[start])
                || groupNoAdj(start + 1, nums, target);
    }

    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;
        if (nums[start] % 5 == 0) {
            if (start < nums.length - 1 && nums[start + 1] == 1)
                return groupSum5(start + 2, nums, target - nums[start]);
            return groupSum5(start + 1, nums, target - nums[start]);
        }
        return groupSum5(start + 1, nums, target - nums[start])
                || groupSum5(start + 1, nums, target);
    }

    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;

        int sum = nums[start];
        int count = 1;
        for (int i = start + 1; i < nums.length; i++)
            if (nums[i] == nums[start]) {
                sum += nums[i];
                count++;
            }
        return groupSumClump(start + count, nums, target - sum)
                || groupSumClump(start + count, nums, target);
    }
////======================================================================================================

    public boolean splitArray(int[] nums) {
        return foo(0, nums, 0, 0);
    }

    private boolean foo(int start, int[] nums, int sum1, int sum2) {
        if (start >= nums.length) return sum1 == sum2;
        return foo(start + 1, nums, sum1 + nums[start], sum2)
                || foo(start + 1, nums, sum1, sum2 + nums[start]);
    }
////======================================================================================================

    public boolean splitOdd10(int[] nums) {
        return foo2(0, nums, 0, 0);
    }

    private boolean foo2(int start, int[] nums, int sum1, int sum2) {
        if (start >= nums.length)
            return sum1 % 10 == 0 && sum2 % 2 == 1 || sum1 % 2 == 1
                    && sum2 % 10 == 0;
        return foo2(start + 1, nums, sum1 + nums[start], sum2)
                || foo2(start + 1, nums, sum1, sum2 + nums[start]);
    }
////======================================================================================================

    public boolean split53(int[] nums) {
        return foo3(0, nums, 0, 0);
    }

    private boolean foo3(int start, int[] nums, int sum1, int sum2) {
        if (start >= nums.length) return sum1 == sum2;
        if (nums[start] % 5 == 0)
            return foo3(start + 1, nums, sum1 + nums[start], sum2);
        if (nums[start] % 3 == 0)
            return foo3(start + 1, nums, sum1, sum2 + nums[start]);

        return foo3(start + 1, nums, sum1 + nums[start], sum2)
                || foo3(start + 1, nums, sum1, sum2 + nums[start]);
    }
}
