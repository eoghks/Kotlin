package example.classExample

fun main() {
	var user = InitUser("대환", 28)
}

class InitUser(var name: String, var age:Int) {
	init {
		println("안녕 나의 이름은 ${name}이고 나이는 ${age}야")
	}
	init {
		println("두번째 Init 함수")
	}
}