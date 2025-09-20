# ProfilApp_235150201111029Brandon

## Penjelasan Singkat Kode
Kode pada project ini membuat aplikasi profil sederhana dengan **Jetpack Compose**.  
`MainActivity` memanggil `ProfileScreen()` sebagai tampilan utama. Di dalam `ProfileScreen`, elemen-elemen ditata dengan `Column` agar tersusun vertikal, berisi **Image** (foto profil), **Text** (nama, NIM, deskripsi), dan tombol **Follow/Unfollow**. Tombol ini menggunakan state (`remember { mutableStateOf(false) }`) sehingga teks tombol bisa berubah dinamis ketika ditekan. Modifier seperti `padding`, `background`, `clip`, dan `size` digunakan untuk mengatur posisi, ukuran, serta gaya dari komponen agar lebih rapi.

## Analisis Singkat: Compose vs XML Layout
Jetpack Compose menawarkan cara deklaratif dalam membangun UI, berbeda dengan XML layout tradisional yang bersifat imperatif. Dengan Compose, kode UI dan logika bisa ditulis di file Kotlin yang sama, sehingga lebih ringkas, mudah dibaca, dan langsung terhubung dengan data/state. Compose juga mendukung **hot reload** dan **preview** di Android Studio, sehingga pengembang bisa melihat perubahan UI secara cepat tanpa perlu build ulang aplikasi. Secara keseluruhan, Compose membuat proses pengembangan lebih produktif, lebih sedikit boilerplate, dan lebih mudah dipelihara dibandingkan XML layout tradisional.  
