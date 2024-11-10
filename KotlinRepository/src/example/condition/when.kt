package example.condition

fun main() {
	var a:Any = 1;
	
	when(a) {
		1 -> println("a is Int 1")
		"1" -> println("a is Stirng 1")
		else -> println("예상치 못한 값}")
	}
}