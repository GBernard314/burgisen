package fr.isen.bernard.androidrestaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast


class HomeActivity : AppCompatActivity() {

    fun displayMsg(str: String){
        Toast.makeText(this, "Selected : $str", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(v: View){

        when (v.id) {
            R.id.buttonEntrees -> {
                displayMsg("Entrees")
                startActivity(Intent(this, EntreesActivity::class.java))
            }
            R.id.buttonPlats -> {
                displayMsg("Plats")
                startActivity(Intent(this, PlatsActivity::class.java))
            }
            R.id.buttonDesserts -> {
                displayMsg("Desserts")
                startActivity(Intent(this, DessertsActivity::class.java))
            }
        }
    }
}