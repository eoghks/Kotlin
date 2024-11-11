package example.funTest

fun main() {
	println(plus(1,2))
	println(plus(1))
	println(plus(y=10, x=2))
}

fun plus(x:Int, y:Int = 10): Int {
	return x + y
}