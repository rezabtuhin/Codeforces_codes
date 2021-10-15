testcase = int(input())
for i in range(1,testcase+1):
    a, b = map(int, input().split())
    if a%b == 0:
        print("0")
    else:
        ans = b - (a%b)
        print(ans)