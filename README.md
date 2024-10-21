
# Deskripsi Projek

Aplikasi android ini dibuat menggunakan aplikasi Android Studio (Ladybug 2024.2.1), membahas tentang Komunikasi Antar Fragment.
Komunikasi antar fragment menggunakan SharedViewModel adalah cara yang umum dan direkomendasikan untuk berbagi data antar fragment dalam Android Architecture Components. Dengan menggunakan ViewModel yang sama (SharedViewModel), fragment dapat mengakses data yang sama dan merespon perubahan secara reaktif. Teknik ini memungkinkan fragment yang berbeda untuk berkomunikasi tanpa saling bergantung langsung satu sama lain.


## Features

- Light/dark mode toggle
- Live previews
- Fullscreen mode
- Cross platform


## Screenshots Project

![App Screenshot](https://github.com/user-attachments/assets/5599736a-a565-455f-a83f-fae945fe6411)


## Deployment

fragment_a.xml

```
  <?xml version="1.0" encoding="utf-8"?>
    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center"
    android:background="#acf1d4"
    tools:context=".FragmentA">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:paddingBottom="70dp"
        android:textStyle="bold"
        android:textSize="25dp"
        android:text="Cek Spesifikasi Laptop Gaming"
        />
    <!-- TODO: Update blank fragment layout -->
    <Button
        android:layout_width="300dp"
        android:layout_height="wrap_content"
        android:text="MSI Titan GT77HX"
        android:id="@+id/btnMSI"
        android:backgroundTint="@color/birutua"
        android:layout_gravity="center"
        />

    <Button
        android:layout_width="300dp"
        android:layout_height="wrap_content"
        android:text="ASUS ROG Zephyrus Duo 16 GX650PY"
        android:id="@+id/btnASUS"
        android:backgroundTint="@color/birutua"
        android:layout_gravity="center"
        />

    <Button
        android:layout_width="300dp"
        android:layout_height="wrap_content"
        android:text="Lenovo Legion Pro 7 16IRX9H"
        android:id="@+id/btnLENOVO"
        android:backgroundTint="@color/birutua"
        android:layout_gravity="center"
        />

    <Button
        android:layout_width="300dp"
        android:layout_height="wrap_content"
        android:text="DELL Alienware m15 R6"
        android:id="@+id/btnDELL"
        android:backgroundTint="@color/birutua"
        android:layout_gravity="center"
        />

    <Button
        android:layout_width="300dp"
        android:layout_height="wrap_content"
        android:text="ACER Predator Triton Neo 16"
        android:id="@+id/btnACER"
        android:backgroundTint="@color/birutua"
        android:layout_gravity="center"
        />


</LinearLayout>
```

