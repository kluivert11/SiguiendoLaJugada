package uabc.edu.mx.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_first.*
import kotlinx.android.synthetic.main.activity_segunda.*

class SecondActivity : AppCompatActivity() {

    lateinit var myTextView: TextView
    lateinit var myTextView2: TextView
    lateinit var myTextView3: TextView
    lateinit var myTextView4: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        myTextView = findViewById(R.id.myTextView)
        val name = intent.getStringExtra("username")
        myTextView.text = name

        myTextView2 = findViewById(R.id.myTextView2)
        val name2 = intent.getStringExtra("apellido")
        myTextView2.text = name2

        myTextView3 = findViewById(R.id.myTextView3)
        val name3 = intent.getStringExtra("edad")
        myTextView3.text = name3

        myTextView4 = findViewById(R.id.myTextView4)
        val name4 = intent.getStringExtra("email")
        myTextView4.text = name4

        myBtn2.setOnClickListener {
            val intento1 = Intent(this, MainActivity::class.java)
            startActivity(intento1)
        }
    }
}