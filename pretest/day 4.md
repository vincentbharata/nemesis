```

## ✅ **Bagian 1: Pilihan Ganda (5 Soal)**

1. Fragment digunakan untuk: A. Menyimpan data permanen
   B. Menampilkan halaman web
   C. Membagi antarmuka aplikasi ke dalam bagian modular
   D. Menyimpan file gambar
   Jawaban: c

2. Kelas dasar untuk membuat fragment adalah: A. `AppCompatFragment`
   B. `FragmentManager`
   C. `Fragment`
   D. `SupportFragment`
   Jawaban: C

3. Metode untuk menambahkan fragment ke activity adalah: A. `addView()`
   B. `beginTransaction().add()`
   C. `inflate()`
   D. `pushFragment()`
   Jawaban: B

4. Untuk mengelola fragment, kita menggunakan: A. `ActivityManager`
   B. `FragmentAdapter`
   C. `FragmentManager`
   D. `Intent`
   Jawaban: C

5. Layout container yang umum digunakan untuk menempatkan fragment di XML adalah:
   A. `TextView`
   B. `LinearLayout`
   C. `FrameLayout`
   D. `ListView`
   Jawaban: C

```

---

## 🔄 **Bagian 2: True/False (5 Soal)**

6. Fragment memiliki lifecycle yang sama persis dengan Activity.

    Jawaban: F

7. Satu activity bisa menampilkan lebih dari satu fragment.

    Jawaban: T

8. Kita tidak bisa mengganti fragment yang sedang ditampilkan.

    Jawaban: F

9. Fragment bisa mengakses komponen UI dari activity langsung.

    Jawaban: F

10. Fragment tidak bisa hidup tanpa activity.

    Jawaban: T

---

## ✍️ **Bagian 3: Jawaban Singkat (10 Soal)**

11. Apa fungsi `FragmentManager` dalam Android?

    Jawaban: Mengelola fragment yang ada di dalam activity.

12. Apa metode yang digunakan untuk menghubungkan layout XML ke fragment?

    Jawaban: onCreateView()

13. Sebutkan dua metode lifecycle penting pada fragment!

    Jawaban: onCreateView() dan onViewCreated()

14. Bagaimana cara mengirim data dari activity ke fragment?

    Jawaban: Dengan menggunakan Bundle dan setArguments()

15. Mengapa kita menggunakan `FrameLayout` untuk fragment container?

    Jawaban: Karena FrameLayout cocok sebagai container dinamis untuk menampung fragment yang bisa diganti-ganti.

16. Apa perbedaan antara `replace()` dan `add()` saat transaksi fragment?

    Jawaban: `replace()` mengganti fragment yang ada dengan fragment baru, sedangkan `add()` menambahkan fragment baru tanpa mengganti yang ada.

17. Apakah fragment bisa berdiri sendiri tanpa activity? Jelaskan singkat.

    Jawaban: Tidak, fragment memerlukan activity

18. Bagaimana cara kembali ke fragment sebelumnya setelah `replace()`?

    Jawaban: Pake `popBackStack()`

19. Apa tujuan dari `setArguments(Bundle)` di fragment?

    Jawaban: Untuk mengirim data ke fragment

20. Sebutkan alasan menggunakan fragment dibanding activity!

    Jawaban: Fragment lebih ringan sehingga tidak memakan banyak memory

---

## 🛠️ **Bagian 4: Perbaikan Kode (10 Soal)**

21.

```kotlin
val fragment = ExampleFragment()
supportFragmentManager.beginTransaction.add(R.id.container, fragment).commit()
```
Jawaban: kurang ()
```kotlin
val fragment = ExampleFragment()
supportFragmentManager.beginTransaction().add(R.id.container, fragment).commit()
```

22.

```kotlin
class MyFragment : Fragment {
    override fun onCreateView(...) { ... }
}
```
Jawaban: kurang ()
```kotlin
class MyFragment : Fragment() {
    override fun onCreateView(...) { ... }
}
```

23.

```xml
<fragment
    android:name="MyFragment"
    android:id="@+id/my_fragment"
    android:layout_width="match_parent"
    android:layout_heigth="match_parent" />
```
jawaban: height typo
```xml
<fragment
    android:name="MyFragment"
    android:id="@+id/my_fragment"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```

24.

```kotlin
val bundle = Bundle()
bundle.putString("key", "value")
fragment.arguments(bundle)
```
Jawaban: argument merupakan property
```kotlin
val bundle = Bundle()
bundle.putString("key", "value")
fragment.arguments = bundle
```
25.

```kotlin
supportFragmentManager.beginTransaction()
    .replace(R.id.container, NewFragment())
    .addToBackStack()
    .commit()
```
Jawaban: memerlukan parameter
```kotlin
supportFragmentManager.beginTransaction()
    .replace(R.id.container, NewFragment())
    .addToBackStack(null)
    .commit()
```

26.

```kotlin
class MyFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_my, container, false)
    }
}
```
Jawaban: view harus mengembalikan nullable
```kotlin
class MyFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_my, container, false)
    }
}
```

27.

```kotlin
val fragment = MyFragment()
val args = Bundle()
args.putInt("id", 10)
fragment.setBundle(args)
```
jawaban: setBundle tidak ada
```kotlin
val fragment = MyFragment()
val args = Bundle()
args.putInt("id", 10)
fragment.arguments = args
```

28.

```kotlin
supportFragmentManager.pop()
```
Jawaban: pop tidak ada di FragmentManager
```kotlin
supportFragmentManager.popBackStack()
```
29.

```kotlin
activity.supportFragmentManager.beginTransaction()
    .remove(fragment)
    .commitNowAllowingStateLoss()
```
Jawaban: gunakan safe call operator
```kotlin
activity.supportFragmentManager.beginTransaction()
    ?.remove(fragment)
    ?.commitNowAllowingStateLoss()
```

30.

```kotlin
val view = inflater.inflate(R.layout.fragment_home)
```
Jawaban: memerlukan parameter tambahan
```kotlin
val view = inflater.inflate(R.layout.fragment_home,container,false)
```
---
