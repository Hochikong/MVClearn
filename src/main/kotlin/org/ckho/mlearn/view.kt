package org.ckho.mlearn

class View{
    fun showByID(data:List<ToDo>){
        if (data.isNotEmpty()) data.forEach(::println)
    }

    fun showByTitle(data:List<ToDo>){
        if (data.isNotEmpty()) data.forEach(::println)
    }
}