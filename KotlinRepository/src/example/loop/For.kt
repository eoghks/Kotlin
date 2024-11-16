package example.loop

fun main() {
	println("------1씩 증가-----")
	for(i in 0..3) {
		println(i)
	}
	println("------1씩 감소-----")
	for(i in 3 downTo 0) {
		println(i)
	}
	println("------2씩 증가-----")
	for(i in 0..5 step 2) {
		println(i)
	}
	println("------2씩 감소-----")
	for(i in 5 downTo 0 step 2) {
		println(i)
	}
	println("------문자-----")
	for(i in 'a'..'e') {
		println(i)
	}
	println("------배열에서 사용하기 index 접근-----")
	var arr:IntArray = intArrayOf(10, 20, 30);
	for(i in arr.indices) {
		println(arr[i])
	}
	println("------배열에서 사용하기 value 바로 접근-----")
	for(i in arr) {
		println(i)
	}
	println("------배열에서 사용하기 index, value 접근-----")
	for((index, value) in arr.withIndex()) {
		println("$index: $value")
	}
}