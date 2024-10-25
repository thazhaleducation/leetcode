def arrayRankTransform(self, arr: list[int]) -> list[int]:
    rank = list(set(arr))
    [rank.index(x) + 1 for x in arr]