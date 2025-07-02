## 📄 **Pretest: Activity Lifecycle di Android (30 Soal)**

### ✅ **Bagian A – Pilihan Ganda (10 Soal)**

**Pilih satu jawaban yang paling benar.**

1. Method lifecycle manakah yang pertama kali dipanggil ketika Activity baru dimulai?
   a. `onResume()`
   b. `onCreate()`
   c. `onStart()`
   d. `onRestart()`

   jawaban: b

2. Method `onPause()` biasanya dipanggil ketika...
   a. Aplikasi ditutup total
   b. User menekan tombol back
   c. Activity lain muncul di atas Activity saat ini
   d. Aplikasi di-_reinstall_

   jawaban: c

3. Method `onDestroy()` akan selalu dipanggil jika...
   a. Aplikasi direstart
   b. Pengguna berpindah ke Activity lain
   c. Aplikasi ditutup melalui recent apps
   d. Tidak selalu dijamin dipanggil

   jawaban: c

4. Saat rotasi layar terjadi, method apa yang umumnya **tidak** dipanggil kembali secara otomatis?
   a. `onCreate()`
   b. `onStart()`
   c. `onPause()`
   d. `onRestart()`

   jawaban: a

5. Lifecycle `onRestart()` akan dipanggil saat...
   a. Aplikasi dijalankan pertama kali
   b. Setelah `onStop()` dan Activity dibuka lagi
   c. Setelah `onDestroy()`
   d. Setelah `onPause()`

   jawaban: b


6. Saat user menekan tombol home, urutan method yang dipanggil adalah:
   a. `onPause()`, `onDestroy()`
   b. `onPause()`, `onStop()`
   c. `onStop()`, `onDestroy()`
   d. `onCreate()`, `onStart()`

   jawaban: b

7. Untuk menyimpan data sementara sebelum Activity di-_recreate_, gunakan:
   a. `onStart()`
   b. `onPause()`
   c. `onSaveInstanceState()`
   d. `onResume()`

   jawaban: c

8. Jika ingin mencegah Activity di-_recreate_ saat rotasi, properti apa yang ditambahkan?
   a. `android:stateAlwaysVisible`
   b. `android:keepScreenOn`
   c. `android:configChanges="orientation|screenSize"`
   d. `android:restartOnRotation`

   jawaban: c

9. Lifecycle method mana yang dipanggil tepat setelah `onCreate()`?
   a. `onStop()`
   b. `onDestroy()`
   c. `onStart()`
   d. `onPause()`

   jawaban: c

10. Fungsi dari `onResume()` adalah...
    a. Menyimpan data sebelum aplikasi ditutup
    b. Menjalankan logika utama setelah tampilan muncul
    c. Menghapus cache aplikasi
    d. Mendaftarkan listener ViewGroup

    jawaban: b

---

### ❓ **Bagian B – True/False (10 Soal)**

**Tulis T (True) atau F (False) untuk setiap pernyataan.**

11. `onStart()` dipanggil hanya sekali selama siklus hidup Activity.
jawaban: F
12. `onPause()` dipanggil sebelum `onStop()`.
jawaban: T
13. `onDestroy()` selalu dipanggil jika Activity berpindah ke Activity lain.
jawaban: F
14. Rotasi layar akan memanggil kembali `onCreate()`.
jawaban: T
15. `onResume()` menandakan bahwa Activity sedang tampil dan aktif.
jawaban: T
16. `onSaveInstanceState()` digunakan untuk menampilkan notifikasi.
jawaban: F
17. Setelah `onStop()`, Activity akan langsung `onDestroy()` tanpa pengecualian.
jawaban: F
18. Method `onRestart()` tidak akan pernah dipanggil jika aplikasi ditutup total.
jawaban: T
19. `onCreate()` hanya digunakan untuk menampilkan layout.
jawaban: F
20. Android menjamin bahwa semua lifecycle dipanggil secara berurutan.
jawaban: F

---

### ✍️ **Bagian C – Isian Singkat (5 Soal)**

21. Sebutkan 3 method utama yang dipanggil ketika Activity pertama kali diluncurkan.
jawaban: `onCreate()`, `onStart()`, `onResume()`

22. Apa fungsi utama dari method `onSaveInstanceState()`?
jawaban: Menyimpan data Activity sebelum aplikasi ditutup atau berpindah

23. Apa perbedaan `onPause()` dan `onStop()` dalam siklus Activity?
jawaban: `onPause()` aplikasi masih terlihat sebagian, sedangkan `onStop()` aplikasi tidak terlihat sama sekali

24. Apa dampak dari tidak menambahkan `configChanges` saat orientasi berubah?
jawaban: Aplikasi akan di-recreate

25. Sebutkan satu kondisi di mana `onDestroy()` **tidak** dipanggil oleh sistem Android.
jawaban: Ketika aplikasi ditutup secara paksa (forced closed)

---

### 🔧 **Bagian D – Koreksi Kode (5 Soal)**

**Perbaiki dan jelaskan kesalahan pada cuplikan kode berikut.**

26.

```kotlin
override fun onCreate() {
  super.onCreate()
  setContentView(R.layout.activity_main)
}
```
jawaban: `onCreate()` harus memiliki parameter

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate()
  setContentView(R.layout.activity_main)
}
```
27.

```kotlin
override fun onStop(savedInstanceState: Bundle?) {
  super.onStop(savedInstanceState)
  Log.d("LIFECYCLE", "Stopped")
}
```
jawaban: `onStop()` tidak memiliki parameter `savedInstanceState`
```kotlin
override fun onStop() {
  super.onStop()
  Log.d("LIFECYCLE", "Stopped")
}
```
28.

```kotlin
override fun onResume() {
  setContentView(R.layout.activity_main)
  super.onResume()
}
```
jawaban: `onResume()` harus dipanggil sebelum`setContentView()`
```kotlin
override fun onResume() {
   super.onResume()
   setContentView(R.layout.activity_main)
}
```
29.

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
  Log.d("LIFECYCLE", "Created")
}
```
jawaban: `onCreate()` harus memanggil `super.onCreate(savedInstanceState)` sebelum melakukan hal lain
```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
   super.onCreate(savedInstanceState)
   Log.d("LIFECYCLE", "Created")
}
```

30.

```kotlin
override fun onSaveInstanceState() {
  outState.putString("username", "admin")
  super.onSaveInstanceState(outState)
}
```
jawaban: harus memiliki parameter `outState`
```kotlin
override fun onSaveInstanceState(outState: Bundle) {
  outState.putString("username", "admin")
  super.onSaveInstanceState(outState)
}

---
