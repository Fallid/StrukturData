class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Queue:
    def __init__(self):
        self.front = self.rear = None
        self.qsize = 0
    
    def isEmpty(self):
        return self.front == None
    
    def peek(self):
        if self.isEmpty():
            raise Exception("No Value Head in Queue")
        return self.front.data
    def size(self):
        return self.qsize
    def EnQueue(self, item):
        temp = Node(item)
        
        if self.rear == None:
            self.front = self.rear = temp
            self.qsize += 1
            return
        self.qsize += 1
        self.rear.next = temp
        self.rear = temp
        
    def DeQueue(self):
        if self.isEmpty():
            return
        temp = self.front
        self.front = temp.next
        if(self.front == None):
            self.rear = None
        self.qsize -= 1
            
    def printList(self):
        printval = self.front
        print("Queue : ", end="")
        while printval is not None:
            print(str(printval.data), end=" ")
            printval = printval.next

if __name__ == '__main__':
    q = Queue()
    q.EnQueue(40)
    q.EnQueue(20)
    q.EnQueue(30)
    # q.DeQueue()
    # q.DeQueue()
    print(q.peek())
    q.printList()
    # print("Queue Front : " + str(q.front.data))
    print(q.size())
    print(q.isEmpty())