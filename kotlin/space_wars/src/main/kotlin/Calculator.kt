interface Calculator {
    fun space(boxes: List<Int>) : Int
}

class Calculator_Impl : Calculator {
    override fun space(boxes: List<Int>): Int {
        var max = 0
        var sum = 0
        val globalMaxIndex = boxes.lastIndexOf(boxes.maxOrNull()).takeUnless { it == -1 } ?: boxes.size;
        boxes.subList(0, globalMaxIndex).forEach {
            if(it > max) {
                max = it
            } else {
                sum += max - it
            }
        }
        boxes.subList(globalMaxIndex, boxes.size).reversed().forEach {
            if(it > max) {
                max = it
            } else {
                sum += max - it
            }
        }
        return sum
    }

}