package uabc.edu.mx.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {

    lateinit var btn: Button
    lateinit var editText: EditText
    lateinit var editText2: EditText
    lateinit var editText3: EditText
    lateinit var editText4: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        btn = findViewById(R.id.myBtn)
        editText = findViewById(R.id.myEditText)
        editText2 = findViewById(R.id.myEditText2)
        editText3 = findViewById(R.id.myEditText3)
        editText4 = findViewById(R.id.myEditText4)

        btn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("username", editText.text.toString())
            intent.putExtra("apellido", editText2.text.toString())
            intent.putExtra("edad", editText3.text.toString())
            intent.putExtra("email", editText4.text.toString())
            startActivity(intent)
        }
        myBtn2.setOnClickListener {
            val intento1 = Intent(this, MainActivity::class.java)
            startActivity(intento1)
        }
    }
}
