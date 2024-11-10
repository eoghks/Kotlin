package example.variable

fun main() {
	var x:Int = 10;
	var s:String ="10"
	
	//var xStr:String = x; 오류
	var xStr = x.toString();
	var sInt = s.toInt();
	
	println(xStr::class.simpleName)
	println(sInt::class.simpleName)
}