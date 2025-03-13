# Tutorial Modul 5 Pemrograman Lanjut
### Nama   : Rayhan Syahdira Putra
### NPM    : 2306275903

## Performance Testing

<details>
  <summary>GUI Table Test Results - /all-student</summary>
  <img src="assets/table_results_allstudent_gui.png" alt="Table Results All Student GUI">
</details>

<details>
  <summary>GUI Table Test Results - /all-student-name</summary>
  <img src="assets/table_results_allstudentname_gui.png" alt="Table Results All Student Name GUI">
</details>

<details>
  <summary>GUI Table Test Results - /highest-gpa</summary>
  <img src="assets/table_results_highestgpa_gui.png" alt="Table Results Highest GPA GUI">
</details>
<details>
  <summary>CLI Test Results - /all-student</summary>
  <img src="assets/cli_results_allstudent.png" alt="CLI Results All Student">
</details>

<details>
  <summary>CLI Test Results - /all-student (Optimized)</summary>
  <img src="assets/cli_results_allstudent_opt.png" alt="CLI Results All Student Optimized">
</details>

<details>
  <summary>CLI Test Results - /all-student-name</summary>
  <img src="assets/cli_results_allstudentname.png" alt="CLI Results All Student Name">
</details>

<details>
  <summary>CLI Test Results - /all-student-name (Optimized)</summary>
  <img src="assets/cli_results_allstudentname_opt.png" alt="CLI Results All Student Name Optimized">
</details>

<details>
  <summary>CLI Test Results - /highest-gpa</summary>
  <img src="assets/cli_results_highestgpa.png" alt="CLI Results Highest GPA">
</details>

<details>
  <summary>CLI Test Results - /highest-gpa (Optimized)</summary>
  <img src="assets/cli_results_highestgpa_opt.png" alt="CLI Results Highest GPA Optimized">
</details>

---

## Reflection

<details> 
  <summary>What is the difference between the approach of performance testing with JMeter and profiling with IntelliJ Profiler in the context of optimizing application performance?</summary>
  Pengujian performa dengan JMeter mensimulasikan beban pengguna dan mengukur waktu respons API atau halaman web, sedangkan IntelliJ Profiler fokus pada analisis tingkat kode untuk mengidentifikasi penggunaan CPU, memori, dan metode yang paling membebani sistem. Kombinasi keduanya memberikan optimasi performa dari sisi arsitektur dan implementasi kode.
</details>

<details> 
  <summary>How does the profiling process help you in identifying and understanding the weak points in your application?</summary>
  Profiling menunjukkan bagian kode mana yang paling banyak menggunakan resource, seperti metode yang memakan CPU tinggi atau terlalu banyak alokasi memori. Dengan data dari call tree, hot spots, dan thread analysis, pengembang dapat menemukan titik lemah yang perlu dioptimalkan.
</details>

<details> 
  <summary>Do you think IntelliJ Profiler is effective in assisting you to analyze and identify bottlenecks in your application code?</summary>
  Ya, IntelliJ Profiler sangat efektif karena memberikan data real-time tentang jalur eksekusi kode, penggunaan CPU, dan alokasi memori. Dengan alat ini, pengembang bisa langsung menemukan bagian kode yang menyebabkan latensi atau konsumsi resource berlebihan.
</details>

<details> 
  <summary>What are the main challenges you face when conducting performance testing and profiling, and how do you overcome these challenges?</summary>
  Tantangan utama adalah memastikan hasil pengukuran akurat dan menghindari kesalahan interpretasi data. Solusinya adalah melakukan pengujian berulang dengan skenario yang konsisten, menggunakan dataset yang cukup, serta memadukan alat analisis seperti JMeter dan IntelliJ Profiler.
</details>

<details> 
  <summary>What are the main benefits you gain from using IntelliJ Profiler for profiling your application code?</summary>
  IntelliJ Profiler memberikan wawasan mendalam mengenai konsumsi CPU, alokasi memori, dan jalur eksekusi kode, sehingga pengembang dapat dengan cepat menemukan dan mengoptimalkan metode yang paling membebani sistem tanpa harus melakukan debugging manual.
</details>

<details> 
  <summary>How do you handle situations where the results from profiling with IntelliJ Profiler are not entirely consistent with findings from performance testing using JMeter?</summary>
  Jika hasil dari IntelliJ Profiler tidak sesuai dengan temuan dari JMeter, periksa faktor seperti perbedaan beban, jumlah request, atau konfigurasi caching. Pastikan skenario pengujian seragam untuk mendapatkan hasil yang lebih akurat.
</details>

<details> 
  <summary>What strategies do you implement in optimizing application code after analyzing results from performance testing and profiling? How do you ensure the changes you make do not affect the application's functionality?</summary>
  Optimasi dilakukan dengan mengurangi operasi berlebihan, mempercepat query database, serta menerapkan caching atau parallel processing jika diperlukan. Untuk memastikan perubahan tidak merusak fungsionalitas, dilakukan regresi testing dan validasi dengan dataset nyata.
</details>
