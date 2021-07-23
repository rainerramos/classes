class Quadrado (val area: Float) {

}

data class Triangulo (val area: Float)

fun main(){

    val q1 = Quadrado(10f)
    val q2 = Quadrado(10f)

    val t1 = Triangulo(10f)
    val t2 = Triangulo(10f)

    println(q1.hashCode())
    println(q2.hashCode())

    println(t1.hashCode())
    println(t2.hashCode())

    /*  conceito copy

    val t3 = t2.copy()
    println(t3) */

}
