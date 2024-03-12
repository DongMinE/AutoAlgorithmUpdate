n = int(input())
arr = sorted(list(map(int, input().split())))
m = int(input())
arr2 = list(map(int, input().split()))

for i in arr2:
    ans = 0
    s = 0
    e = n - 1
    while s <= e:
        mid = (s + e) // 2

        if arr[mid] == i:
            ans = 1
            break
        elif arr[mid] < i:
            s = mid + 1
        else:
            e = mid - 1
    print(ans, end=" ")