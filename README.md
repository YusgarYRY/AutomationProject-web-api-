# Proyek Pengujian UI Web menggunakan Selenium dan pengujian Api menggunakan library restassured, 

Proyek ini mengimplementasikan pengujian otomatis untuk situs web demoblaze dan api gorest.api menggunakan Cucumber sebagai framework pengujian berbasis behavior-driven development (BDD), Java untuk bahasa pemrograman, Gradle untuk manajemen dependensi dan build, serta Selenium untuk otomatisasi browser, serta rest assured sebagai library pengujian api

## Persiapan
- Seluruh dependensi yang ada di proyek ini semuanya diambil dari https://mvnrepository.com/

## Tujuan Proyek
- Mengelola dan menjalankan pengujian otomatis untuk fitur-fitur kunci aplikasi web.
- Memastikan bahwa aplikasi berperilaku sesuai dengan spesifikasi dalam berbagai skenario.
- memastikan dan menjalankan perintah dan method api berjalan dengan baik
  

## Cara Menjalankan Pengujian
1. Pastikan JDK dan Gradle sudah terinstal di komputer Anda.
2. Clone repositori ini ke komputer Anda.
3. Buka terminal atau command prompt dan masuk ke direktori proyek.
4. Jalankan perintah `./ gradlew apiTest` untuk menjalankan web Ui. atau Jalankan perintah `./ gradlew webTest` untuk menjalankan web Ui.
6. Lihat laporan hasil pengujian di direktori `build/reports`.

## Struktur Proyek
- `src/test/resources`: Berisi file `.feature` untuk skenario Gherkin.
- `src/main/java/Page`: Berisi kelas Model Objek Halaman.
- `src/test/java/Step`: Berisi kelas Step Definitions untuk implementasi langkah-langkah pengujian.
- `src/test/java/helper`: Berisi kelas-kelas tambahan seperti utility,setup,dll untuk menunjang reusability dan konsep clean code.
-  `src/test/java/runner`: Berisi kelas yang dapat digunakan untuk menjalankan api atau web automation.

## Hasil running dan reporting
- ![Hasil_running1](https://github.com/YusgarYRY/webuiautomation/blob/main/idea64_Ljkaguoa9X.png)
- ![Hasil_running1](https://github.com/YusgarYRY/webuiautomation/blob/main/idea64_xC7Bf1ACBx.png)
- ![Reporting]( https://github.com/YusgarYRY/webuiautomation/blob/main/msedge_0QldKZenGg.png)
