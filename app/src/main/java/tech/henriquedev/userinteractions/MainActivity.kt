package tech.henriquedev.userinteractions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var showToast: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToast = findViewById(R.id.button_show_toast)

        showToast.setOnClickListener {
            Toast
                .makeText(applicationContext, "This is a Toast Message", Toast.LENGTH_LONG)
                .show()
        }
    }
}