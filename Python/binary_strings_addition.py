s1 = "1011"
s2 = "111"

#carry = 0
# 1 0 1 1  
# 1 0 1 1 
# 1 1 1 0
#
#1 0
#0 1
#1 1

len1 = len(s1)
len2 = len(s2)
diff_len = len1 - len2
diff_len = diff_len*-1 if(diff_len<0) else diff_len

if(len1<len2):
    s1 = diff_len*"0"+s1
else:
    s2 = diff_len*"0"+s2
    
print(s1, "  ", s2)

sum = ""
len1 = len(s1)
carry = 0
for i in range(1, len1+1):
    add = int(s1[len1-i]) + int(s2[len1-i]) + carry
    carry = 0
    if(add==0):
        sum = "0"+sum
    elif(add==1):
        sum = "1"+sum
    elif(add==2):
        sum = "0"+sum
        carry = 1
    elif(add==3):
        sum = "1"+sum
        carry = 1
    #print(sum)
    
if(carry==1):
    sum = "1"+sum
    
print(sum)


