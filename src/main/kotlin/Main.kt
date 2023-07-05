fun main() {
    val myStack=Stack()
    println(myStack.peak())
    println(myStack.pop())
    println(myStack.isEmpty())
    myStack.push(20)
    myStack.push(12)
    println(myStack.peak())
    myStack.push(3)
    myStack.push(7)
    myStack.pop()
    println(myStack.peak())

    var x=myStack.pop()
    var y=myStack.pop()
    var z=x!!+y!!
    println(z)


    println()

}
class Stack{
    var data=mutableListOf<Char>()
    fun push(value:Int){
        data.add(value)
    }
//    ? means nullable
    fun pop():Int?{
        if (data.isEmpty()){
            return null
        }
    var top=data[data.lastIndex]
    data.removeAt(data.lastIndex)
    return top

    }
//    peak tells you an element at the top without removing it
    fun peak():Int?{
        if (data.isEmpty()){
            return null
        }
    return data[data.lastIndex]
    }
    fun isEmpty():Boolean{
        return data. isEmpty()
    }
    fun reveresString(str:String):{
        var result= mutableListOf<Char>()
        for (i in str.lastIndex downTo 0){
            result.add(str[i])
        }
        return  result.toString()
    }
}

fun reverseWithStack(str: String):String{
    val stack=Stack()
    for (character in str){
        stack.push(character)
    }
    val result= mutableListOf<Char>()
    while (!stack.isEmpty()){
        result.add(stack.pop()!!)
    }
    return result.joinToString("")
}