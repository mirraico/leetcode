# LeetCode
## [LeetCode Algorithm](https://leetcode.com/problemset/algorithms/)
| id | Title | Solution | Note |
|----| ----- | -------- | ---- |
|1|[Two Sum](https://leetcode.com/problems/two-sum/) | [C++](./twoSum/twoSum.cpp) | 
|2|[Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | [JAVA](./addTwoNumbers/AddTwoNumbers.java) | 
|3|[Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | [JAVA](./longestSubstringWithoutRepeatingCharacters/LongestSubstringWithoutRepeatingCharacters.java) | 维护前后两个指针
|5|[Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/) | [JAVA](./longestPalindromicSubstring/LongestPalindromicSubstring.java) | dp做O(n^2)，Manacher算法可以做到O(n)
|6|[ZigZag Conversion](https://leetcode.com/problems/zigzag-conversion/) | [JAVA](./zigZagConversion/ZigZagConversion.java) | 
|7|[Reverse Integer](https://leetcode.com/problems/reverse-integer/) | [JAVA](./reverseInteger/ReverseInteger.java) | 神TM样例还越界了，最后居然上了trycatch
|8|[String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi/) | [JAVA](./stringtoInteger/StringtoInteger.java) | 
|9|[Palindrome Number](https://leetcode.com/problems/palindrome-number/) | [JAVA](./palindromeNumber/PalindromeNumber.java) | 
|10|[Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | [JAVA](./containerWithMostWater/ContainerWithMostWater.java) | h[l]小于h[r]时左移l，舍弃了(l,r-1)(l,r-2)..这样的区间，这样的区间是比(l,r)的值小的
|11|[Integer to Roman](https://leetcode.com/problems/integer-to-roman/) | [JAVA](./integertoRoman/IntegertoRoman.java) | 
|12|[Roman to Integer](https://leetcode.com/problems/roman-to-integer/) | [JAVA](./romantoInteger/RomantoInteger.java) | 
|14|[Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) | [JAVA](./longestCommonPrefix/LongestCommonPrefix.java) | 
|15|[3Sum](https://leetcode.com/problems/3sum/) | [JAVA](./3Sum/ThreeSum.java) | 快排nlgn，枚举一个数再维护前后两个指针遍历一共O(n^2)，再处理一些重复答案的细节
|16|[3Sum Closest](https://leetcode.com/problems/3sum-closest/) | [JAVA](./3SumClosest/ThreeSumClosest.java) | 和上道题思路相同
|17|[Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) | [JAVA](./letterCombinationsofaPhoneNumber/LetterCombinationsofaPhoneNumber.java) | dfs
|18|[4Sum](https://leetcode.com/problems/4sum/) | [JAVA](./4Sum/FourSum.java) | 和15思路相同O(n^3)，再预判断一些可能的最小值和最大值可以大幅减少时间
|19|[Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | [JAVA](./removeNthNodeFromEndofList/RemoveNthNodeFromEndofList.java) | 前后两个指针，后指针到底时删前指针的，头部单独处理
|20|[Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | [JAVA](./validParentheses/ValidParentheses.java) | 
|21|[Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | [JAVA](./mergeTwoSortedLists/MergeTwoSortedLists.java) | 递归从尾部开始
|22|[Generate Parentheses](https://leetcode.com/problems/generate-parentheses/) | [JAVA](./generateParentheses/GenerateParentheses.java) | 顺手测了下sb还是比string快多了
|24|[Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/) | [JAVA](./swapNodesinPairs/SwapNodesinPairs.java) | 
|26|[Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | [JAVA](./removeDuplicatesfromSortedArray/RemoveDuplicatesfromSortedArray.java) | 
|27|[Remove Element](https://leetcode.com/problems/remove-element/) | [JAVA](./removeElement/RemoveElement.java) | 
|28|[Implement strStr()](https://leetcode.com/problems/implement-strstr/) | [JAVA](./implementstrStr/ImplementstrStr.java) | KMP
|29|[Divide Two Integers](https://leetcode.com/problems/divide-two-integers/) | [JAVA](./divideTwoIntegers/DivideTwoIntegers.java) | O(logn)实现除法
|31|[Next Permutation](https://leetcode.com/problems/next-permutation/) | [JAVA](./nextPermutation/NextPermutation.java) | 根据全序列的定义模拟
|34|[Search for a Range](https://leetcode.com/problems/search-for-a-range/) | [JAVA](./searchforaRange/SearchforaRange.java) | 左右二分查找
|35|[Search Insert Position](https://leetcode.com/problems/search-insert-position/) | [JAVA](./searchInsertPosition/SearchInsertPosition.java) | 
|36|[Valid Sudoku](https://leetcode.com/problems/valid-sudoku/) | [JAVA](./validSudoku/ValidSudoku.java) | 用二维数组来标记TF
|38|[Count and Say](https://leetcode.com/problems/count-and-say/) | [JAVA](./countandSay/CountandSay.java) | 
|39|[Combination Sum](https://leetcode.com/problems/combination-sum/) | [JAVA](./combinationSum/CombinationSum.java) | dfs
|40|[Combination Sum II](https://leetcode.com/problems/combination-sum-ii/) | [JAVA](./combinationSumII/CombinationSumII.java) | 
|43|[Multiply Strings](https://leetcode.com/problems/multiply-strings/) | [JAVA](./multiplyStrings/MultiplyStrings.java) | 大数相乘的逻辑，没处理好逻辑WA了好多发，Karatsuba可以做到O(n^1.58)
|46|[Permutations](https://leetcode.com/problems/permutations/) | [JAVA](./permutations/Permutations.java) | dfs不好处理已经用过的数，用数字对换做比较方便
|47|[Permutations II](https://leetcode.com/problems/permutations-ii/) | [JAVA](./permutationsII/PermutationsII.java) | 没想通重复的原因，在46的基础上加了个答案判重，效率极低，哪天智商高点的时候再来想想
|47|[Permutations II](https://leetcode.com/problems/permutations-ii/) | [JAVA](./permutationsII-dfs/PermutationsII.java) | 不用对换了，上dfs了，重复数字必须从前往后搜索
|48|[Rotate Image](https://leetcode.com/problems/rotate-image/) | [JAVA](./rotateImage/RotateImage.java) | 
|49|[Group Anagrams](https://leetcode.com/problems/anagrams/) | [JAVA](./groupAnagrams/GroupAnagrams.java) | HashMap的使用、遍历；String、List的排序
|50|[Pow(x, n)](https://leetcode.com/problems/powx-n/) | [JAVA](./pow(x, n)/Pow.java) | 先写了理论上也是二分的超时了，原因改天再想，换了种思路二分递归
|53|[Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | [JAVA](./maximumSubarray/MaximumSubarray.java) | O(n)最大子数组
|54|[Spiral Matrix](https://leetcode.com/problems/spiral-matrix/) | [JAVA](./spiralMatrix/SpiralMatrix.java) | 模拟
|55|[Jump Game](https://leetcode.com/problems/jump-game/) | [JAVA](./jumpGame/JumpGame.java) | 
|58|[Length of Last Word](https://leetcode.com/problems/length-of-last-word/) | [JAVA](./lengthofLastWord/LengthofLastWord.java) | 
|59|[Spiral Matrix II](https://leetcode.com/problems/spiral-matrix-ii/) | [JAVA](./spiralMatrixII/SpiralMatrixII.java) | 
|60|[Permutation Sequence](https://leetcode.com/problems/permutation-sequence/) | [JAVA](./permutationSequence/PermutationSequence.java) | 神TM时间超过了99%的提交，写的有点难懂，大概就是取(n-i)!来判断第i位是什么
|61|[Rotate List](https://leetcode.com/problems/rotate-list/) | [JAVA](./rotateList/RotateList.java) | 
|62|[Unique Paths](https://leetcode.com/problems/unique-paths/) | [JAVA](./uniquePaths/UniquePaths.java) | dp
|63|[Unique Paths II](https://leetcode.com/problems/unique-paths-ii/) | [JAVA](./uniquePathsII/UniquePathsII.java) | dp
|64|[Minimum Path Sum](https://leetcode.com/problems/minimum-path-sum/) | [JAVA](./minimumPathSum/MinimumPathSum.java) | dp三连
|66|[Plus One](https://leetcode.com/problems/plus-one/) | [JAVA](./plusOne/PlusOne.java) | 
|67|[Add Binary](https://leetcode.com/problems/add-binary/) | [JAVA](./addBinary/AddBinary.java) | 
|69|[Sqrt(x)](https://leetcode.com/problems/sqrtx/) | [JAVA](./sqrt(x)/Sqrt.java) | 
|70|[Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) | [JAVA](./climbingStairs/ClimbingStairs.java) | dp
|71|[Simplify Path](https://leetcode.com/problems/simplify-path/) | [JAVA](./simplifyPath/SimplifyPath.java) | 
|73|[Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/) | [JAVA](./setMatrixZeroes/SetMatrixZeroes.java) | 
|74|[Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/) | [JAVA](./searcha2DMatrix/Searcha2DMatrix.java) | 标准二分
|75|[Sort Colors](https://leetcode.com/problems/sort-colors/) | [JAVA](./sortColors/SortColors.java) | 
|77|[Combinations](https://leetcode.com/problems/combinations/) | [JAVA](./combinations/Combinations.java) | 
|78|[Subsets](https://leetcode.com/problems/subsets/) | [JAVA](./subsets/Subsets.java) | 
|79|[Word Search](https://leetcode.com/problems/word-search/) | [JAVA](./wordSearch/WordSearch.java) | 
|80|[Remove Duplicates from Sorted Array II](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/) | [JAVA](./removeDuplicatesfromSortedArrayII/RemoveDuplicatesfromSortedArrayII.java) | 
|33|[Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | [JAVA](./searchinRotatedSortedArray/SearchinRotatedSortedArray.java) | 二分，逻辑有点乱，自己都不知道怎么过的
|81|[Search in Rotated Sorted Array II](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/) | [JAVA](./searchinRotatedSortedArrayII/SearchinRotatedSortedArrayII.java) | 上一道题的加强版，逻辑理清了二分还是很简单的
|82|[Remove Duplicates from Sorted List II](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/) | [JAVA](./removeDuplicatesfromSortedListII/RemoveDuplicatesfromSortedListII.java) | 做了补头不补头两个版本，这种涉及头部变化的最好补头，不然逻辑很乱
|83|[Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) | [JAVA](./removeDuplicatesfromSortedList/RemoveDuplicatesfromSortedList.java) | 上一道题的弱化版，最直观的就是头部不会变化了，这种就不用补头，而且特简单
|86|[Partition List](https://leetcode.com/problems/partition-list/) | [JAVA](./partitionList/PartitionList.java) | 现在想想只要不重新申请一个链表出来，申请个头部、几个指针什么的还是合理的，而且会让问题很简单，没有必要非要在原链表上进行直接操作
|88|[Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | [JAVA](./mergeSortedArray/MergeSortedArray.java) | 从后往前避免覆盖
|89|[Gray Code](https://leetcode.com/problems/gray-code/) | [JAVA](./grayCode/GrayCode.java) | 
|90|[Subsets II](https://leetcode.com/problems/subsets-ii/) | [JAVA](./subsetsII/SubsetsII.java) | 78上加一行
|91|[Decode Ways](https://leetcode.com/problems/decode-ways/) | [JAVA](./decodeWays/DecodeWays.java) | dp
|92|[Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/) | [JAVA](./reverseLinkedListII/ReverseLinkedListII.java) | 三个指针翻转
|93|[Restore IP Addresses](https://leetcode.com/problems/restore-ip-addresses/) | [JAVA](./restoreIPAddresses/RestoreIPAddresses.java) | 
|94|[Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/) | [JAVA](./binaryTreeInorderTraversal/BinaryTreeInorderTraversal.java) | 标准中序遍历
|95|[Unique Binary Search Trees II](https://leetcode.com/problems/unique-binary-search-trees-ii/) | [JAVA](./uniqueBinarySearchTreesII/UniqueBinarySearchTreesII.java) | 二叉搜索树的生成，递归有点绕，回头再做一遍（而且做的其实不严谨，这里面的下层节点都用的一个引用，这些生成的搜索树都没有分开）
