package ran.am.kotlinbasicexpl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class Space : AppCompatActivity() {

    lateinit var s: String

    val d : String = "Good"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_space)

        for (t in 1..10) {
           dol(""+t,6)
            while (t==6){
                do {

                    if (t==2){

                    }else{

                    }

                }while (t==3)
            }
        }


    }


    private fun dol(s: String,ij :Int): Int {
        Log.d("123TAG", "dolog: "+s)
        return 4
    }
}