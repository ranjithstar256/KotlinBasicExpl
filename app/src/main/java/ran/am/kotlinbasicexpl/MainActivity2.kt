package ran.am.kotlinbasicexpl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ran.am.kotlinbasicexpl.databinding.ActivityMain2Binding
import ran.am.kotlinbasicexpl.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var b: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = DataBindingUtil.setContentView(this, R.layout.activity_main2)

      //  b.textView.setText(intent.getStringExtra("sdfsd"))
        //setContentView(R.layout.activity_main2)

        // getting the recyclerview by its id


        // this creates a vertical layout Manager
        b.recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view
        for (i in 1..20) {
            data.add(ItemsViewModel(android.R.drawable.star_big_on, "Item " + i))
        }

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        b.recyclerview.adapter = adapter
    }
}