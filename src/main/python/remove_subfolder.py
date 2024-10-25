
# https://leetcode.com/problems/remove-sub-folders-from-the-filesystem/
def removeSubfolders(folder):
    folder.sort()
    folder = [f+"/" for f in folder]
    result = []
    current = folder[0]
    for f in folder[1:]:
        if f.startswith(current):
            continue
        else:
            result.append(current)
            current = f
    result.append(current)
    return [r[:-1] for r in result]


# #
# print(removeSubfolders(["/a","/a/b","/c/d","/c/d/e","/c/f"]))
# print(removeSubfolders(["/c/f"]))
# print(removeSubfolders(["/c/d","/c/f"]))
# print(removeSubfolders(["/a", "/c/d","/c/d/e"]))
# print(removeSubfolders(["/a","/a/b","/c/d","/c/d/e","/c/f"]))
# print(removeSubfolders(["/a","/a/b/c","/a/b/d"]))
# print(removeSubfolders(["/a/b/c","/a/b/ca","/a/b/d"]))
print(removeSubfolders(["/c","/d/c/e"]))

# print(hasRoot(["/a/b"], "/a"))
# print(getSubDirs(["/a/b"], "/a"))
