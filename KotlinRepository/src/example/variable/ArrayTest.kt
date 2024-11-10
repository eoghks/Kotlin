package example

fun main(){
	val list1:IntArray = IntArray(3, {0})
	val list2:Array<Int> = arrayOf<Int>(1,2,3)
	list1.set(2, 100);
	
	println(list1.size)
	println(list1.get(1))
	println(list1.get(2))
	println(list2[2])
	
	println("---------------")
	
	var anyArr:Array<Any> = arrayOf(1, "test", 3.2, 'c')
	println(anyArr[0])
	println(anyArr[1])
	println(anyArr[2])
	println(anyArr[3])
}