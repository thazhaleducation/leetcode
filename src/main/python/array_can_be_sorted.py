# https://leetcode.com/problems/find-if-array-can-be-sorted/description/?envType=daily-question&envId=2024-11-06

class Segment:
    def __init__(self, small, big):
        self.small = small
        self.big = big

    def isSmall(self, segment):
        return self.big <= segment.small


class Solution:
    def canSortArray(self, nums: list[int]) -> bool:
        segments = []
        set_bits = nums[0].bit_count()
        big = nums[0]
        small = nums[0]
        for i in nums[1:]:
            if i.bit_count() == set_bits and big < i:
                big = i
            elif i.bit_count() == set_bits and small > i:
                small = i
            elif i.bit_count() != set_bits:
                segments.append(Segment(small, big))
                set_bits = i.bit_count()
                small = i
                big = i
            else:
                continue
        segments.append(Segment(small, big))
        prev = segments[0]
        for s in segments[1:]:
            if prev.big > s.small:
                return False
            prev = s
        return True


s = Solution()

print(s.canSortArray([65,156,127,251,191]))
# print(s.canSortArray([2,28,9]))
# print(s.canSortArray([8,4,2,30,15]))
# print(s.canSortArray([1,2,3,4,5]))
# print(s.canSortArray([3,16,8,4,2]))
