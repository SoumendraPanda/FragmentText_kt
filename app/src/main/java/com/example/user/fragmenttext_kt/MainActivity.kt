package com.example.user.fragmenttext_kt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var fManager = fragmentManager
        var tx = fManager.beginTransaction()
        tx.add(R.id.frag1,HomeFrag())
        tx.commit()
    }
    fun load(v: View)
    {
        if(v.id==R.id.home)
        {
            var fManager = fragmentManager
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frag1,HomeFrag())
            tx.commit()
        }
        else if(v.id==R.id.cour)
        {
            var fManager = fragmentManager
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frag1,CourseFrag())
            tx.addToBackStack("true")
            tx.commit()
        }
       else if(v.id==R.id.materials)
        {
            var fManager = fragmentManager
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frag1,MaterialsFrag())
            tx.addToBackStack("true")
            tx.commit()
        }


    }

}
