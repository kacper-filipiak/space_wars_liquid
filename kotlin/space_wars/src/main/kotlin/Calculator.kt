interface Calculator {
    fun space(boxes: List<Int>) : Int
}

class CalculatorImpl : Calculator {
    override fun space(boxes: List<Int>): Int {
        if (boxes.isEmpty()) {
            return 0 // Early return to simplify code below
        }
        val globalMaxIndex = boxes.lastIndexOf(boxes.maxOrNull()) // since list is not empty it has maximum
        val sumFromLeft = boxes.subList(0, globalMaxIndex).countSpaceUnderLocalMaximumsFromLeft()
        val sumFromRight = boxes.subList(globalMaxIndex, boxes.size).asReversed().countSpaceUnderLocalMaximumsFromLeft()
        return sumFromLeft + sumFromRight
    }

    /**
     * Calculates sum of differences between already encountered maximum value and current element
     * @return calculated sum
     */
    private fun List<Int>.countSpaceUnderLocalMaximumsFromLeft(): Int {
        var sum = 0;
        var encounteredMax = 0
        forEach { box ->
            if (box > encounteredMax) {
                encounteredMax = box
            } else {
                sum += encounteredMax - box
            }
        }
        return sum;
    }

}