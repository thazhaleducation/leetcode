# https://leetcode.com/problems/string-compression-iii/description/?envType=daily-question&envId=2024-11-04

class Solution:
    def compressedString(self, word):
        comp = ""
        count = 1
        prev = word[0]
        for c in word[1:]:
            if count == 9 or c != prev:
                comp += f"{count}{prev}"
                prev = c
                count = 1
            else:
                count = count + 1
        comp += f"{count}{prev}"
        return comp


s = Solution()
print(s.compressedString("aaaaaaaaay") )
assert (s.compressedString("abcde") == "1a1b1c1d1e")
assert (s.compressedString("aaaaaaaaaaaaaabb") == "9a5a2b")
assert (s.compressedString("aaaaaaaaaaaaaabbbbbbbbb") == "9a5a9b")
assert (s.compressedString("aaaaaaaaay") == "9a1y")
