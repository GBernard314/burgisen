package fr.isen.bernard.androidrestaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMsg(msg: String?) {
        val toast: Toast = Toast.makeText(this, msg, Toast.LENGTH_LONG)
        toast.show()
    }

    fun displayToastMsg(v: View?) {
        toastMsg("Hello how are you today!!")
    }
}