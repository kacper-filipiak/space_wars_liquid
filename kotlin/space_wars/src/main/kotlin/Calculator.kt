interface Calculator {
    fun space(boxes: List<Int>) : Int
}

class Calculator_Impl : Calculator {
    override fun space(boxes: List<Int>): Int {
        var max = 0
        var sum = 0
        boxes.forEach {
            if(it > max) {
                max = it
            } else {
                sum += max - it
            }
        }
        return sum
    }

}