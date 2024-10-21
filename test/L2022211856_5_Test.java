package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 测试类 L2022211856_5_Test 用于对 Solution5 类中的 numSubseq 方法进行测试
 * 测试用例设计的基本原则：
 * - 等价类划分：把输入数据的可能值划分为若干个等价类降低测试用例数量
 * - 边界值分析：对于题目条件限定的边界编写测试用例
 * - 考虑到笛卡尔积全覆盖的测试代价较高，本次实验会进行一定取舍
 */

class L2022211856_5_Test {

    @Test
    void testNumSubseq() {
        Solution5_fixed solution = new Solution5_fixed();

        // 示例 1
        /**
         * 测试目的：验证单个元素数组
         * 测试用例：[3]，target = 6
         */
        int[] nums1 = {3};
        int target1 = 6;
        int expected1 = 1;
        assertEquals(expected1, solution.numSubseq(nums1, target1));

        // 示例 2
        /**
         * 测试目的：验证含有重复元素的数组
         * 测试用例：[3, 3, 6, 8]，target = 10
         */
        int[] nums2 = {3, 3, 6, 8};
        int target2 = 10;
        int expected2 = 6;
        assertEquals(expected2, solution.numSubseq(nums2, target2));

        // 示例 3
        /**
         * 测试目的：验证较大的输入数组
         * 测试用例：[2, 3, 3, 4, 6, 7]，target = 12
         */
        int[] nums3 = {2, 3, 3, 4, 6, 7};
        int target3 = 12;
        int expected3 = 61;
        assertEquals(expected3, solution.numSubseq(nums3, target3));

        // 示例 4
        /**
         * 测试目的：验证空数组
         * 测试用例：[]，target = 8
         */
        int[] nums4 = {};
        int target4 = 8;
        int expected4 = 0;
        assertEquals(expected4, solution.numSubseq(nums4, target4));

        // 示例 5
        /**
         * 测试目的：验证target小于数组最小值
         * 测试用例：[1, 2, 3]，target = 0
         */
        int[] nums5 = {1, 2, 3};
        int target5 = 0;
        int expected5 = 0;
        assertEquals(expected5, solution.numSubseq(nums5, target5));

        // 示例 6
        /**
         * 测试目的：验证target大于数组最大值
         * 测试用例：[1, 2, 3]，target = 10
         */
        int[] nums6 = {1, 2, 3};
        int target6 = 10;
        int expected6 = 7; // 2^3 - 1 = 7
        assertEquals(expected6, solution.numSubseq(nums6, target6));

        // 示例 7
        /**
         * 测试目的：验证所有元素相同的数组
         * 测试用例：[4, 4, 4, 4]，target = 8
         */
        int[] nums7 = {4, 4, 4, 4};
        int target7 = 8;
        int expected7 = 15; // 2^4 - 1 = 15
        assertEquals(expected7, solution.numSubseq(nums7, target7));
    }
}