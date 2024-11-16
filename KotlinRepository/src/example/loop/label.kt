package example.loop

fun main() {
	first@for(i in 1..6) {
		for(j in i..i+5) {
			if(j%4 == 0)
				continue@first
			if(j%2 == 0)
				continue
			if(j == 7)
				break@first
			println(j)
		}
	}
}