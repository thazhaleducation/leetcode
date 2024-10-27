# https://leetcode.com/problems/height-of-binary-tree-after-subtree-removal-queries/description/?envType=daily-question&envId=2024-10-26
from unittest.mock import right


class TreeNode:
  def __init__(self, val=0, left=None, right=None):
    self.val = val
    self.left = left
    self.right = right



def getChild(list, index, leftOrRight):
    leftIndex = 2 * index + leftOrRight
    try:
        return list[leftIndex]
    except IndexError:
        return None

def getLeft(list, index):
    return getChild(list, index, 1)

def getRight(list, index):
    return getChild(list, index, 2)

def setChild(node, left, right):
    node.left = left
    node.right = right

def buildTree(list):
    tree_nodes = [TreeNode(val=x) for x in list]
    [setChild(x, getLeft(tree_nodes, index), getRight(tree_nodes, index)) for index, x in enumerate(tree_nodes)]
    return tree_nodes[0]

class Solution:

    def __init__(self):
        self.depths = {}
        self.heights = {}
        self.levels = {}
        self.queries = []
        self.level_max_height = {}

    def buildHeights(self, node, depth=0):
        if not node:
            return -1
        self.depths[node.val] = depth
        leftHeight = self.buildHeights(node.left, depth + 1)
        rightHeight = self.buildHeights(node.right, depth + 1)
        self.heights[node.val] = 1 + max(leftHeight, rightHeight)

        return self.heights[node.val]

    def update_level_heights(self, node):
        if not node:
            return
        depth = self.depths[node.val]
        if depth not in self.level_max_height:
            self.level_max_height[depth] = []
        self.level_max_height[depth].append(self.heights[node.val])
        self.update_level_heights(node.left)
        self.update_level_heights(node.right)


    def treeHeight(self, query):
        depth = self.depths[query]
        max_heights = self.level_max_height[depth]

        if len(max_heights) == 1:
            return depth - 1
        elif max_heights[0] == self.heights[query]:
            return depth + (max_heights[1] if len(max_heights) > 1 else 0)
        else:
            return depth + max_heights[0]

    def treeQueries(self, root, queries):
        self.buildHeights(root)
        self.update_level_heights(root)
        for depth in self.level_max_height:
            self.level_max_height[depth].sort(reverse=True)

        self.queries = queries
        return [self.treeHeight(query) for query in self.queries]


print(Solution().treeQueries(buildTree([5,8,9,2,1,3,7,4,6]), [3,2,4,8]))
print(Solution().treeQueries(buildTree([1,3,4,2,None,6,5,None,None,None,None,None,7]), [4]))


with open("testcase.txt") as f:
    content = f.readlines()
    tree = buildTree([int(i) if i != 'null' else None for i in content[0].split(",")])
    queries1 = [int(i) if i != 'null' else None for i in content[1].split(",")]

def findNode(root, val):
    if root is None:
        return None

    if root.val == val:
        return root

    return findNode(root.left, val) or findNode(root.right, val)

print(Solution().treeQueries(tree, queries1))

