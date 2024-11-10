package example

fun main() {
	val a = listOf<Int>(1,2,3)
	val b = mutableListOf<Int>()
	
	b.add(1)
	b.add(2)
	b.add(3)
	b.add(2,5)
	println(a)
	println(b)
	b.remove(2)
	println(b)
}