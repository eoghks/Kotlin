package example.classExample

fun main(){
	var d = Dog();
	d.run()
	d.eat()
}

interface Runner {
	fun run()
}

interface Eater {
	fun eat() {
		println("Eat")
	}
}

class Dog(): Runner, Eater{
	override fun run(){
		println("Run")
	}
	
	override fun eat() {
		println("Eat Override")
	}
}