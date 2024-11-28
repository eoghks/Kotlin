package example.etc

fun main() {
	var str = "a.b.c.d"
	var arr = str.split('.')
	
	//길이
	println(str.length)
	
	println(arr)
	//arr -> toString
	println(arr.joinToString())
	//arr -> toStirng 연결자 _
	println(arr.joinToString("_"))
	
	//서브 스트링
	println(str.substring(0..2))
	
	//첫단어 여부
	println(str.startsWith("a."))
	//끝단어 여부
	println(str.endsWith(".d"))
	//포함 여부
	 println(str.contains("b.c"))
	
}