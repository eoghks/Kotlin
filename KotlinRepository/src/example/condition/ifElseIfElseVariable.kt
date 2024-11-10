package example.condition

fun main(){
	var a = 10
	val res = if(a<10){
		5
	} else if(a>=10 && a<=20){
		15
	} else {
		25
	}
	println("res: $res")
}