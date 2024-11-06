# https://leetcode.com/problems/rotate-string/?envType=daily-question&envId=2024-11-03
class Solution:
    def _shift(self, s):
        return s[1:] + s[0]

    # Approach2
    def rotateString1(self, s: str, goal: str) -> bool:
        return len(s) == len(goal) and goal in s + s
    # Approach1
    def rotateString(self, s: str, goal: str) -> bool:
        l = len(s)

        if s == goal:
            return True
        a = s
        for i in range(l):
            a = self._shift(a)
            if a == goal:
                return True
        return False

s = Solution()

print(s.rotateString("abcde", "cdeab"))
print(s.rotateString("abcde", "abced"))
