class QueueLinkList:
    def __init__(self):
        self.queue = []
        
    def enqueue(self, add):
        self.queue.append(add)
    
    def dequeue(self):
        self.queue.pop()
    
    


Queue = QueueLinkList()
Queue.enqueue("Nike")
print(*Queue)
    