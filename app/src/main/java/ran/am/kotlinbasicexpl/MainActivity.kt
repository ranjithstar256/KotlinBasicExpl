package ran.am.kotlinbasicexpl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.databinding.DataBindingUtil
import ran.am.kotlinbasicexpl.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var b: ActivityMainBinding
    lateinit var s: String
    var x: Int = 0
    var y: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val contents = arrayOf("aman","akshita","lakshay","manpreet","prateek","Sivakant","Sameer")

        val arrayAdapter: ArrayAdapter<String>

        arrayAdapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,contents)

        b.lv.adapter=arrayAdapter
        b.lv.setOnItemClickListener { adapterView, view, i, l ->


            when ("0") {
              //  0 -> dotoas("x == 0")
              //  1 -> dotoas("x == 1")
             //   2 -> dotoas("x == 2")
                "0" -> dotoas("x == 2")


                else -> { // Note the block
                    dotoas("x is neither 1 nor 2")
                }
            }
        }

        b.button.setOnClickListener {
            b.textvwid.setText(b.ed.text)
            val i = Intent(this, MainActivity2::class.java)
                .putExtra("iam",b.ed.text.toString())
            startActivity(i)
        }

        b.button2.setOnClickListener {
            x= b.n1.text.toString().toInt()
            y =b.n2.text.toString().toInt()
            y = x+y
            Toast.makeText(this, ""+y, Toast.LENGTH_SHORT).show()
            b.textvwid.setText(""+y)
        }

        fun dotoas(message: String) {                               // 1
        }
    }

    private fun dotoas(s: String): Int {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
        return 4
    }
}