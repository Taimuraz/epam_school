public class CodingBatArray2 {
    public static void main(String[] args) {
    }

    public int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for( int i = 1; i < nums.length; i ++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        return max - min;
    }


    public int countEvens(int[] nums) {
        int count = 0;
        for( int i = 0; i < nums.length; i ++){
            if( nums[i] % 2 == 0){
                count ++;
            }
        }

        return count;
    }


    public static int sum13(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i ++){
            if( i > 0){
                if(  nums[i] != 13 && nums[i-1] != 13){
                    sum += nums[i];
                }
            }else{
                if(  nums[i] != 13){
                    sum += nums[i];
                }
            }

        }

        return sum;
    }

    public int sum67(int[] nums) {
        int sum = 0;
        boolean open = false;
        for( int i = 0; i < nums.length; i ++){
            if( nums[i] == 6){
                open = true;
                continue;
            }
            if( open && nums[i] == 7){
                open = false;
                continue;
            }
            if( !open){
                sum += nums[i];
            }
        }
        return sum;
    }

    public boolean has22(int[] nums) {
        for( int i = 0; i < nums.length; i ++){
            if( nums[i] == 2 && nums[i + 1] == 2)
                return true;
        }
        return false;
    }

    public boolean lucky13(int[] nums) {
        boolean find = false;
        for( int i = 0; i < nums.length; i ++){
            if( nums[i] == 3 || nums[i] == 1){
                find = true;
            }
        }

        if( !find){
            return true;
        }else{
            return false;
        }
    }

    public boolean sum28(int[] nums) {
        int sum = 0;
        for( int i = 0; i < nums.length; i++){
            if(nums[i] == 2){
                sum += 2;
            }
        }
        if( sum == 8){
            return true;
        }
        return false;
    }


    public boolean more14(int[] nums) {
        int one = 0;
        int four = 0;
        for( int i = 0; i < nums.length; i ++){
            if( nums[i] == 1){
                one ++;
            }
            if( nums[i] == 4){
                four ++;
            }
        }
        if( one > four){
            return true;
        }
        return false;
    }

    public int centeredAverage(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
        }
        return (sum - (max + min)) / (nums.length - 2);
    }


    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 1 && nums[i] != 4) return false;
        return true;
    }

    public boolean no14(int[] nums) {
        int ones = 0;
        int fours = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) ones++;
            if (nums[i] == 4) fours++;
        }
        return ones == 0 || fours == 0;
    }

    public boolean isEverywhere(int[] nums, int val) {
        boolean flag1 = true;
        boolean flag2 = true;

        for (int i = 0; i < nums.length; i += 2)
            if (nums[i] != val) flag1 = false;

        for (int i = 0; i < nums.length - 1; i += 2)
            if (nums[i + 1] != val) flag2 = false;

        return flag1 || flag2;
    }

    public boolean either24(int[] nums) {
        Boolean twos = false;
        Boolean fours = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) twos = true;
            if (nums[i] == 4 && nums[i + 1] == 4) fours = true;
        }
        return twos ^ fours;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++)
            if (nums1[i] != nums2[i]
                    && Math.abs(nums1[i] - nums2[i]) <= 2)
                count++;
        return count;
    }

    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == 7 && nums[i + 1] == 7) return true;

        for (int i = 0; i < nums.length - 2; i++)
            if (nums[i] == 7 && nums[i + 2] == 7) return true;

        return false;
    }

    public boolean has12(int[] nums) {
        int one = -1;
        int two = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) one = i;
            if (nums[i] == 2) two = i;
        }
        if( one == -1){
            return false;
        }
        return two > one;
    }

    public boolean modThree(int[] nums) {
        for (int i = 0; i <= nums.length - 3; i++) {
            boolean cond1 = nums[i] % 2 == 0 && nums[i + 1] % 2 == 0
                    && nums[i + 2] % 2 == 0;
            boolean cond2 = nums[i] % 2 == 1 && nums[i + 1] % 2 == 1
                    && nums[i + 2] % 2 == 1;
            if (cond1 || cond2) return true;
        }
        return false;
    }

    public boolean haveThree(int[] nums) {
        int count = 0;
        int pos = -2; // in case nums[0] == 3

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count++;
                if (i - pos == 1) return false;
                pos = i;
            }
        }

        return count == 3;
    }

    public boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 2) {
                int count = 0;
                for (int j = i; j < nums.length; j++)
                    if (nums[j] == 2) count++;
                    else break;
                i += count;
                if (count < 2) return false;
            }
        return true;
    }

    public boolean sameEnds(int[] nums, int len) {
        for (int i = 0, j = nums.length - len; i < len; i++, j++)
            if (nums[i] != nums[j]) return false;
        return true;
    }

    public boolean tripleUp(int[] nums) {
        for (int i = 0; i <= nums.length - 3; i++)
            if (nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i] + 2)
                return true;
        return false;
    }


    public int[] fizzArray3(int start, int end) {
        int[] res = new int[end-start];

        for (int i = 0; i < res.length; i++) // index 0
        {
            if (start < end) {
                res[i] = start;
                start++;
            }
        }
        return res;
    }

    public int[] shiftLeft(int[] nums) {
        if (nums.length > 0) {
            int first = nums[0];
            for (int i = 0; i < nums.length - 1; i++)
                nums[i] = nums[i + 1];
            nums[nums.length - 1] = first;
        }
        return nums;
    }


    public int[] tenRun(int[] nums) {
        boolean replace = false;
        int multiple = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                if (!replace) {
                    replace = true;
                    multiple = nums[i];
                } else
                    multiple = nums[i];
            }
            if (nums[i] % 10 != 0 && replace) nums[i] = multiple;
        }
        return nums;
    }

    public int[] pre4(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 4) count++;
            else break;
        }
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++)
            result[i] = nums[i];
        return result;
    }


    public int[] post4(int[] nums) {
        int last4 = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 4) last4 = i;

        int[] res = new int[nums.length - (last4 + 1)];
        for (int i = last4 + 1, j = 0; i < nums.length; i++, j++)
            res[j] = nums[i];

        return res;
    }

    public int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++)
            if (nums[i] == val && nums[i - 1] != val
                    && nums[i + 1] != val)
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
        return nums;
    }

    public int[] zeroFront(int[] nums) {
        int[] res      = new int[nums.length];
        int zeroPos    = 0;
        int nonZeroPos = res.length - 1;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 0)
                res[zeroPos++]    = 0;
            else
                res[nonZeroPos--] = nums[i];

        return res;
    }


    public int[] withoutTen(int[] nums) {
        int[] copy = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 10) {
                copy[index] = nums[i];
                index++;
            }
        return copy;
    }


    public int[] zeroMax(int[] nums) {
        int largestOdd = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 == 1 && nums[i] > largestOdd)
                largestOdd = nums[i];
            if (nums[i] == 0)
                nums[i] = largestOdd;
        }
        return nums;
    }

    public int[] evenOdd(int[] nums) {
        int[] res   = new int[nums.length];
        int evenPos = 0;
        int oddPos  = res.length - 1;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] % 2 == 0)
                res[evenPos++] = nums[i];
            else
                res[oddPos--]  = nums[i];
        return res;
    }



}
