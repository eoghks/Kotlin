package example.funExample

fun main() {
	b(::a)
}

fun a(str: String): String{
	return str;
}

//String을 입력받아 String을 반환하는 함수를 인자로 받는다는 의미이다.
fun b(funs: (String)->String) {
	println(funs("test"))
}