package com.yulianti.myrestojawa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val menuText = arrayOf("Resto","Menu","Pesan")
    val menuIcon = arrayOf(R.drawable.ic_restaurant_svgrepo_com, R.drawable.ic_restaurant_plate_svgrepo_com, R.drawable.ic_restaurant_menu_svgrepo_com)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPageAdapter(this)
        view_pager.setAdapter(adapter);
        TabLayoutMediator(tab_layout, view_pager,
            TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                tab.text = menuText[position]
                tab.icon = ResourcesCompat.getDrawable(resources, menuIcon[position], null)
            }).attach()
    }
}