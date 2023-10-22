interface Calculator {
    fun space(boxes: List<Int>) : Int
}

class Calculator_Impl : Calculator {
    override fun space(boxes: List<Int>): Int {
        return if(boxes.isEmpty()) 0
        else 1
    }

}