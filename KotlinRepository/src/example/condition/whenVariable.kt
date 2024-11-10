package example.condition

fun main() {
	var a:Int = 1
	
	var b = when(a) {
		0->"Int"
		1->"String"
		2->"Boolean"
		else->"Any"
	}
	println(b)
}