package example.classExample

fun main() {
	var c1 =  Class1()
	var c2 =  Class2()
	var c3 =  Class3()
	var c4 =  Class4("대환")
	
	c1.introduce()
	c2.introduce()
	c3.introduce()
	c4.introduce()
}

class Class1 constructor () {
	fun introduce() {
		println("주 생성자 선언")
	}
}

class Class2() {
	fun introduce() {
		println("주 생성자의 constructor 생략")
	}
}

class Class3 {
	fun introduce() {
		println("매개 변수가 없는 클래스의 주 생성자 자동 생성")
	}
}


class Class4(var name:String) {
	fun introduce() {
		println("매개변수가 있는 주 생성자")
	}
}