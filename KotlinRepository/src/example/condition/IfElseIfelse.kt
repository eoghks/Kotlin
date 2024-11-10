package example.condition

fun main(){
	var a = 10;
	if(a<10)
		println("a < 10")
	else if(a >= 10 && a <= 20)
		println("10 < a < 20")
	else
		println("a > 20")
}