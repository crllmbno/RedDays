package com.example.periodcheck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FAQ : Fragment() {
    private val faqList = mutableListOf(
        faqData(
            "How likely is pregnancy after unprotected sex?",
            "The likelihood of pregnancy after unprotected sex depends on various factors, including where you are in your menstrual cycle, whether you are using any form of contraception, and the presence of any underlying medical conditions. It's essential to consider emergency contraception if you had unprotected sex and don't want to get pregnant. For more accurate information about your specific situation, consult a healthcare professional.",
            false,

            "Why is my period late?",
            "A late period can be caused by several factors, including stress, hormonal imbalances, changes in weight, diet, excessive exercise, illness, or certain medications. It can also be a sign of pregnancy. If you suspect pregnancy or have other concerns about your menstrual cycle, it's best to take a pregnancy test and consult a healthcare provider.",
            false,

            "How can I make my period come?",
            "It's essential to understand that you should not try to induce your period unless advised by a healthcare professional. Menstrual cycles are regulated by hormones, and there are various reasons why a period might be delayed. If you have concerns about your menstrual cycle or want to induce your period for any specific reason, it's best to consult a healthcare provider to understand the underlying cause and get appropriate advice.",
            false
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_f_a_q, container, false)

        val faqRecyclerView = rootView.findViewById<RecyclerView>(R.id.faqRecyclerView)
        val adapter = FAQAdapter(faqList)
        faqRecyclerView.adapter = adapter
        faqRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        return rootView
    }
}

