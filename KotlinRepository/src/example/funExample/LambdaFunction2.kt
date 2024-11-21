package example.funExample

fun main() {
	var c: (String)->Unit = {s->println(s)}
	var d = {s:String -> println(s)}
	
	var e = {s: String -> s} // s를 반환
	var f = {println("f function")} // 인자가 없는 경우
	var g:(String)-> Unit = {println(it)} // 인자가 하나인 경우 it 키워드 사용 가능

	c("c function")
	d("d function")
	println(e("e function"))
	f()
	g("g function")
}