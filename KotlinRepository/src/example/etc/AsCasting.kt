package example.etc

fun main() {
	var a = Drink()
	a.drink()
	
	var b:Drink = Cola()
	b.drink()
	
	if(b is Cola)// 일시적으로 캐스팅
		b.wash()
	
	var c = b as Cola // b가 Cola로 캐스팅된다.
	c.wash()
	b.wash()
}

open class Drink{
	var name = "음료수"
	open fun drink() {
		println("${name}을 마십니다.")
	}
}

class Cola:Drink() {
	var type = "콜라"
	override fun drink() {
		println("${type}을 마십니다.")
	}
	
	fun wash(){
		println("설거지를 합니다.")
	}
}
