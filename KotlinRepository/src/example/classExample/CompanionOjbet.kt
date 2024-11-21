package example.classExample

fun main() {
	var a = Food()
	var b = Food()
	
	a.up()
	b.up()
	println(Food.total)
}

class Food() {
	companion object {
		var total =0;
	}
	
	fun up() {
		total++;
	}
}