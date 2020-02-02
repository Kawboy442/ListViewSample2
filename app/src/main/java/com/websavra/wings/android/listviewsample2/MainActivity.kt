package com.websavra.wings.android.listviewsample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lvMenu = findViewById<ListView>(R.id.lvMenu)
        val menuList = mutableListOf("から揚げ定食","ハンバーグ定食","生姜焼き定食","ステーキ定食","野菜炒め定食","とんかつ定食","ミンチかつ定食","チキンカツ定食","コロッケ定食","焼き魚定食","焼肉定食")
        val adapter = ArrayAdapter(applicationContext, android.R.layout.simple_list_item_1, menuList)
        lvMenu.adapter = adapter
    }
}
