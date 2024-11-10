package example.condition

fun main() {
	var a:Any = 10;
	
	if(a is Int)
		println("a is Int")

	if(a !is String)
		println("a is not String")
}