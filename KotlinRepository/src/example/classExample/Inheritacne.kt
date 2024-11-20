package example.classExample

fun main() {
	var child = Child("대환", 28)
	child.introduce()
	child.parentIntroduce()
}

open class Parent(var name:String, var age: Int, var type:String) {
	open fun introduce() {
		println("${this.name} ${this.age} ${this.type}")
	}
}

class Child(var name1: String, var age1: Int):Parent(name1, age1, "학생") {
	override fun introduce() {
		println("override ${this.name1} ${this.age1}")
	}
	
	fun parentIntroduce() {
		super.introduce()
	}
}
