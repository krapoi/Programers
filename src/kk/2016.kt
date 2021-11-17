class `2016` {
    fun solution(a: Int, b: Int): String {
        var st = arrayOf("FRI","SAT","SUN","MON","TUE","WED","THU")
        var date = arrayOf(31,29,31,30,31,30,31,31,30,31,30,31)
        var select = 0

        for (i in 1..a){
            select += date[i]
        }
        select += b-1
        return st[select % 7]
    }
}

fun main() {

}

