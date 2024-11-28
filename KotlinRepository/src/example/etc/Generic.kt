package example.etc

fun main() {
	UsingGeneric(A()).doShout()
	UsingGeneric(B()).doShout()
	
	genericFun(A())
	genericFun(B())
}

fun<T:A> genericFun(t: T) {
	t.shout()
}

open class A {
	open fun shout() {
		println("AAAAAAA")
	}
}

class B:A() {
	override fun shout() {
		println("BBBBBBB")
	}
}

class UsingGeneric<T: A>(val t: T) {
	fun doShout() {
		t.shout()
	}
}
 