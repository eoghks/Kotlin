package example

fun main() {
	val a:Int = 4
	val b = 5
	
	println(a::class.simpleName)
	println(b::class.simpleName)
	//a와 b 모두 타입이 Int인것을 알 수 있다.
}