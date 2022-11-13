package tech.henriquedev.userinteractions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var showToastButton: Button
    lateinit var showSnackbarButton: Button
    lateinit var showDialogButton: Button
    lateinit var myLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToastButton = findViewById(R.id.button_show_toast)
        showSnackbarButton = findViewById(R.id.button_show_snackbar)
        showDialogButton = findViewById(R.id.button_show_dialog)
        myLayout = findViewById(R.id.my_layout)

        showToastButton.setOnClickListener {
            showToast()
        }

        showSnackbarButton.setOnClickListener {
            showSnackbar()
        }

        showDialogButton.setOnClickListener {
            showAlertDialog()
        }
    }

    private fun showToast() {
        Toast
            .makeText(applicationContext, "This is a Toast Message", Toast.LENGTH_LONG)
            .show()
    }

    private fun showSnackbar() {
        Snackbar
            .make(myLayout, "This is a SnackBar Message", Snackbar.LENGTH_INDEFINITE)
            .setAction("Close") {

            }.show()
    }

    private fun showAlertDialog() {
        var alertDialog = AlertDialog.Builder(this@MainActivity)
        alertDialog
            .setTitle("Change")
            .setMessage("Do you want to change the text of the button?")
            .setIcon(R.drawable.ic_warning)
            .setCancelable(false)
            .setNegativeButton("No") { dialogInterface, wich ->
                dialogInterface.cancel()
            }
            .setPositiveButton("Yes") { dialogInterface, wich ->
                showDialogButton.text = "Alert Dialog"
            }

        alertDialog.create().show()
    }
}