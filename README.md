# 🚀 Polimorfisme dalam Java - Studi Kasus Perbankan

Selamat datang di repositori ini! 🎉 Repositori ini berisi implementasi konsep **Polimorfisme** dalam Java menggunakan studi kasus transaksi perbankan.

## 📝 Deskripsi Proyek
Proyek ini menunjukkan bagaimana **method overloading** dan **method overriding** digunakan dalam sistem perbankan sederhana, dengan fitur tambahan perhitungan biaya transfer berdasarkan bank tujuan.

## 📌 Fitur Utama
✅ **Method Overloading** untuk berbagai metode transfer uang.
✅ **Method Overriding** untuk mengubah suku bunga dan metode transfer di bank berbeda.
✅ **Penghitungan biaya transfer otomatis** berdasarkan bank tujuan.
✅ **Struktur kode yang modular dan mudah dipahami**.

## 🏛️ Struktur Kelas
- **Bank** → Kelas induk dengan metode dasar.
- **BankBNI & BankBCA** → Subclass dengan override pada metode `sukuBunga()` dan `transferUang()`.
- **Main** → Kelas utama untuk menguji program.

## ⚙️ Cara Menjalankan
1. Clone repositori ini:
   ```sh
   git clone https://github.com/username/polimorfisme-java.git
   ```
2. Buka proyek di IDE favoritmu (NetBeans, IntelliJ, Eclipse, dsb.).
3. Jalankan file `Main.java`.

## 🖥️ Contoh Output
```
=== Uji Method Overloading ===
Transfer sebesar 1000000 ke rekening 1234567890
Transfer sebesar 2000000 ke rekening 9876543210 di bank Mandiri dengan biaya: 7500
Transfer sebesar 500000 ke rekening 1357924680 di bank BRI dengan biaya: 7500 dan berita: Pembayaran tagihan

=== Uji Method Overriding ===
Suku Bunga dari BNI adalah 4%
Suku Bunga dari BCA adalah 4.5%
[BNI] Transfer sebesar 1500000 ke rekening 1111222233 di bank BNI dengan biaya: 5000
[BCA] Transfer sebesar 2500000 ke rekening 4444555566 di bank BCA dengan biaya: 6000
```

## 📌 Kontribusi
Jika kamu ingin meningkatkan proyek ini, silakan lakukan **fork** dan buat **pull request**. 😊

## 📜 Lisensi
Proyek ini menggunakan lisensi **MIT**, silakan gunakan dan modifikasi sesuai kebutuhan.

---
💡 Dibuat oleh Ranggis ! 🚀
