package com.ownwork.constraintlayoutdemoapp

import android.support.v7.app.AppCompatActivity
import android.os.Handler
import jp.wasabeef.blurry.Blurry
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Handler().postDelayed({
            Blurry.with(this)
                    .radius(30)
                    .sampling(2)
//                    .color(Color.argb(66, 255, 255, 0))
                    .animate()
                    .onto(root_view)
        }, 5 * 1000)
    }
}
