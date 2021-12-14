package com.example.week03day03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var ListView1:ListView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //test
     /*
        Log.v("test1","this message for test")
        val a=10
        val b=-20
        val z=a+b
        if (z<0){Log.v("test2","this result negative")}
        else{Log.i("test2","this result is positive")}
      */
//exercise  1
//        Log.i("test3","My name is Faisal")
//        val a=10
//        val b=0
//        val result=a*b
//        if (result==0){ Log.e("test3","أدخل رقم اكبر من الصفر") }
//        else if (result>0){Log.i("test3","$result")}

connectView()
        //exercise  1

        prepareListView()
    }
    private fun connectView(){ ListView1 = findViewById(R.id.ListView1) }
    private fun prepareListView(){
        var array:ArrayList<String> = arrayListOf()
        array.add("Faisal")
        array.add("Ali")
        array.add("omar")
        var ArrayAdapter:ArrayAdapter<String> = ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,array)
        ListView1?.adapter = ArrayAdapter
    }


}
