package com.example.kotlin_picasso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.lifecycle.ViewModelStore
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private val list = mutableListOf<String>()
    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addUrltoList()
        var next: Button = findViewById(R.id.next)
        var prev: Button = findViewById(R.id.prev)
        next.setOnClickListener {
               loadImg(count++)
        }

        prev.setOnClickListener {
            loadImg(--count)
        }


    }

    private fun loadImg(i:Int){
        Picasso.get().load(list[i]).into(imageView)
    }

    private fun addUrltoList(){
        list.add("http://www.clker.com/cliparts/2/6/3/d/13292537341826311042Little%20Penguin.svg.med.png")
        list.add("https://www.smallbizgenius.net/wp-content/uploads/2019/11/smallbizgenius_favicon.png")
        list.add("http://www.clker.com/cliparts/1/f/2/c/1329256295116381963Small%20Owl.svg.med.png")
        list.add("https://publicdomainvectors.org/photos/pink-erlephant.png")
        list.add("http://www.clker.com/cliparts/3/7/d/5/1197103862376117882Gioppino_Soccer_Ball.svg.med.png")
    }



}
