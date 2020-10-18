fun main() {    
    val a=3
    val b=5
    println("calculo normal")
    println("a+b= "+ (a+b))
    println("a-b= "+ (a-b))
    println("a*b= "+ (a*b))
    println("a/b= "+ (a/b))
    println("a%b= "+ (a%b))
    //------------------------
    //--------------------
    
    println("calculo como objetos")
    println("a.plus(b)= "+ (a.plus(b)))
    println("a.minus(b)= "+ (a.minus(b)))
    println("a.times(b)= "+ (a.times(b)))
    println("a.div(b)= "+ (a.div(b)))
    println("a.rem(b)= "+ (a.rem(b)))
    //------------------------
    //--------------------
    println("calculo directo valores como objeto") 
    println("3.plus(5)= "+ (3.plus(5)))
    println("3.minus(5)= "+ (3.minus(5)))
    println("3.times(5)= "+ (3.times(5)))
    println("3.div(5)= "+ (3.div(5)))
    println("3.rem(5)= "+ (3.rem(5)))
    //------------------------
    //--------------------
    println("ciclo for") 

val iteracion=1..10
   for (i in iteracion) {
       println(i)
   }

   for (letra in 'A'..'B') {
       println(letra)
   }
}