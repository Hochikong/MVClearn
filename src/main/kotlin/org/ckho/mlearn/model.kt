package org.ckho.mlearn

data class ToDo(val id:Int, val title:String, val content:String)

class Model(private val data:List<ToDo>){
    /**
     *  Fetch memo from list by the id
     */
    fun getByID(id:Int) = data.filter { it.id == id }

    /**
     *  Fetch memo from list by title contain
     */
    fun getByTitle(title:String) = data.filter { it.title.contains(title) }
}