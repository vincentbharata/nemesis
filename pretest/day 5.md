
---
## MULTIMEDIA 

1. Komponen bawaan Android yang digunakan untuk memutar video dari URL adalah:

   * A. AudioManager
   * B. VideoView
   * C. MediaPlayer
   * D. ExoPlayer

      Jawaban: b

2. Untuk menampilkan video YouTube dengan cara termudah, kita bisa menggunakan:

   * A. Intent ke browser atau YouTube app
   * B. WebSocket
   * C. AssetManager
   * D. SharedPreferences

      Jawaban: a

3. Metode `setVideoURI()` digunakan pada:

   * A. TextView
   * B. VideoView
   * C. MediaPlayer
   * D. ImageView

      Jawaban: b

4. Apa tujuan dari `start()` setelah `setVideoURI()`?

   * A. Mengakhiri video
   * B. Pause video
   * C. Mulai pemutaran
   * D. Mengulang video

      Jawaban: c

5. Library yang sering digunakan untuk video streaming dengan kontrol lebih lengkap adalah:

   * A. Retrofit
   * B. Glide
   * C. ExoPlayer
   * D. Ktor

      Jawaban: c

6. Sebutkan 2 cara menampilkan video YouTube dalam aplikasi Android.

   Jawaban: Intent ke browser atau YouTube app, menggunakan library ExoPlayer atau VideoView.

7. Bagaimana Anda membuka link video YouTube secara langsung ke browser?

   Jawaban: Gunakan Intent dengan ACTION_VIEW dan URL YouTube, lalu panggil startActivity(intent).

8. Apa perbedaan `VideoView` dan `WebView` saat menampilkan konten video?

   Jawaban: `VideoView` khusus untuk menampilkan video, sedangkan `WebView` dapat menampilkan konten web, termasuk video


9. Perbaiki kode berikut agar dapat memutar video dari URL:

```kotlin
val videoView = findViewById<VideoView>(R.id.videoView)
videoView.setVideoPath("https://youtube.com/videoid")
videoView.play()
```
Jawaban: gunakan start bukan play
9. Perbaiki kode berikut agar dapat memutar video dari URL:

```kotlin
val videoView = findViewById<VideoView>(R.id.videoView)
videoView.setVideoURI(Uri.parse("https://youtube.com/videoid"))
videoView.start()
```

10. Kode berikut digunakan untuk membuka video via browser. Namun tidak bekerja. Perbaiki:

```kotlin
val intent = Intent(Intent.ACTION_VIEW)
intent.data = "https://youtu.be/abc123"
startActivity(intent)
```
Jawaban: gunakan url parse

```kotlin
val intent = Intent(Intent.ACTION_VIEW)
intent.data = Uri.parse("https://youtu.be/abc123") 
startActivity(intent)
```

---

##  SHARED PREFERENCES
  
11. SharedPreferences digunakan untuk menyimpan:

* A. Gambar
* B. Video
* C. Data sederhana seperti token, nama
* D. Seluruh database

   Jawaban: C

12. SharedPreferences hanya bisa diakses oleh:

* A. Semua aplikasi
* B. Aplikasi yang sama
* C. Server
* D. Web browser

   Jawaban: B

13. Untuk menulis ke SharedPreferences, Anda membutuhkan:

* A. Editor
* B. Reader
* C. Database
* D. RecyclerView

   Jawaban: A

14. Fungsi untuk menyimpan `String` ke SharedPreferences:

* A. putValue()
* B. writeString()
* C. putString()
* D. save()

   Jawaban: C

15. Fungsi `apply()` digunakan untuk:

* A. Membatalkan perubahan
* B. Menyimpan secara async
* C. Menyimpan secara sync
* D. Logout

   Jawaban: B

16. Bagaimana cara menyimpan nama pengguna ke SharedPreferences?

   Jawaban: 
   ```kotlin
val pref = getSharedPreferences("MyApp", MODE_PRIVATE)
val editor = pref.edit()
editor.putString("username", "nama_pengguna")
editor.apply()
```
17. Bagaimana cara menghapus semua data SharedPreferences?
```kotlin
val pref = getSharedPreferences("MyApp", MODE_PRIVATE)
val editor = pref.edit()
editor.clear()
editor.apply()
```

18. Sebutkan 2 jenis data yang bisa disimpan di SharedPreferences.

   Jawaban: String, Int

19. Perbaiki kode berikut agar dapat menyimpan token:

```kotlin
val pref = getSharedPreferences("MyApp", MODE_WORLD_WRITEABLE)
val editor = pref.edit()
editor.save("token", "abc123")
```
Jawaban: gunakan putString
```kotlin
val pref = getSharedPreferences("MyApp", MODE_PRIVATE)
val editor = pref.edit()
editor.putString("token", "abc123")
editor.apply()
```

20. Kode berikut digunakan untuk membaca data dari SharedPreferences namun error. Perbaiki:

```kotlin
val pref = getPreferences()
val name = pref.getString("username")
```
Jawaban: butuh mode_private
```kotlin
val pref = getPreferences(MODE_PRIVATE)
val name = pref.getString("username", null)
```

---
##  ROOM DATABASE
21. Room adalah library untuk:

* A. Menyimpan file
* B. Menyimpan video
* C. Database SQLite wrapper
* D. Akses Web

Jawaban: C

22. Setiap entitas dalam Room harus ditandai dengan:

* A. @ViewModel
* B. @Entity
* C. @Activity
* D. @Column

Jawaban: B

23. DAO digunakan untuk:

* A. Menyimpan layout
* B. Menyimpan aktivitas
* C. Akses ke database
* D. Migrasi

Jawaban: C

24. Untuk menjalankan query di DAO, kita bisa gunakan:

* A. @Insert
* B. @Delete
* C. @Query
* D. Semua benar

Jawaban: D

25. Room membutuhkan apa agar bisa berjalan?

* A. Koneksi internet
* B. UI
* C. Database dan DAO
* D. Activity

Jawaban: C

26. Sebutkan 3 komponen utama dari Room.

Jawaban: Entity, DAO (Data Access Object), Database

27. Apa itu `@PrimaryKey` dalam Room?

Jawaban:   anotasi untuk menandai kolom sebagai primary key (kunci utama) pada entitas Room

28. Sebutkan 1 contoh fungsi DAO untuk mendapatkan seluruh data.

Jawaban: `@Query("SELECT * FROM tabel")`


29. Perbaiki entitas berikut agar bisa digunakan oleh Room:

```kotlin
data class User(
   val id: Int,
   val name: String
)
```
Jawaban: pakai anotasi @Entity
```kotlin
@Entity
data class User(
   val id: Int,
   val name: String
)
```

30. Kode berikut menampilkan error saat menjalankan `insert`. Perbaiki:

```kotlin
@Dao
interface UserDao {
    fun insertUser(user: User)
}
```
Jawaban: Tambah anotasi @Insert
```kotlin
@Dao
interface UserDao {
    @Insert
    fun insertUser(user: User)
}
```

---
