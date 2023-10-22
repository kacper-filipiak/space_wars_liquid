interface Calculator {
    fun space(boxes: List<Int>) : Int
}

class CalculatorImpl : Calculator {
    override fun space(boxes: List<Int>): Int {
        if (boxes.isEmpty()) {
            return 0 // Early return to simplify code below
        }
        var encounteredMax = 0
        var sum = 0
        val globalMaxIndex = boxes.lastIndexOf(boxes.maxOrNull()) // since list is not empty it has maximum
        boxes.subList(0, globalMaxIndex).forEach { box ->
            if(box > encounteredMax) {
                encounteredMax = box
            } else {
                sum += encounteredMax - box
            }
        }
        encounteredMax = 0
        boxes.subList(globalMaxIndex, boxes.size).asReversed().forEach { box ->
            if(box > encounteredMax) {
                encounteredMax = box
            } else {
                sum += encounteredMax - box
            }
        }
        return sum
    }

}