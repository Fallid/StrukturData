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
        while printval is not None:
            print(" "+ str(printval.data), end="\t|")
            printval = printval.next
        print("")
if __name__ == '__main__':
    # Inisialisasi Objek
    jenisBarang =  Queue()
    namaBarang = Queue()
    hargaBarang = Queue()
    inputData = ""
    # Data awal
    jenisBarang.EnQueue("Sepatu sport")
    namaBarang.EnQueue("Adidas-Pro")
    hargaBarang.EnQueue("Rp.1.000.000")
    
    while inputData != "5":
        print("=============================================")
        print("Antiran Pesanan (Prioritas Kiri --> Kanan)\n")
        print("|Jenis\t\t: ", end="\b")
        jenisBarang.printList()
        print("|Nama Barang\t: ", end="\b")
        namaBarang.printList()
        print("|Harga\t\t: ", end="\b")
        hargaBarang.printList()
        
        # Menu Pilihan
        print("\nMenu Pilihan: ")
        print("[1] Tambah item. \n[2] Item selesai diproses. \n[3] Total item. \n[4] Pesanan teratas. \n[5] Exit program. \nPilih: ", end="\b")
        inputData = input()
        if(inputData == "1"):
            print("\n==== Tambah Item ====")
            print("Jenis Barang\t: ", end="\b")
            inputJenis = input()
            jenisBarang.EnQueue(inputJenis)
            
            print("Nama Barang\t: ", end="\b")
            inputNama = input()
            namaBarang.EnQueue(inputNama)
            
            print("Harga Barang\t: ", end="\b")
            inputHarga = input()
            hargaBarang.EnQueue("Rp."+inputHarga)
            
            print("\nData Berhasil Ditambahkan! \nTekan apapun untuk kembali ke halaman utama...")
            input()
            
        elif (inputData == "2"):
            print("\n==== Selesaikan Pesanan ====")
            print("Apakah anda yakin untuk menyelesaikan pesanan?\nPesanan yang sudah diselesaikan akan otomatis terhapus!\nPilih [y/n]\t: ", end="\b")
            verif = input()
            if(verif.capitalize == "Y" or "YES"):
                jenisBarang.DeQueue()
                namaBarang.DeQueue()
                hargaBarang.DeQueue()    
            elif(verif.capitalize == "N" or "NO"):
                print("Pesanan gagal diselesaikan! \nTekan apapun untuk kembali ke halaman utama...")
                input()
            else:
                print("Pesanan gagal diselesaikan! \nTekan apapun untuk kembali ke halaman utama...")
                input()
                
            print("\nPesanan Berhasil Diselesaikan! \nTekan apapun untuk kembali ke halaman utama...")
            input()
            
        elif(inputData == "3"):
            print("\n==== Total Pesanan ====")
            print("Terdapat : " + str(jenisBarang.size()) + " Pesanan")
            print("\nTekan apa saja untuk kembali ke halaman utama...")
            input()
            
        elif(inputData == "4"):
            print("\n==== Pesanan Teratas ====")
            print("|Jenis\t\t: ", end="\b")
            print(jenisBarang.peek())
            print("|Nama\t\t: ", end="\b")
            print(namaBarang.peek())
            print("|Harga\t\t: ", end="\b")
            print(hargaBarang.peek())
            print("\nTekan apapun untuk kembali ke halaman utama...")
            input()
            
        elif(inputData == "5"):
            print("Program berhenti...")
            exit(100)
        else:
            print("Program berhenti...")
            exit(100)
    