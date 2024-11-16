package example.classExample

fun main() {
	var p:Person = Person("대환", 28)
	println("${p.name} 생성 완료")
	p.introduce()
}

class Person(var name:String, private var age:Int) {
	fun introduce() {
		println("안녕 나의 이름은 ${name}이고 나이는 ${age}야")
	}
}