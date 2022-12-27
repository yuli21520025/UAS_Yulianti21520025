package com.yulianti.myrestojawa

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPageAdapter (fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
        private val JUMLAH_MENU = 3

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> { return RestoFragment()}
            1 -> { return MenuFragment()}
            2 -> { return PesanFragment()}
            else -> { return MenuFragment()}
        }
    }

    override fun getItemCount(): Int {
        return JUMLAH_MENU
    }
}