package com.example.latihan2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi tombol-tombol
        val btnPrimary = findViewById<Button>(R.id.btnPrimary)
        val btnSuccess = findViewById<Button>(R.id.btnSuccess)
        val btnWarning = findViewById<Button>(R.id.btnWarning)

        // Set background color sesuai dengan warna yang diinginkan dari colors.xml
        btnPrimary.setBackgroundResource(R.drawable.button_primary_background)
        btnSuccess.setBackgroundResource(R.drawable.button_success_background)
        btnWarning.setBackgroundResource(R.drawable.button_warning_background)

        // Tambahkan event listener untuk masing-masing tombol
        btnPrimary.setOnClickListener {
            // Tambahkan kode yang ingin dijalankan ketika tombol primary ditekan
            // Contoh:
            // startActivity(Intent(this, PrimaryActivity::class.java))
        }

        btnSuccess.setOnClickListener {
            // Tambahkan kode yang ingin dijalankan ketika tombol success ditekan
            // Contoh:
            // startActivity(Intent(this, SuccessActivity::class.java))
        }

        btnWarning.setOnClickListener {
            // Tambahkan kode yang ingin dijalankan ketika tombol warning ditekan
            // Contoh:
            // startActivity(Intent(this, WarningActivity::class.java))
        }
    }
}
