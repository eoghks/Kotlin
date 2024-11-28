package example.etc

fun main() {
	var a = listOf<String?>("a", null, "c")
	val b = mutableListOf<String>()
	val c = mutableListOf<String>()
	val d = mutableListOf<String>()
	
	for(el in a) {
		el?.let{b.add(it)}
		
		c.add(el?:"default")
	}
	
	println(b) // a, c
	println(c) // a, default, c
	
	for(el in a) {
		d.add(el!!) //고의로 오류 발생
	}
	println(d)
}
