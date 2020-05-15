package com.android.architechture

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Hữu Nguyễn on 11/05/2020.
 * Email: huuntt1905@gmail.com.
 */
class MyAdapter(private val list: List<User>)
    : RecyclerView.Adapter<MyAdapter.MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MovieViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie: User = list[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = list.size

    class MovieViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
        RecyclerView.ViewHolder(inflater.inflate(R.layout.list_item, parent, false)) {
        private var textView1: TextView? = null
        private var textView2: TextView? = null
        private var textView3: TextView? = null
        private var textView4: TextView? = null
        private var textView5: TextView? = null
        private var textView6: TextView? = null

        init {
            textView1 = itemView.findViewById(R.id.textView1)
            textView2 = itemView.findViewById(R.id.textView2)
            textView3 = itemView.findViewById(R.id.textView3)
            textView4 = itemView.findViewById(R.id.textView4)
            textView5 = itemView.findViewById(R.id.textView5)
            textView6 = itemView.findViewById(R.id.textView6)
        }

        fun bind(user: User) {
            textView1?.text = user.field1
            textView2?.text = user.field2
            textView3?.text = user.field3
            textView4?.text = user.field4
            textView5?.text = user.field5
            textView6?.text = user.field6
        }

    }
}