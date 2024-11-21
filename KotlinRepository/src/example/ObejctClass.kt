package example

fun main() {
	Counter.countUp()
	println(Counter.count)
	Counter.clear()
	println(Counter.count)
}

object Counter {
	var count = 0;
	fun countUp() {
		count++
	}
	
	fun clear() {
		count =0;
	}
}