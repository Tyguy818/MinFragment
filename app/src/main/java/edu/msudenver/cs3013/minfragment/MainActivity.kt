package edu.msudenver.cs3013.minfragment

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentContainerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startFragment(v : View) {
        val frameLayout = findViewById<FragmentContainerView>(R.id.fragment_container)
        val blueFragment = BlueFragment.newInstance("FIRST")
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, blueFragment)
            .addToBackStack(null)
            .commit()
    }
}