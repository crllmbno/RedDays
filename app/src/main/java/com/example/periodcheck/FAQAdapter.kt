package com.example.periodcheck

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FAQAdapter(private val faqs: List<faqData>) : RecyclerView.Adapter<FAQAdapter.FAQViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FAQViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.faq_item, parent, false)
        return FAQViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FAQViewHolder, position: Int) {
        val currentFAQ = faqs[position]
        holder.bind(currentFAQ)
    }

    override fun getItemCount(): Int = faqs.size

    inner class FAQViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val questionTextView: TextView = itemView.findViewById(R.id.questionTextView1)
        private val answerTextView: TextView = itemView.findViewById(R.id.answerTextView1)
        private val questionTextView2: TextView = itemView.findViewById(R.id.questionTextView2)
        private val answerTextView2: TextView = itemView.findViewById(R.id.answerTextView2)
        private val questionTextView3: TextView = itemView.findViewById(R.id.questionTextView3)
        private val answerTextView3: TextView = itemView.findViewById(R.id.answerTextView3)

        init {
            questionTextView.setOnClickListener {
                val currentFAQ = faqs[adapterPosition]
                currentFAQ.isExpanded = !currentFAQ.isExpanded
                notifyItemChanged(adapterPosition)
            }
            questionTextView2.setOnClickListener {
                val currentFAQ = faqs[adapterPosition]
                currentFAQ.isExpanded2 = !currentFAQ.isExpanded2
                notifyItemChanged(adapterPosition)
            }
            questionTextView3.setOnClickListener {
                val currentFAQ = faqs[adapterPosition]
                currentFAQ.isExpanded3 = !currentFAQ.isExpanded3
                notifyItemChanged(adapterPosition)
            }
        }

        fun bind(faq: faqData) {
            questionTextView.text = faq.question
            if (faq.isExpanded) {
                answerTextView.visibility = View.VISIBLE
                answerTextView.text = faq.answer
            } else {
                answerTextView.visibility = View.GONE
            }

            // Set data for the second question and answer
            questionTextView2.text = faq.question2
            if (faq.isExpanded2) {
                answerTextView2.visibility = View.VISIBLE
                answerTextView2.text = faq.answer2
            } else {
                answerTextView2.visibility = View.GONE
            }

            // Set data for the third question and answer
            questionTextView3.text = faq.question3
            if (faq.isExpanded3) {
                answerTextView3.visibility = View.VISIBLE
                answerTextView3.text = faq.answer3
            } else {
                answerTextView3.visibility = View.GONE
            }
        }
    }
}