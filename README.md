Nama: Jabbar Hafizh Abdillah
NIM: 2409116116
Kelas: Sistem Informasi C 24
# Post-Test-4-PBO

## Deskripsi Program

Program ini merupakan sistem untuk memanajemen dari warung internet. Adapun yang bisa dilakukan oleh user adalah hal-hal umum seperti CRUD(Create, Read, Update, Delete). Adapun yang disimpan disini adalah data pelanggan yaitu berupa:

1. Nama Pelanggan
2. Durasi (jam)
3. Total Harga
4. Nomor PC

## Pilihan Menu

1. Tambah Pelanggan
2. Lihat Data Pelanggan
3. Ubah Data Pelanggan
4. Hapus Data Pelanggan
5. Cari Pelanggan
6. Keluar


## Packages dan Penerapan MVC

- Packages Main

  <img width="239" height="42" alt="image" src="https://github.com/user-attachments/assets/4e84f0d1-19de-4b7d-9fdb-24bd5e5e63d8" />

  Di packages Main terdapat class Main yang diperlukan untuk menjalankan menampilkan menu yang akan dilihat oleh user. Class Main disini sebagai penghubung dari user dan sistem yang dimana user bisa menginput dan sistem menampilkan hasilnya. Untuk penerapan MVC disini menerapkan yang View, yang dimana bagian View menampilkan informasi ke user dan menerima input dari user.

- Packages Service

  <img width="203" height="44" alt="image" src="https://github.com/user-attachments/assets/abd7a2de-6fc6-4be1-95ed-c67b15d744c4" />

  Di packages Service terdapat class Warnet yang berisikan logika untuk class Main dan berisi array list data awalan pelanggan. Class Warnet disini sebagai yang sistem yang menghitung atau menjalakan inputan yang kemudian akan ditampilkan melalui Main. Untuk penerapan MVC disini menerapkan yang Controller, yang dimana bagian Controller ini berisikan hal-hal yang mengatur alur data dan logika aplikasi.

- Packages Model

  <img width="243" height="116" alt="image" src="https://github.com/user-attachments/assets/66cfbd87-e942-49f4-a84f-11f7b990037c" />

  Di packages Model terdapat class Pelanggan yang berisikan constructor untuk menyimpan data-data pelanggan. Class Pelanggan disini akan digunakan untuk menyimpan data-data dari pelanggan yang kemudian akan dipanggil untuk ditampilkan. Untuk penerapan MVC disini menerapkan yang Model, yang dimana bagian Model ini bagian yang menangani data dari suatu sistem.


## Penerapan Access Modifier

- private

  Ini diterapkan pada properties yang dimana agar data pelanggan tidak bisa sembarangan diubah dari luar.

- public

  Ini diterapkan pada constructor agar class lain bisa memanggil constructornya untuk menampilkan data pelanggan.

- private final

  Ini diterapkan pada array list untuk melindungi daftar pelanggan supaya tidak bisa diganti sembarangan, hanya bisa dikelola melalui method CRUD yang sudah disediakan.

## Validasi Input dan Fitur Search

<img width="593" height="172" alt="image" src="https://github.com/user-attachments/assets/7a77aa39-a558-49a2-952d-9f3bd2e03f2f" />
<img width="601" height="200" alt="image" src="https://github.com/user-attachments/assets/1f6e0945-db6a-4da8-8423-aad69ee4b745" />
<img width="570" height="165" alt="image" src="https://github.com/user-attachments/assets/e8ee1286-2bba-4bef-9526-2d1e595d3ada" />
<img width="673" height="157" alt="image" src="https://github.com/user-attachments/assets/c02dbeab-a631-47f9-ab63-653adf30de21" />
<img width="701" height="158" alt="image" src="https://github.com/user-attachments/assets/263f2571-7a63-49eb-841b-5296e74eb687" />


Untuk validasi input diterapkan pada saat pemilihan Menu agar pengguna tidak bisa memasukkan hal-hal lain selain angka. Kemudian, sama juga seperti yang menu terdapat validasi input pada pilihan di menu Tambah Pelanggan, Ubah Data Pelanggan, Hapus Data Pelanggan.

<img width="824" height="306" alt="image" src="https://github.com/user-attachments/assets/2ef1152b-5979-40b7-9aec-5e4ef72095ec" />

Untuk Search dipakai untuk mencari data pelanggan berdasarkan namanya.

## Penerapan Encapsulation

<img width="1374" height="726" alt="image" src="https://github.com/user-attachments/assets/6bd01585-17c5-4243-86eb-48e15bec19ff" />

Getter digunakan saat melihat data pelanggan. Misalnya ketika menampilkan daftar pelanggan, sistem memanggil getNama(), getDurasi(), dan getNomorPC().

Setter digunakan saat mengubah data pelanggan. Jadi ketika admin ingin mengganti nama, durasi, atau nomor PC pelanggan, setter dipanggil agar nilai atribut bisa diubah dengan aman.

## Penerapan Inheritance

### Superclass

<img width="1370" height="827" alt="image" src="https://github.com/user-attachments/assets/a02c3c86-02a6-43eb-9172-9013b5d17dc8" />
<img width="1334" height="214" alt="image" src="https://github.com/user-attachments/assets/85529a1f-9969-4e6c-b12d-8fa93736aeca" />

- Properti nama, durasi, dan nomorPC digunakan untuk menyimpan data utama dari setiap pelanggan warnet. Karena dibuat dengan private, data ini hanya bisa diakses atau diubah melalui getter dan setter, bukan secara langsung dari luar class.
- Constructor Pelanggan(String nama, int durasi, int nomorPC) berfungsi untuk menginisialisasi objek pelanggan baru dengan data lengkap berupa nama pelanggan, lama durasi pemakaian komputer, dan nomor PC yang digunakan.
- Getter digunakan untuk mengambil nilai atribut pelanggan. Misalnya, getNama() mengembalikan nama pelanggan, getDurasi() mengembalikan lama pemakaian komputer, dan getNomorPC() mengembalikan nomor PC yang dipakai.
- Setter digunakan untuk mengubah atau mengisi nilai atribut pelanggan. Contohnya, setNama(String nama) dipakai untuk mengubah nama pelanggan, setDurasi(int durasi) untuk memperbarui lama pemakaian, dan setNomorPC(int nomorPC) untuk mengganti nomor PC yang dipakai.
- Method ini berfungsi untuk menampilkan informasi pelanggan dalam bentuk string yang sudah diformat rapi. Outputnya berisi nama, durasi pemakaian, serta nomor PC, sehingga memudahkan untuk ditampilkan di menu utama aplikasi.

### Subclass PelangganSiang

<img width="1354" height="346" alt="image" src="https://github.com/user-attachments/assets/f6bf4d99-71a0-4c31-8f91-884e0f808e2f" />

- Pada bagian constructor, PelangganSiang menggunakan super(nama, durasi, nomorPC) untuk mengisi data nama, durasi, dan nomor PC pelanggan.
- Method tampilData() dioverride agar menambahkan label [SIANG] di depan informasi pelanggan, sehingga data yang ditampilkan lebih jelas membedakan pelanggan siang dari pelanggan lainnya.


### Subclass PelangganMalam

<img width="1346" height="533" alt="image" src="https://github.com/user-attachments/assets/09d821b8-7f37-45fd-b74d-fd056754c558" />

- Constructor PelangganMalam sama seperti siang, yaitu memanggil super(nama, durasi, nomorPC) untuk menginisialisasi atribut utama.
- Terdapat getter dan setter (getBonusJam() dan setBonusJam()) untuk mengambil atau mengubah nilai bonusJam sesuai kebutuhan.
- Method tampilData() dioverride dengan menambahkan label [MALAM] dan informasi bonus jam, sehingga data pelanggan malam tidak hanya menampilkan identitas tetapi juga keistimewaan berupa tambahan waktu penggunaan.


## Abstract

<img width="743" height="294" alt="image" src="https://github.com/user-attachments/assets/774ef1dc-c7dd-4f38-9c32-8e350f97a7f5" />
<img width="542" height="63" alt="image" src="https://github.com/user-attachments/assets/24c300f7-fc62-4fab-a310-6c119dfb10da" />


Abstract class Pelanggan digunakan sebagai referensi untuk semua jenis pelanggan di warnet. Karena class ini didefinisikan sebagai abstract, maka class ini tidak bisa dibuat objek langsung, melainkan harus diturunkan oleh subclass seperti PelangganSiang atau PelangganMalam. Dengan begitu, setiap subclass wajib mengimplementasikan atau menambahkan perilaku spesifik sesuai jenis pelanggan (misalnya tarif normal di siang hari atau bonus jam di malam hari).

## Override

### Override PelangganMalam

<img width="981" height="556" alt="image" src="https://github.com/user-attachments/assets/a6c750c9-bc8d-41bb-b7dd-29bc671fdc85" />

Pada method getBonusJam(), dilakukan overriding dari interface Bonus untuk memberikan implementasi konkret dalam mengambil nilai bonus jam. Dengan cara ini, objek PelangganMalam bisa mengembalikan nilai bonus yang berlaku tanpa harus membuat method baru, cukup memanfaatkan kontrak dari interface.

Method setBonusJam(int bonusJam) juga merupakan hasil overriding dari interface Bonus. Fungsinya untuk mengubah nilai bonus jam yang diterima pelanggan malam. Selain itu, di dalam method ini juga dipanggil setTotalHarga(hitungTotal()) agar total harga otomatis diperbarui setiap kali nilai bonus diubah, sehingga data pelanggan tetap konsisten.

Pada method hitungTotal(), overriding dilakukan terhadap abstract method yang ada di class Pelanggan. Implementasi khusus untuk pelanggan malam adalah biaya dihitung berdasarkan durasi asli yang dibayar tanpa menambahkan bonus jam. Dengan demikian, bonus jam hanya memberikan tambahan waktu bermain secara gratis tanpa memengaruhi perhitungan biaya.

Sedangkan method tampilData() digunakan untuk menampilkan informasi pelanggan malam secara lebih lengkap. Method ini meng-override tampilData() dari class induk dengan menambahkan label [MALAM] dan keterangan bonus jam di akhir data. Pemanggilan super.tampilData() tetap digunakan agar data umum seperti nama, durasi, nomor PC, dan total harga tetap ditampilkan.

### Override PelangganSiang

<img width="747" height="266" alt="image" src="https://github.com/user-attachments/assets/b319084b-89f4-4199-a33c-047239718878" />

Method hitungTotal() pada kode ini merupakan hasil overriding dari abstract method yang ada di class Pelanggan. Implementasi khusus untuk pelanggan siang adalah menghitung biaya dengan tarif normal, yaitu 6000 dikalikan dengan durasi penggunaan. Karena pelanggan siang tidak memiliki bonus jam seperti pelanggan malam, maka biaya yang dihitung hanya berdasarkan durasi asli yang dibayar.

Sedangkan method tampilData() juga melakukan overriding dari method induknya. Pada implementasi ini, method menambahkan label [SIANG] di depan data pelanggan agar mudah dibedakan dengan jenis pelanggan lain. Pemanggilan super.tampilData() digunakan agar data umum pelanggan seperti nama, durasi, nomor PC, dan total harga tetap ditampilkan, sehingga hasilnya lebih lengkap dan konsisten.

## Overloading

<img width="1060" height="679" alt="image" src="https://github.com/user-attachments/assets/08b06121-eba6-460b-8e34-201325535fed" />

Pada kode ini ditunjukkan contoh method overloading pada fungsi cariPelanggan(). Method pertama memiliki parameter String keyword, yang digunakan untuk mencari pelanggan berdasarkan nama. Proses pencarian dilakukan dengan mencocokkan keyword dengan nama pelanggan dalam daftar menggunakan toLowerCase() agar pencarian tidak peka terhadap huruf besar atau kecil. Jika ditemukan, data pelanggan akan ditampilkan dengan tampilData(), namun jika tidak ada yang cocok maka akan muncul pesan bahwa pelanggan dengan nama tersebut tidak ditemukan.

Sedangkan, method kedua memiliki parameter int nomorPC, yang digunakan untuk mencari pelanggan berdasarkan nomor PC. Di dalam perulangan, setiap pelanggan dicek apakah nomor PC miliknya sama dengan input yang diberikan. Jika ditemukan, data pelanggan langsung ditampilkan, dan jika tidak ditemukan maka muncul pesan bahwa pelanggan dengan nomor PC tersebut tidak ada.

Jadi dengan ini kita dapat memakai satu nama method yang sama (cariPelanggan) tetapi dengan parameter berbeda sesuai kebutuhan pencarian. Hal ini membuat kode lebih rapi, mudah dibaca, dan fleksibel, karena pengguna bisa memilih mencari pelanggan berdasarkan nama atau nomor PC tanpa perlu membuat method dengan nama lain.

## Interface

<img width="513" height="189" alt="image" src="https://github.com/user-attachments/assets/540e231c-0d6b-4c58-8962-e61beb67ce14" />

Interface Bonus digunakan untuk mendefinisikan fitur bonus jam. Di dalamnya ada dua method abstrak, getBonusJam() untuk mengambil nilai bonus, dan setBonusJam(int bonusJam) untuk mengubahnya.

## Alur Sistem

### Menu Utama

<img width="394" height="167" alt="image" src="https://github.com/user-attachments/assets/499269e3-0ff0-4e3c-8319-c7f56ffebaf1" />

Ketika kita memulai file kodingannya, akan muncul menu utama seperti pada gambar yang bias dipilih dengan menginput angka dari pilihannya.

<img width="591" height="417" alt="image" src="https://github.com/user-attachments/assets/2f65e8a1-9e4c-42c7-9ad3-d46e6699dc44" />

Apabila kita menginput angka selain dipilihan atau huruf akan menampilkan pesan bahwa hal tersebut tidak boleh dilakukan.

### 1. Tambah Data Pelanggan

<img width="742" height="293" alt="image" src="https://github.com/user-attachments/assets/abbb53f0-1867-44be-9806-ecbdcdb95611" />

Di sini terdapat contoh untuk penambahan data pelanggan.

### 2. Lihat Pelanggan

<img width="815" height="349" alt="image" src="https://github.com/user-attachments/assets/d0797087-9a56-4a04-bbaf-41f685bd686d" />

Apabila kita memilih pilihan nomor 2, sistem akan menampilkan data pelanggan yang terdaftar dan langsung mengembalikan ke menu utama.

### 3. Ubah Data Pelanggan

<img width="797" height="471" alt="image" src="https://github.com/user-attachments/assets/68757f71-b7d5-4734-ba11-fd17be1f862a" />

Disini terdapat contoh dari pemilihan nomor 3, sistem akan menampilkan data pelanggan yang terdaftar dan pengguna diharuskan menginput nomor pelanggan yang ingin diubah dan data-data barunya.

### 4. Hapus Data Pelanggan

<img width="796" height="396" alt="image" src="https://github.com/user-attachments/assets/d66c1573-d83f-452d-9b4a-2d46b96b4e57" />

Disini terdapat contoh dari pemilihan nomor 4, disini user akan ditampilkan data dari pelanggan yang terdaftar dan diharuskan menginput untuk melakukan penghapusan data.

### 5. Cari Pelanggan

<img width="481" height="192" alt="image" src="https://github.com/user-attachments/assets/bf643ad3-4802-4b34-9db7-1688ef9e9f7d" />

Disini terdapat contoh pemilihan 5, jadi di search ini kita menginput huruf yang ada pada namanya. Sistem akan menampilkan pilihan apakah user ingin mencari menggunakan nama atau nomor dari PC.

<img width="598" height="247" alt="image" src="https://github.com/user-attachments/assets/8e421f95-0eb6-403e-adbe-fa86e840992a" />

Apabila kita memilih 1, sistem akan menyuruh kita memasukkan nama dan kemudian sistem akan mencari nama yang telah diinput

<img width="599" height="253" alt="image" src="https://github.com/user-attachments/assets/0dd5a52d-f7a2-49ba-b062-e71f30c8e0d6" />

Sedangkan, apabila kita memilih 2, sistem menyuruh kita memasukkan nomor pc dan sistem akan mencari nomor PC yang telah diinput.


### 6. Keluar

<img width="862" height="348" alt="image" src="https://github.com/user-attachments/assets/e9a240cf-b4d9-4503-8916-228909a93dd6" />

Yang terakhir, apabila user memilih pilihan 6, sistem akan menampilkan pesan dan menyelesaikan programnya.
