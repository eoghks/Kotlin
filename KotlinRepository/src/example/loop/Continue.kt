package example.loop

fun main() {
	for(i in 0..5) {
		if(i%2==0)
			continue
		println(i)
	}
}