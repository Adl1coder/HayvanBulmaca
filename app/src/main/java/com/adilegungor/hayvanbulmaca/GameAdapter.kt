package com.adilegungor.hayvanbulmaca

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class GameAdapter(
    private val animalList: List<Animal>,
    private val onClickListenerGame: OnClickListenerGame
) : RecyclerView.Adapter<GameAdapter.ViewHolder>() {

    interface OnClickListenerGame {
        fun onItemClick(currentAnimal: Animal)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.row_design_game, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return animalList.size
        //boyut
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            onClickListenerGame.onItemClick(animalList[position])
        }
        return holder.bind(animalList[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var animalImage: ImageView = itemView.findViewById(R.id.animal_image)
        fun bind(gameBind: Animal) {
            animalImage.setImageResource(gameBind.img)
        }
    }

}