package com.android.architechture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.architechture.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = mutableListOf<User>()
        for (i in 1..50){
            list.add(
                User(
                "Field " + i,
                "Field " + i,
                "Field " + i,
                "Field " + i,
                "Field " + i,
                "Field " + i
            )
            )
        }
        binding.rcv.apply {
            val lm = FixedGridLayoutManager()
            lm.setTotalColumnCount(1)
            layoutManager = lm
            hasFixedSize()
            adapter = MyAdapter(list)
        }
    }
}
