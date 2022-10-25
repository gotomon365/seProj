package com.example.seProjOrder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Spinner
import com.google.firebase.firestore.FirebaseFirestore
import java.util.Objects

class MainActivity : AppCompatActivity() {
    // create some var
    lateinit var spnTableNumber: Spinner
    lateinit var spnDishType: Spinner
    lateinit var spnTaste: Spinner
    lateinit var spnChoice: Spinner
    lateinit var spnTemp: Spinner

    lateinit var dishTypeStr: String
    lateinit var tasteStr: String
    lateinit var choiceStr: String
    lateinit var tempStr: String

    lateinit var dishTypeLst: ArrayList<String>
    lateinit var tasteTypeLst: ArrayList<String>
    lateinit var choiceTypeLst: ArrayList<String>
    lateinit var tempTypeLst: ArrayList<String>

    lateinit var orderLst: ArrayList<String>
    lateinit var lvOrder: ListView

    val db: FirebaseFirestore = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var user: HashMap<Int, String> = HashMap()
        user.put(1, "Hello")
        user.put(2, "World")
        user.put(3, "Kotlin")


    }

}