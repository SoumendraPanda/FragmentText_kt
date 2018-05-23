package com.example.user.fragmenttext_kt

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class HomeFrag : Fragment() {

    var bt1: Button? = null
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var v = inflater?.inflate(R.layout.home, container, false)
        bt1 = v!!.findViewById(R.id.clickme)
        bt1!!.setOnClickListener() {
            var fManager = fragmentManager
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frag1,CourseFrag())
            tx.commit()
        }

        return v!!
    }
}