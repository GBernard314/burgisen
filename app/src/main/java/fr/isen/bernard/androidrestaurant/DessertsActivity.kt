package fr.isen.bernard.androidrestaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DessertsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desserts)
        title = intent.getStringExtra("category")
        setTitle(title)
    }
}