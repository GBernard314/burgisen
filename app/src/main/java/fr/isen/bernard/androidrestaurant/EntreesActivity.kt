package fr.isen.bernard.androidrestaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import fr.isen.bernard.androidrestaurant.databinding.ActivityEntreesBinding

private lateinit var binding: ActivityEntreesBinding

class StarterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEntreesBinding.inflate(layoutInflater);
        setContentView(binding.root);
        binding.EntreesTitle.text = intent.getStringExtra("category");

        binding.categoryList.layoutManager = LinearLayoutManager(this)
        binding.categoryList.adapter = StarterRecycleViewAdapter(listOf("Julien","Pierre", "Paul"));

    }
}
