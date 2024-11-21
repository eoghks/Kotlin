package example.funExample

class Book(var name: String, var price: Int){
	fun dc() {
		price-=2000
	}
	
	fun introduce() {
		println("${name}: $price")
	}
}