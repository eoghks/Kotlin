package example.funExample

infix fun String.strSum(x:Int) = this + x
infix fun Int.mul(x:Int) = this*4

fun main() {
	println("aaa" strSum 1)
	println("aaa".strSum(1))
	
	println(2.mul(3))
	println(2 mul 4)
}