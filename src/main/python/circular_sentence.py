# https://leetcode.com/problems/circular-sentence/?envType=daily-question&envId=2024-11-02
class Solution:
    def isCircularSentence(self, sentence: str) -> bool:
        i = sentence[0:].find(" ")
        while i != -1:
            if sentence[i - 1] != sentence[i + 1]:
                return False

            i = i + 1 + sentence[i + 1:].find(" ") if sentence[i + 1:].find(" ") != -1 else -1
        return sentence[0] == sentence[-1]

s = Solution()

print(s.isCircularSentence("leetcode exercises sound delightful"))
print(s.isCircularSentence("leetcode") == False)
print(s.isCircularSentence("eetcode"))