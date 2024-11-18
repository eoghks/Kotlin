package example.classExample

fun main() {
	var user = User("대환")
	user.introduce()
}

class User(var name: String, var age:Int) {
	constructor(name:String): this(name, 28)
	fun introduce() {
		println("안녕 나의 이름은 ${name}이고 나이는 ${age}야")
	}
}