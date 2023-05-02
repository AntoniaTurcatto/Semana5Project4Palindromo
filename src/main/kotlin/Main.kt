fun main() {
    val nome1="ana"
    println(palindromo(nome1))
    val nome2 = "angela"
    println(palindromo(nome2))
    val vazio = ""
    println(palindromo(vazio))
    val umaLetra = "b"
    println(palindromo(umaLetra))
}

//4 - Crie uma função recursiva que verifique se uma string é palíndromo.
fun palindromo(text : String):Boolean{
    var textFun = text
    if(textFun.length<=1){
        return true
    } else {
        if (textFun[0]==textFun[textFun.lastIndex]){
            textFun=textFun.subSequence(1,(textFun.lastIndex)).toString()
            return palindromo(textFun)
        } else {
            return false
        }
    }
}