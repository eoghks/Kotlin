package example

fun main() {
	EventPrinter1().start()
}

interface EventListener2 {
	fun onEvent(count: Int)
}

class Counter2(var listner: EventListener2) {
	fun count() {
		for(i in 0..20) {
			if(i%5 == 0) {
				listner.onEvent(i);
			}
		}
	}
}

class EventPrinter2 {
	fun start() {
		//리스너를 익명 클래스(object)로 정의
		Counter2(object: EventListener2{
			override fun onEvent(count: Int) {
				println(count)
			}
		}).count()
	}
}