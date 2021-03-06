package com.example.sos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_message.*
import kotlinx.android.synthetic.main.activity_on_click_user_profile.*

class OnClickUserProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_click_user_profile)
        backBtn1.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

        eContacts.setOnClickListener {
            val i = Intent(this,OnClickEmerContacts::class.java)
            startActivity(i)
        }

            eMsg.setOnClickListener {
                val i = Intent(this, OnClickEmerMsg::class.java)
                startActivity(i)
            }


        homeBtn1.setOnClickListener {
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }
    }
}