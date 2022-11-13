package tech.henriquedev.userinteractions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var showToast: Button
    lateinit var showSnackbar: Button
    lateinit var myLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToast = findViewById(R.id.button_show_toast)
        showSnackbar = findViewById(R.id.button_show_snackbar)
        myLayout = findViewById(R.id.my_layout)

        showToast.setOnClickListener {
            Toast
                .makeText(applicationContext, "This is a Toast Message", Toast.LENGTH_LONG)
                .show()
        }

        showSnackbar.setOnClickListener {
            Snackbar
                .make(myLayout, "This is a SnackBar Message", Snackbar.LENGTH_INDEFINITE)
                .setAction("Close", {

                }).show()
        }
    }
}