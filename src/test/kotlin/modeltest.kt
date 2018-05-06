import org.ckho.mlearn.Model
import org.ckho.mlearn.ToDo
import org.junit.Assert
import org.junit.Test

class ModelTest{
    @Test
    fun testGetByID(){
        val data = listOf(ToDo(1,"A","B"))
        val model = Model(data)
        Assert.assertEquals(data[0],model.getByID(1)[0])
    }

    @Test
    fun testGetBytTitle(){
        val data = listOf(ToDo(1,"Axxx","B"))
        val model = Model(data)
        Assert.assertEquals(data[0], model.getByTitle("Ax")[0])
    }
}