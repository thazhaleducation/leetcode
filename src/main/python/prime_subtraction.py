# https://leetcode.com/problems/prime-subtraction-operation/description/

class Solution:
    def is_prime(self, x):
        count = 0
        for i in range(2, x):
            if count == 1:
                return False
            if x % i == 0:
                count = count + 1
        return True

    def find_optimal_prime(self, f_prime, prev, curr):
        if not len(f_prime):
            return -1

        for i in reversed(f_prime):
            if curr - i <= prev:
                continue
            return i
        return -1

    def primeSubOperation(self, nums):
        prime = [i for i in range(2, 1000) if self.is_prime(i)]
        prev = 0
        result = []
        for curr in nums:
            f_prime = [p for p in prime if p < curr]
            prime_to_subtract = self.find_optimal_prime(f_prime, prev, curr)
            if prime_to_subtract == -1:
                if prev < curr:
                    prev = curr
                    result.append(prev)
                    continue
                else:
                    return False

            prev = curr - prime_to_subtract

            result.append(prev)

        return True



s = Solution()
# print(s.find_lowest_point([4,9,6,10]))
# print(s.find_lowest_point([998,2]))
# print(s.find_lowest_point([6,8,11,12]))
# print(s.find_lowest_point([5,8,3]))
# print(s.primeSubOperation([18,12,14,6]))
print(s.primeSubOperation([8,19,3,4,9]))
# print(s.primeSubOperation([998,2]))
# print(s.primeSubOperation([4,9,6,10]))
# print(s.primeSubOperation([6,8,11,12]))
# print(s.primeSubOperation([5,8,3]))
