package example.funExample

fun main() {
	var price = 5000;
	var book = Book("Kotlin", 15000)
	
	book.let{
		println(it.price)
	}
}