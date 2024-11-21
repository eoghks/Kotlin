package example.classExample

fun main() {
	val va = a("a", 1)
	val vb = b("b", 1)
	
	println(va ==a("a", 1))//주소비교
	println(vb ==b("b", 1))//동등값 비교
	
	println(va)//객체 주소
	println(vb)//tosStirng
	
	//복사
	println(vb.copy())
	println(vb.copy(name="c"))
	println(vb.copy(id =2))
	
	val list = listOf<b>(
		b("a", 123),
		b("b", 234),
		b("c", 345)
	)
	
	//변수 위치를 통해 자동으로 a,b에 값을 넣어준다.
	for((a,b) in list) {
		println("$b $a")
	}
}

class a(val name:String, val id: Int) {
	
}

data class b(val name: String, val id: Int) {
	
}