class Node :
    def __init__(self, data = None):
        self.data = data
        self.next = None

class QueueLinklist:
    def __init__(self):
        self.head = None
    
    def _len_(self):
        count = 0
        node = self.head
        while node:
            count += 1
            node = node.next
        return count
    
    def _getitem_(self, index):
        if index >= len(self):
            raise IndexError('Index out of range')
        node = self.head
        for i in range(index):
            node = node.next
        return node.data
    
    def enqueue(self, value):
        new_node = Node(value)
        if self.head is None:
            self.head = new_node
        else:
            node = self.head
            while node.next:
                node = node.next
            node.next = new_node
    
    def dequeue(self, index =- 1):
        if self.head is None:
            raise IndexError('Index out of range')
        elif index == 0:
            value = self.head.data
            self.head = self.head.next
        else:
            node = self.head
            for i in range(index - 1):
                node = node.next
                if node is None:
                    raise IndexError('Index out of range')
            if index == -1:
                index = len(self) - 1
            value = node.next.data
            node.next = node.next.next
        return value
    
    def printList(self):
        printval = self.head
        print("Queue : ", end="")
        while printval is not None:
            print(str(printval.data), end=" ")
            printval = printval.next

    # def peek():
    #     print("Peek")
    
    # def isEmpty():
    #     print("Peek")

    # def size():
    #     print("Size")

Queue = QueueLinklist()
Queue.enqueue("Nike")
Queue.enqueue("1.000.000")
Queue.printList()


    
