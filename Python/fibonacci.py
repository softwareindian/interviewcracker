import sys
n=8
counter = 2
temp=0
n1,n2 = 1,1
if(n==1):
    print(n1,)
    system.exit(0)
if(n==2):
    print(n1, " ",n2,)
    system.exit(0)
    
if(n>2):
    print(n1)
    print(n2)

while(counter<n):
    print(n1+n2,)
    temp = n1
    n1 = n2
    n2 = temp+n2
    counter = counter+1
    
