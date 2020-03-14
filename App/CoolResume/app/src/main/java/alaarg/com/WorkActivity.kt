package alaarg.com

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class WorkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work)

        var visitBtn = findViewById<Button>(R.id.visiBtn)

        visitBtn.setOnClickListener {

            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://inspirejo.com/"))
            startActivity(browserIntent)

        }
        var textLink = findViewById<TextView>(R.id.textLink);
        textLink.setOnClickListener {

            val textlinkGo = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Mobile-Dev-Inspire-Learning"))
            startActivity(textlinkGo)

        }
    }
}
