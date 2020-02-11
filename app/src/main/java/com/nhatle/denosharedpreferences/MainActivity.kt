package com.nhatle.denosharedpreferences

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.PersistableBundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("MyString","Wellcome back to Android")

        var myParcelable =  MyParcelable()
        outState.putParcelable("parcelable",myParcelable)

        var mySerializable = MySerializable("demo Serilzable")
        outState.putSerializable("serilzable",mySerializable)
       // outState.putSerializable()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        var myString  = savedInstanceState.getString("MyString")
        actionEvent.text = myString
        try {
           var myParcelable =  savedInstanceState.getParcelable("parcelable") as MyParcelable?
            textparcelable.text = myParcelable.toString()
        }catch (e:Exception){
            e.printStackTrace()
        }
        var mySerializable = savedInstanceState.getSerializable("serilzable")
        textSerializable.text = mySerializable.toString()
       
    }
}
