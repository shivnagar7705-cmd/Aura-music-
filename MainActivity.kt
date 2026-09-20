package com.aura.music
import android.app.Activity
import android.os.Bundle
import android.widget.*
import android.graphics.Color
import android.view.Gravity
class MainActivity : Activity() {
 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  val lay = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; gravity = Gravity.CENTER; setPadding(80,300,80,80); setBackgroundColor(Color.parseColor("#0B0B0F")) }
  val tv = TextView(this).apply { text = "AURA MUSIC\n\nFINAL FIX\nApp Open!"; textSize = 26f; setTextColor(Color.WHITE); gravity = Gravity.CENTER }
  lay.addView(tv)
  val btn = Button(this).apply { text = "Test OK"; setOnClickListener { Toast.makeText(this@MainActivity,"Ab Crash Nahi!",Toast.LENGTH_LONG).show() } }
  lay.addView(btn)
  setContentView(lay)
 }
}