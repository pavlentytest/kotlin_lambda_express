fun main() {
    val yy = fun() = { println("1111") }
    yy().invoke()

    val zz = {println("324342")}
    zz()
    val zz2: () -> Unit = { println(8888) }
   zz2.invoke(); // здесь нужна ; - так как потом идет вызов Lambda

    { println(2222) }()

     // передача параметров
    val printer = { message: String -> println(message)}
    printer("hello")

    // несколько значений
    val sum = {x:Int, y:Int -> println(x + y)}
    sum(2, 3)   // 5
    sum(4, 5)   // 9

    val sum2 = {x:Int, y:Int -> val result = x + y; println("$x + $y = $result") }
    // или
    val sum3 = {x:Int, y:Int ->
        val result = x + y
        println("$x + $y = $result")
    }

    val sum4 = {x:Int, y:Int -> x + y}

    val a = sum4(2, 3)   // 5
    val b = sum4(4, 5)   // 9
    println("a=$a  b=$b")


    // Анонимная функция в качестве параметра
    doOperation(5,6,fun(x:Int, y:Int) = x*x+y*y)
    // Лямбда
    doOperation(3,4,{a:Int, b: Int -> a - b})
    //или
    doOperation(3,4) { a, b -> a - b }
}

fun doOperation(x: Int, y: Int, op: (Int, Int) ->Int){
    val result = op(x, y)
    println(result)
}