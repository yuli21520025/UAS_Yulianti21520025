package com.yulianti.myrestojawa

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_menu.*

class MenuFragment : Fragment() {
    lateinit var listMenu:ArrayList<Menu>

    private fun DataMenu() {
        listMenu = ArrayList()
        listMenu.add(Menu("Rawon", "Rp. 20.000,-"))
        listMenu.add(Menu("Soto Ayam", "Rp. 15.000,-"))
        listMenu.add(Menu("Kopi Hitam", "Rp. 10.000,-"))
        listMenu.add(Menu("Teh Manis", "Rp. 10.000,-"))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    private fun tampilMenu() {
        rv_listMenu.layoutManager=LinearLayoutManager(activity)
        rv_listMenu.adapter = MenuAdapter(activity!!, listMenu)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    private fun initView() {
        DataMenu()
        tampilMenu()
    }

override fun onDestroy() {
    super.onDestroy()
    this.clearFindViewByIdCache()
    }
}