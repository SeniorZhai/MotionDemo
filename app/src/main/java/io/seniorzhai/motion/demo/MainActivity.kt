package io.seniorzhai.motion.demo

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_title.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list.adapter = ItemAdapter(listOf("Basic", "Basic2", "Toggle")) { position ->
            when (position) {
                0 -> {
                    startActivity(Intent(this, BasicActivity::class.java))
                }
                1 -> {
                    startActivity(Intent(this, Basic2Activity::class.java))
                }
                2 -> {
                    startActivity(Intent(this, ToggleActivity::class.java))
                }
            }
        }
    }

    class ItemAdapter(private val titles: List<String>, val action: (Int) -> Unit) :
        RecyclerView.Adapter<ItemHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
            val context = parent.context
            val itemView = LayoutInflater.from(context).inflate(R.layout.item_title, parent, false)
            return ItemHolder(itemView)
        }

        override fun getItemCount(): Int = titles.size

        override fun onBindViewHolder(holder: ItemHolder, position: Int) {
            holder.itemView.title.text = titles[position]
            holder.itemView.setOnClickListener { action(position) }
        }
    }

    class ItemHolder(view: View) : RecyclerView.ViewHolder(view)
}
