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
    @Test
    fun `should return 5 when list (1, 2, 0, 3, 2, 4, 0, 2, 1) passed as an argument`(){
        //GIVEN
        val input = listOf(1, 2, 0, 3, 2, 4, 0, 2, 1);
        //WHEN
        val actual = SUT.space(input)
        //THEN
        assertThat(actual).isEqualTo(5)
    }

    @Test
    fun `should return 6 when list (1, 2, 0, 4, 2, 4, 0, 2, 1) passed as an argument`(){
        //GIVEN
        val input = listOf(1, 2, 0, 4, 2, 4, 0, 2, 1);
        //WHEN
        val actual = SUT.space(input)
        //THEN
        assertThat(actual).isEqualTo(6)
    }
    @Test
    fun `should return 83 when list (6, 4, 2, 0, 3, 2, 0, 3, 1, 4, 5, 3, 2, 7, 5, 3, 0, 1, 2, 1, 3, 4, 6, 8, 1, 3) passed as an argument`(){
        //GIVEN
        val input = listOf(6, 4, 2, 0, 3, 2, 0, 3, 1, 4, 5, 3, 2, 7, 5, 3, 0, 1, 2, 1, 3, 4, 6, 8, 1, 3);
        //WHEN
        val actual = SUT.space(input)
        //THEN
        assertThat(actual).isEqualTo(83)
    }
    @Test
    fun `should return 50 when list (6, 2, 1, 1, 8, 0, 5, 5, 0, 1, 8, 9, 6, 9, 4, 8, 0, 0) passed as an argument`(){
        //GIVEN
        val input = listOf(6, 2, 1, 1, 8, 0, 5, 5, 0, 1, 8, 9, 6, 9, 4, 8, 0, 0);
        //WHEN
        val actual = SUT.space(input)
        //THEN
        assertThat(actual).isEqualTo(50)
    }
}