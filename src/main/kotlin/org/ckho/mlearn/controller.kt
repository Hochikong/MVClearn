package org.ckho.mlearn

class Controller(val model:Model, val view:View)

infix fun Controller.handle(input: String){
    if (input.matches("search by id .*".toRegex())){
        with(input.split(" ")){
            view.showByID(model.getByID(this[3].toInt()))
        }
    }
    if (input.matches("search by title .*".toRegex())){
        with(input.split(" ")){
            view.showByTitle(model.getByTitle(this[3]))
        }
    }
}