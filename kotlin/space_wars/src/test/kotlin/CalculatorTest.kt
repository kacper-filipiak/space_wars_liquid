import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class CalculatorTest {

    val SUT = CalculatorImpl()
    @Test
    fun `should return 0 when empty list passed as an argument`(){
        //GIVEN

        //WHEN
        val actual = SUT.space(emptyList())
        //THEN
        assertThat(actual).isEqualTo(0)
    }
    @Test
    fun `should return 1 when list (1, 0, 1) passed as an argument`(){
        //GIVEN
        val input = listOf(1, 0, 1);
        //WHEN
        val actual = SUT.space(input)
        //THEN
        assertThat(actual).isEqualTo(1)
    }
    @Test
    fun `should return 2 when list (1, 0, 0, 1) passed as an argument`(){
        //GIVEN
        val input = listOf(1, 0, 0, 1);
        //WHEN
        val actual = SUT.space(input)
        //THEN
        assertThat(actual).isEqualTo(2)
    }
    @Test
    fun `should return 2 when list (2, 0, 0, 1) passed as an argument`(){
        //GIVEN
        val input = listOf(2, 0, 0, 1);
        //WHEN
        val actual = SUT.space(input)
        //THEN
        assertThat(actual).isEqualTo(2)
    }
    @Test
    fun `should return 3 when list (2, 0, 4, 0, 1) passed as an argument`(){
        //GIVEN
        val input = listOf(2, 0, 4, 0, 1);
        //WHEN
        val actual = SUT.space(input)
        //THEN
        assertThat(actual).isEqualTo(3)
    }
}