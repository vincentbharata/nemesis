
```
#### 1. Library paling umum digunakan untuk HTTP Client di Android Kotlin modern:

a. OkHttp
b. Volley
c. Retrofit
d. Alamofire
<<<<<<< HEAD
Jawaban: c
=======
>>>>>>> upstream/master

---

#### 2. Fungsi dari `@GET("users")` dalam Retrofit:

a. Menyimpan data pengguna
b. Mengirim form ke server
c. Mengirim permintaan HTTP GET ke endpoint `users`
d. Menghapus pengguna dari server
<<<<<<< HEAD
Jawaban: c
=======
>>>>>>> upstream/master

---

#### 3. Mengapa kita menggunakan Coroutine atau `Call.enqueue()` saat Retrofit dipakai?

a. Untuk mempermudah syntax Kotlin
b. Untuk menjaga agar UI tidak macet saat HTTP call
c. Agar data disimpan ke SharedPreferences
d. Agar aplikasi bisa offline
<<<<<<< HEAD
Jawaban: b
=======
>>>>>>> upstream/master

---

#### 4. Untuk mengkonversi JSON ke objek Kotlin, kita menggunakan:

a. JsonParser
b. GsonConverterFactory
c. JSONTokener
d. JSONBuilder
<<<<<<< HEAD
Jawaban: b
=======
>>>>>>> upstream/master

---

#### 5. Fungsi utama `baseUrl` di Retrofit:

a. Mengatur authentication
b. Menentukan response type
c. Menentukan endpoint utama API
d. Menentukan ukuran file
<<<<<<< HEAD
Jawaban: c
=======
>>>>>>> upstream/master

---

#### 6. Kapan kita perlu menambahkan `@Query` di Retrofit?

a. Saat upload file
b. Saat mengirim body JSON
c. Saat menambahkan parameter URL
d. Saat menyimpan token
<<<<<<< HEAD
Jawaban: c
=======
>>>>>>> upstream/master

---

#### 7. `Response.body()` akan bernilai `null` jika:

a. API berhasil dipanggil
b. Status HTTP adalah 200
c. Response tidak sesuai format
d. Retrofit tidak digunakan
<<<<<<< HEAD
Jawaban: c
=======
>>>>>>> upstream/master

---

#### 8. Untuk membuat POST request dengan Retrofit, anotasi yang digunakan adalah:

a. @GET
b. @POST
c. @PUT
d. @FETCH
<<<<<<< HEAD
Jawaban: b
=======
>>>>>>> upstream/master

---

#### 9. Apa yang terjadi jika kita lupa menambahkan `.create()` pada GsonConverterFactory?

a. Program tetap jalan
b. Data akan disimpan sebagai string
c. Retrofit akan error saat parsing
d. File JSON akan corrupt
<<<<<<< HEAD
Jawaban: c
=======
>>>>>>> upstream/master

---

#### 10. Manakah dari berikut ini yang merupakan cara **asynchronous** memanggil API dengan Retrofit?

a. `.execute()`
b. `.enqueue()`
c. `.get()`
d. `.await()`
<<<<<<< HEAD
Jawaban: b
=======
>>>>>>> upstream/master

---
```

#### 11. Jelaskan perbedaan antara Retrofit dan OkHttp dalam arsitektur Android.
<<<<<<< HEAD
Jawaban: Retrofit adalah library yang digunakan untuk membuat API request, sedangkan OkHttp adalah library yang digunakan untuk membuat request HTTP. 
=======
>>>>>>> upstream/master

---

#### 12. Sebutkan dua cara menangani response API di Retrofit!
<<<<<<< HEAD
Jawaban: Menggunakan `Response` object, Menggunakan `Call` object.
=======
>>>>>>> upstream/master

---

#### 13. Bagaimana cara mengecek apakah response dari server berhasil atau tidak?
<<<<<<< HEAD
Jawaban: Dengan menggunakan `isSuccessful()` method pada `Response` object.
=======
>>>>>>> upstream/master

---

#### 14. Apa fungsi `@Header("Authorization")` dalam Retrofit?
<<<<<<< HEAD
Jawaban: Digunakan untuk menambahkan header pada request API.
=======
>>>>>>> upstream/master

---

#### 15. Apa itu suspend function dan mengapa sering digunakan bersama Retrofit?
<<<<<<< HEAD
Jawaban: Suspend function adalah fungsi yang dapat dihentikan dan dilanjutkan, sering digunakan bersama Retrofit karena dapat membuat kode lebih mudah dibaca dan diatur 
=======
>>>>>>> upstream/master

---

#### 16. Sebutkan satu contoh kasus nyata di mana HTTP client dibutuhkan dalam aplikasi Android.
<<<<<<< HEAD
Jawaban: Menggunakan API dari server lain untuk mendapatkan data
=======
>>>>>>> upstream/master

---

#### 17. Jika API kamu lambat dan pengguna harus menunggu lama, bagaimana solusi teknisnya?
<<<<<<< HEAD
Jawaban: Menggunakan caching, mengoptimalkan kode, menggunakan teknologi lain seperti GraphQL atau gRPC
=======
>>>>>>> upstream/master

---

#### 18. Bagaimana cara menangani `TimeoutException` saat HTTP call?
<<<<<<< HEAD
Jawaban: Dengan menggunakan `Timeout` pada `OkHttpClient` atau `Retrofit
=======
>>>>>>> upstream/master

---

#### 19. Mengapa penting untuk menangani error code seperti 401 atau 500?
<<<<<<< HEAD
Jawaban: Untuk memastikan aplikasi tetap berjalan dengan baik
=======
>>>>>>> upstream/master

---

#### 20. Apa itu DTO dalam konteks komunikasi dengan API?
<<<<<<< HEAD
Jawaban: DTO (Data Transfer Object) adalah objek yang digunakan untuk mentransfer data antara aplikasi dan API
=======
>>>>>>> upstream/master

---

### 🛠️ ** FIX CODE **

#### 21. Perbaiki kode Retrofit interface ini agar valid:

```kotlin
interface ApiService {
    @GET
    fun getUser(): Call<User>
}
```
<<<<<<< HEAD
Jawaban:  Tambahkan parameter pada `@GET` 

```kotlin
interface ApiService {
    @GET("users")
    fun getUser(): Call<User>
}
```
=======

>>>>>>> upstream/master
---

#### 22. Ada kesalahan dalam Retrofit builder berikut. Apa yang salah?

```kotlin
val retrofit = Retrofit.Builder()
    .baseUrl("https://api.example.com")
    .addConverterFactory(GsonConverterFactory)
    .build()
```
<<<<<<< HEAD
Jawaban: tambahkan create dan url gunakan / 
```kotlin
val retrofit = Retrofit.Builder()
    .baseUrl("https://api.example.com/") 
    .addConverterFactory(GsonConverterFactory.create())
    .build()
```
=======
>>>>>>> upstream/master

---

#### 23. Diberikan JSON seperti ini:

```json
{
  "status": "ok",
  "data": {
    "id": 10,
    "name": "Anna"
  }
}
```

Perbaiki model Kotlin-nya:

```kotlin
data class User(
    val id: Int,
    val fullName: String
)
```
<<<<<<< HEAD
Jawaban: field fullname harusnya name
```kotlin
data class User(
    val id: Int,
    val name: String
)
```
=======
>>>>>>> upstream/master

---

#### 24. Lengkapi kode Retrofit untuk mengirim data JSON:

```kotlin
@POST("user/add")
fun createUser(@Body user: ???): Call<User>
```
<<<<<<< HEAD
Jawaban: Parameter `@Body` harus berupa data class yang akan dikirim, misal `User`
```kotlin
@POST("user/add")
fun createUser(@Body user: User): Call<User>
```
=======

>>>>>>> upstream/master
---

#### 25. Perbaiki fungsi berikut agar memanggil API secara asynchronous:

```kotlin
val call = apiService.getUser()
val result = call.execute()
```
<<<<<<< HEAD
Jawaban: `.enqueue()` digunakan untuk asynchronous, sedangkan `.execute()` synchronous dan bisa menyebabkan UI freeze.
```kotlin
val call = apiService.getUser()
call.enqueue(object : Callback<User> {
    override fun onResponse(call: Call<User>, response: Response<User>) {
    }
    override fun onFailure(call: Call<User>, t: Throwable) {
    }
})
```
=======

>>>>>>> upstream/master
---

#### 26. Perbaiki parameter Retrofit berikut agar bisa mengirim `id` lewat query:

```kotlin
@GET("user")
fun getUser(@Param("id") id: Int): Call<User>
```
<<<<<<< HEAD
Jawaban: Untuk query parameter, gunakan `@Query`, bukan `@Param`.
```kotlin
@GET("user")
fun getUser(@Query("id") id: Int): Call<User>
```
=======

>>>>>>> upstream/master
---

#### 27. Perbaiki kode berikut agar response-nya bisa langsung digunakan di ViewModel coroutine:

```kotlin
@GET("user")
fun getUser(): Call<User>
```
<<<<<<< HEAD
Jawaban: gunakan `suspend` dan return langsung objek, bukan `Call<User>`.
```kotlin
@GET("user")
suspend fun getUser(): User
```
=======
>>>>>>> upstream/master

---

#### 28. Lengkapi kode penggunaan Retrofit di Android ViewModel:

```kotlin
val user = api.getUser()
user.enqueue(object: ??? {
    override fun onResponse(...) {
        // handle
    }
})
```
<<<<<<< HEAD
Jawaban: gunakan `Callback<User>`
```kotlin
val user = api.getUser()
user.enqueue(object: Callback<User> {
    override fun onResponse(call: Call<User>, response: Response<User>) {
    }
    override fun onFailure(call: Call<User>, t: Throwable) {
    }
})
```
=======
>>>>>>> upstream/master

---

#### 29. Lengkapi `DataRepository` berikut agar bisa meng-handle error response:

```kotlin
val call = api.getUser()
call.enqueue(object: Callback<User> {
    override fun onFailure(call: Call<User>, t: Throwable) { }
    override fun onResponse(call: Call<User>, response: Response<User>) {
        // handle success
    }
})
```
<<<<<<< HEAD
Jawaban: Harus menangani baik error jaringan (`onFailure`) maupun error response dari server (`onResponse` tapi tidak sukses).
```kotlin
val call = api.getUser()
call.enqueue(object: Callback<User> {
    override fun onFailure(call: Call<User>, t: Throwable) {
        // handle error, misal tampilkan pesan error
    }
    override fun onResponse(call: Call<User>, response: Response<User>) {
        if (response.isSuccessful) {
        } else {
        }
    }
})
```
=======
>>>>>>> upstream/master

---

#### 30. Perbaiki kode pemanggilan API ini agar menggunakan `suspend` function dan `try-catch`:

```kotlin
val result = api.getUser()
val data = result.body()
```
<<<<<<< HEAD
Jawaban: Dengan suspend function, gunakan `try-catch` untuk menangani error network secara langsung di coroutine.
```kotlin
try {
    val result = api.getUser() 
} catch (e: Exception) {
}
```
=======
>>>>>>> upstream/master

---
