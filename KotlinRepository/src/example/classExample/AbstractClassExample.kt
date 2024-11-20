package example.classExample

fun main() {
	var c = AClass();
	c.introduce()
	c.fun1()
}


abstract class AbstarcClass {
	abstract fun fun1()
	fun introduce() {
		println("Abstract Class Function")
	}
}

class AClass:AbstarcClass() {
	override fun fun1(){
		println("overrid function")
	}
}
