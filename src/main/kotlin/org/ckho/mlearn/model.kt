package org.ckho.mlearn

data class ToDo(val id:Int, val title:String, val content:String)

class Model(private val data:List<ToDo>){
    fun getByID(id:Int) = data.filter { it.id == id }
    fun getByTitle(title:String) = data.filter { it.title.contains(title) }
}