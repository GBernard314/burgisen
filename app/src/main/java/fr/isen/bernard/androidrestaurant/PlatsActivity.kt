package fr.isen.bernard.androidrestaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PlatsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plats)
        title = intent.getStringExtra("category")
        setTitle(title)
    }
}