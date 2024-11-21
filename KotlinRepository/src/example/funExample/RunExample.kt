package example.funExample

fun main() {
	var book = Book("Kotlin", 15000)
	
	var res =book.run{
		name = "new Kotlin" //boook의 name을 변경
		dc()//book의 price를 변경
		"run result"
	}
	book.introduce()
	println(res)
}
