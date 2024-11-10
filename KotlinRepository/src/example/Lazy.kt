package example

fun main() {
	val a:Int by lazy{
		println("변수 초기화 중입니다.")
		10
	}
	
	println("start")
	println(a)
	println("end")
}