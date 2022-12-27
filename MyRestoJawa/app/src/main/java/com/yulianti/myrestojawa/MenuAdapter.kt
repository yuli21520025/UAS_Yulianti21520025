package com.yulianti.myrestojawa

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RemoteViews
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.menu_resto.*

class MenuAdapter (private val context: Context, private val items:ArrayList<Menu>):
RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= ViewHolder(
        LayoutInflater.from(context).inflate(R.layout.menu_resto, parent, false)
    )

    override fun getItemCount(): Int {
        return items.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items.get(position))
    }
    class ViewHolder(override val containerView:View):
            RecyclerView.ViewHolder(containerView), LayoutContainer {
                fun bindItem(item: Menu) {
                    txtMakan.text=item.menu
                    txtHarga.text=item.harga


                }
            }
}