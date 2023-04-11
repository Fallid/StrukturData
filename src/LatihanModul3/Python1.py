stack = []
stack.append("Aku")
stack.append("Anak")
stack.append("Indonesia")
print("Next: " + stack[-1])
stack.append("Raya")
print(stack.pop())
stack.append("!")
count = stack.index("!")
# count -=1
# print(count)
# print(stack[-1])
print("Full Element : " ,stack)
print(len(stack))

while count <= len(stack) and count > 0 :
    
    print(stack.pop())
    count+=1
    
# print(stack.pop())
print(stack)
print(len(stack))
 
