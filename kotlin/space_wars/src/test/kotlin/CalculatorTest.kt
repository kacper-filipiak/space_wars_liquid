import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class CalculatorTest {
    @Test
    fun `should return 0 when empty list passed as an argument`(){
        //GIVEN
        val SUT = Calculator_Impl()
        //WHEN
        val actual = SUT.space(emptyList())
        //THEN
        assertThat(actual).isEqualTo(0)
    }
}