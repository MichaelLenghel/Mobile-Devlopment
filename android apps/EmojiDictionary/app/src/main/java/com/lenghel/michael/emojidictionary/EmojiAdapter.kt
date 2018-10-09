package com.lenghel.michael.emojidictionary

import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recyclerview_item_row.view.*

class EmojiAdapter(val emojis: ArrayList<String>) : RecyclerView.Adapter<EmojiAdapter.TextHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): TextHolder {
        // Creates a text holder and sets it all up
        return TextHolder(LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item_row, parent, false))
    }

    override fun getItemCount(): Int {
        return emojis.count()
    }

    override fun onBindViewHolder(holder: EmojiAdapter.TextHolder, position: Int) {
        val emoji = emojis[position]
       holder.bindEmoji(emoji)
    }

    //Responsible for displaying back in formation about the emoji
    class TextHolder(v : View) : RecyclerView.ViewHolder(v), View.OnClickListener {

        var view : View = v
        var emoji : String = ""

        init {
            v.setOnClickListener(this)
        }

        fun bindEmoji(emoji:String) {
            this.emoji = emoji
            view.itemTextView.text = emoji
        }
        override fun onClick(v: View?) {
            //Intent lets you move between activities

            //Create intent
            val detailIntent = Intent(view.context, EmojiDetailActivity::class.java)
            detailIntent.putExtra("emoji", emoji)
            //start intent
            startActivity(view.context, detailIntent, null)
        }
    }
}