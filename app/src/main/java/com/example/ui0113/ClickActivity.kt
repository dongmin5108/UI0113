package com.example.ui0113

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_click.*

class ClickActivity : AppCompatActivity() {
    inner class ClickImpl : View.OnClickListener{
        override fun onClick(v: View){
            //로그 출력
            Log.e("클릭","버튼1 클릭")
            //스낵바 출력
            Snackbar.make(v, "버튼1 클릭", Snackbar.LENGTH_LONG).show()
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_click)

        btn1.setOnClickListener(ClickImpl())

        btn2.setOnClickListener(object:View.OnClickListener{
            override fun onClick(v: View){
                //로그 출력
                Log.e("클릭","버튼2 클릭")
                //스낵바 출력
                Snackbar.make(v, "버튼2 클릭", Snackbar.LENGTH_LONG).show()
            }
        })
        btn3.setOnClickListener { v: View ->
            //로그 출력
            Log.e("클릭", "버튼3 클릭")
            //스낵바 출력
            Snackbar.make(v, "버튼3 클릭", Snackbar.LENGTH_LONG).show()
        }
    }
}