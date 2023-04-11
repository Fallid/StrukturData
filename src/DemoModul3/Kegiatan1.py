stack = []
stack.append("Struktur")
stack.append("Data")
# slicing operator
# reverse = stack[::-1]
reverse = []
for index in stack:
    reverse.insert(0,index)
# reverse function
# stack.reverse()
print(*reverse, sep="")
