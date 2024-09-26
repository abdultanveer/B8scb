package com.example.b8scb

import android.app.DatePickerDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import java.util.Calendar

class MainActivity : AppCompatActivity() {
lateinit var emailEditText: EditText
lateinit var mainTextView: TextView

    private lateinit var btnPickDate: Button
    private lateinit var txtSelectedDate: TextView

    var TAG = MainActivity::class.java.simpleName

var sum:Int = 20

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //inflating
        Log.i(TAG,"created --egg -- m/y is allocated")

        emailEditText = findViewById(R.id.etEmail) //taking handle
        mainTextView = findViewById(R.id.tvMain)

        btnPickDate = findViewById(R.id.btnPickDate)
        txtSelectedDate = findViewById(R.id.txtSelectedDate)

        btnPickDate.setOnClickListener {
            showDatePickerDialog()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG,"actvity started-visbible-hatched")
    }

    override fun onResume() {
        super.onResume()
        Log.w(TAG,"awake")
    }

    override fun onPause() {
        super.onPause()
        Log.v(TAG,"nap")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"hibernate-- activity is in storage")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"destroyed")
    }




    private fun showDatePickerDialog() {
        // Get the current date
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        // Create a DatePickerDialog
        val datePickerDialog = DatePickerDialog(
            this,
            { _, selectedYear, selectedMonth, selectedDayOfMonth ->
                // The month is 0-based so we need to add 1 to it
                val selectedDate = "$selectedDayOfMonth/${selectedMonth + 1}/$selectedYear"
                txtSelectedDate.text = selectedDate
            },
            year, month, day
        )

        // Show the DatePickerDialog
        datePickerDialog.show()
    }

    fun clickHandler(view: View) {
        //add(10,20)
        var data = emailEditText.text.toString()
        mainTextView.setText(data)
        var homeIntent = Intent(this,HomeActivity::class.java)
        homeIntent.putExtra("myname","abdul")
        startActivity(homeIntent)

        //showSnackbar()
    }

    private fun showSnackbar() {
        Log.i("MainActivity", "button clicked")
        var view = findViewById<ConstraintLayout>(R.id.main)
        // var snackbar =
        Snackbar.make(view, "1 archived", Snackbar.LENGTH_LONG)
            .setAction("undo", {})
            .show()
    }

    fun add(firstNo:Int, secondNo:Int):Int{
        return firstNo + secondNo
    }

    fun openDialer(view: View) {
        var dialIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:9880979732"))
        startActivity(dialIntent)
    }

}