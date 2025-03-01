package br.com.igorbag.githubsearch.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.igorbag.githubsearch.R
import br.com.igorbag.githubsearch.databinding.RepositoryItemBinding
import br.com.igorbag.githubsearch.domain.Repository

class RepositoryAdapter(private val repositories: List<Repository>) :
    RecyclerView.Adapter<RepositoryAdapter.ViewHolder>() {

    var carItemLister: (Repository) -> Unit = {}
    var btnShareLister: (Repository) -> Unit = {}

    // Cria uma nova view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemBinding = RepositoryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }

    // Pega o conteudo da view e troca pela informacao de item de uma lista
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //@TODO 8 -  Realizar o bind do viewHolder
        //Exemplo de Bind
        //  holder.preco.text = repositories[position].atributo

        // Exemplo de click no item
        //holder.itemView.setOnClickListener {
        // carItemLister(repositores[position])
        //}

        // Exemplo de click no btn Share
        //holder.favorito.setOnClickListener {
        //    btnShareLister(repositores[position])
        //}
        holder.itemBinding.tvNomeRepositorio.text = repositories[position].name
        //share
        holder.itemBinding.ivShare.setOnClickListener{
            btnShareLister(repositories[position])
        }
        holder.itemBinding.clCardContent.setOnClickListener {
            carItemLister(repositories[position])
        }




    }

    // Pega a quantidade de repositorios da lista
    //@TODO 9 - realizar a contagem da lista
    override fun getItemCount(): Int {
        return repositories.size
    }

    class ViewHolder(val itemBinding: RepositoryItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        //@TODO 10 - Implementar o ViewHolder para os repositorios
        //Exemplo:
        //val atributo: TextView

        //init {
        //    view.apply {
        //        atributo = findViewById(R.id.item_view)
        //    }
        init{
            itemBinding.tvNomeRepositorio

        }
    }
}


