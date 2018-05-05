import org.ckho.mlearn.*
import java.util.*

fun main(args:Array<String>){
    val data = listOf(ToDo(0,"Buy cake","Buy cake for the birthday party"),
            ToDo(1,"Send letter","Send the letter to Mike"),
            ToDo(2,"Reading", "Read the latest magazine"))
    val controller = Controller(Model(data), View())
    val sc = Scanner(System.`in`)
    while (true){
        print("Input a query plz: eg. 'search by id/title xxx' ")
        val input = sc.nextLine()
        if (input == "/exit") break else controller handle input
    }
}