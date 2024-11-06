# https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful/description/?envType=daily-question&envId=2024-11-05
class Solution:
    def _split(self, s):
        mid = len(s) >> 1
        if mid % 2 == 1:
            return s[0:mid+1], s[mid+1:]
        return s[0:mid], s[mid:]
    def _numOfChanges(self, part):
        return 1 if part[0] != part[1] else 0
    def minChanges(self, s):
        if len(s) == 2:
            return self._numOfChanges(s)
        part1, part2 = self._split(s)
        return self.minChanges(part1) + self.minChanges(part2)


s = Solution()

print(s.minChanges("010010") == 2)
# print(s.minChanges("11000111") == 1)
# print(s.minChanges("1001") == 2)
# print(s.minChanges("10") == 1)
# print(s.minChanges("0000") == 0)