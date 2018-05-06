package org.ckho.mlearn

/**
 * 一个Memo类，用于保存*待办事项*
 * @property id 待办事项的id
 * @property title 待办事项的标题
 * @property content 待办事项内容
 */
data class ToDo(val id:Int, val title:String, val content:String)

/**
 * 一个Model类，用于保存待办事项Memo实体
 * @property data 用于保存Memo实体的List对象
 */
class Model(private val data:List<ToDo>){
    /**
     *  从data中根据id检索特定Memo对象
     *  @param id 用于检索待办事项的id
     *  @return 一个包含检索结果的List对象，长度为0或大于0
     */
    fun getByID(id:Int) = data.filter { it.id == id }

    /**
     *  从data中根据提供的title检索标题包含title的Memo对象
     *  @param title 用于检索待办事项的title
     *  @return 一个包含检索结果的List对象，长度为0或大于0
     */
    fun getByTitle(title:String) = data.filter { it.title.contains(title) }
}