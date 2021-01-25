package fr.isen.bernard.androidrestaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast


class HomeActivity : AppCompatActivity() {

    private fun displayMsg(str: String){
        Toast.makeText(this, "Selected : $str", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Welcome, User"
        setTitle(title)
    }

    fun onClick(v: View){

        when (v.id) {
            R.id.buttonEntrees -> {
                displayMsg("Entrees")
                val intent = Intent(this, EntreesActivity::class.java)
                intent.putExtra("category", "Entrees")
                startActivity(intent)
            }
            R.id.buttonPlats -> {
                displayMsg("Plats")
                val intent = Intent(this, PlatsActivity::class.java)
                intent.putExtra("category", "Plats")
                startActivity(intent)
            }
            R.id.buttonDesserts -> {
                displayMsg("Desserts")
                val intent = Intent(this, DessertsActivity::class.java)
                intent.putExtra("category", "Desserts")
                startActivity(intent)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(null, "Home destroyed !!!!!!")
    }
}