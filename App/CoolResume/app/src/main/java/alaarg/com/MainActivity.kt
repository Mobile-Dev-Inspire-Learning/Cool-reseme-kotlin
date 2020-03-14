package alaarg.com

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val workHestory = findViewById<Button>(R.id.workHestory)
        workHestory.setOnClickListener {
            val moveToWorkHetory = Intent(applicationContext, WorkActivity::class.java)
            startActivity(moveToWorkHetory)
        }


        val call = findViewById<Button>(R.id.call)
        call.setOnClickListener {

            val phoneUri = Uri.parse("tel:+962123456789")
            val callIntent = Intent(Intent.ACTION_DIAL, phoneUri)
            startActivity(callIntent)
        }


        val email = findViewById<Button>(R.id.email)
        email.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.type = "plain/text"
            emailIntent.putExtra(Intent.EXTRA_EMAIL, "ahmad.alaarag@inspirejo.com")
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Nice Resume :)")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "I Really Enjoy In You Resumy")
            startActivity(emailIntent)
        }
    }
}
