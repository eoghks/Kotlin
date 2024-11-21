package example

fun main() {
	EventPrinter1().start()
}

interface EventListener1 {
	fun onEvent(count: Int)
}

class Counter1(var listner: EventListener1) {
	fun count() {
		for(i in 0..20) {
			if(i%5 == 0) {
				listner.onEvent(i);
			}
		}
	}
}

class EventPrinter1:EventListener1 {
	override fun onEvent(count: Int) {
		println(count)
	}
	
	fun start() {
		var count = Counter1(this)
		count.count()
	}
}