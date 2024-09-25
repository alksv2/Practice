package com.rao

fun sum1(a: Int, b: Int): Int {
    return a + b;
}

typealias MyFunction = (String) -> Unit


class LambdaExample {
    fun doSomething(function: MyFunction) {
        function("Hello from Lambda!")
    }
}


public fun sum2(a: Int, b: Int) = a + b;
//Unit类型是void


public fun printSum(a: Int, b: Int) {
    print(a + b)
}

//可变长参数函数
fun vars(vararg v: Int) {
    for (vt in v) {
        print(vt)
    }
}


fun main() {
    val name = "Kotlin"
    println("Hello, $name!")

    for (i in 1..5) {
        println("i = $i")
    }

    println(sum1(1, 1));

    val example = LambdaExample()

    val a = 2
// 模板中的任意表达式：
    val s1 = "1"

    val intArray: IntArray = intArrayOf(1, 2, 3, 4, 5)

    val s2 = "${s1.replace("is", "was")}, but now is $a"

    example.doSomething { message ->
        println(message)
    }
}