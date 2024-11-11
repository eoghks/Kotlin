package example.funTest

fun main() {
	println(plus1(1))
	println(plus2
		(1))
}

//Type이 없어 예상하는 출력 결과 11을 반환하지 못함
fun plus1(x:Int, y:Int = 10) {
	x + y
}

// 단일 표현식의 함수의 경우 Int타입의 x,y를 더하는 것에서 반환타입이 Int라고 추론하여 11이 정상 출력
fun plus2(x:Int, y:Int = 10) = x+y