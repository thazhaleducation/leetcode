# https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful/description/?envType=daily-question&envId=2024-11-05
class Solution:

    def minChanges(self, s):
        count = 0
        i = 0
        l = len(s) - 1
        while i < l:
            if s[i] != s[i+1]:
                count += 1
            i = i + 2
        return count



s = Solution()

print(s.minChanges("010010") == 2)
print(s.minChanges("11000111") == 1)
print(s.minChanges("1001") == 2)
print(s.minChanges("10") == 1)
print(s.minChanges("0000") == 0)