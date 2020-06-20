package uabc.edu.mx.afinal

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import java.security.AccessController.getContext


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        web_view.loadUrl( "https://siguiendolajugada.000webhostapp.com/web4/")
        navigation_view.setNavigationItemSelectedListener(
            NavigationView.OnNavigationItemSelectedListener {
                drawer_layout.closeDrawers()
                when(it.itemId){
                    R.id.page_independiente -> {
                        web_view.loadUrl( "https://siguiendolajugada.000webhostapp.com/web1/")
                        true
                    }
                    R.id.page_veteranos -> {
                        web_view.loadUrl( "https://siguiendolajugada.000webhostapp.com/web3/")
                        true
                    }
                    R.id.page_multimedia -> {
                        web_view.loadUrl( "https://siguiendolajugada.000webhostapp.com/web2/")
                        true
                    }
                    R.id.page_escribenos -> {
                        val intento1 = Intent(this, FirstActivity::class.java)
                        startActivity(intento1)
                        true
                    }
                    R.id.page_contacto -> {
                        val intento1 = Intent(this, segunda::class.java)
                        startActivity(intento1)
                        true
                    }
                    else ->  true

                }

                true
            }
        )
    }


}