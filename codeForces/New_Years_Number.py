num = int(input())
while num > 0:
    year = int(input())
    p = year%2020
    k = year/2020
    if p<=k:
        print("YES")
    else:
        print("NO")
    num = num-1