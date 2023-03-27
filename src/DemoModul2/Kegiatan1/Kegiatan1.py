#inisiasi arraylist (dinamis)
animal = []

#Penambahan element untuk nomor 1
animal.append("Angsa")
animal.append("Bebek")
animal.append("Cicak")
animal.append("Domba")
animal.append("Elang")
animal.append("Gajah")

print("===== Nomor 1 ===== \nOutput :")
print(animal)

#Penambahan element badak dan bebek untuk nomor 2
animal.append("Badak")
animal.append("Bebek")

print("\n===== Nomor 2 =====\nOutput :")
print(animal)
bebek =  animal.count("Bebek")
print("Bebek : " + str(bebek))

#Mencari posisi index bebek menggunakan looping dan enumerate karena menggunakan function index() yang ditampilkan hanyalah element pertama saja
print("Posisi Index : ", end="")
for index, element in enumerate(animal):
    if element == "Bebek":
        print(str(index), "\b, ", end="")

print("\n\n===== Nomor 3 ===== \nOutput :")
animal.remove("Bebek")
print(animal)

print("\n===== Nomor 4 ===== \n")
#Menampilkan index ke-0 dan ke-2
print("Index ke-0 : ", animal[0])
print("Index ke-2 : ", animal[2])
#Menghapus index ke-0
animal.remove(animal[0])
print(animal)

print("\n===== Nomor 5 ===== \nOutput :")
#Mengubah index ke-0 (Cicak) menjadi Ular
animal[0] = "Ular"
#Menyisipkan element baru pada index ke-2 dengan nilai valuenya adalah itik
animal.insert(2, "Itik")
print(animal)

print("\n===== Nomor 6 ===== \nOutput :")
#Mengahapus antara index ke-2 sampai index ke-5
#Bisa menggunakan syntax dibawah ini atau menggunakan looping dan menggunakan remove() function
del animal[2:5]
print(animal)

print("\n===== Nomor 7 ===== \nOutput :")
#Mendapatkan jumlah total element untuk referensi index terakhir
size = len(animal)
#Menampilkan element pertama dan element terakhir
print("Element Pertama :  " ,animal[0])
print("Element Kedua   :  " ,animal[size-1]) #size-1 karena index dimulai dari 0 sehingga index terakhir berarti n-1

print("\n===== Nomor 8 ===== \nOutput :")
#Menampilkan jumlah arraylist menggunakan len() function, len atau length berfungsi untuk mengetahui total array dihitung dari 1 sampai seterusnya
print("Jumlah Element : " ,len(animal))

print("\n===== Nomor 9 ===== \nOutput :")
#Menampilkan posisi index dari element Badak menggunakan index() function
print("Posisi Index Badak : ", animal.index("Badak"))