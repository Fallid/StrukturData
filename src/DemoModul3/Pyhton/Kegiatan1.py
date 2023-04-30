stack = []
stack.append("Struktur")
stack.append("Data")

# reverse function
reverse = []
for index in stack:
    reverse.insert(0,index [::-1])

print(*reverse)
