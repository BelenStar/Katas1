import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

//TEST CASES
// convertir I a 1*
// convertir V a 5*
// convertir X a 10*
// convertir L a 50*
// convertir C a 100*
// convertir D a 500*
// convertir M a 1000*
// Convertir XX a 20*

// convertir IV a 4*
// convertir XI a 9*
// convertir XLIX a 49*
// convertir XC a 90 *
// convertir CD a 400 *
// convertir CM a 900

class RomanTest {

    @Test
    internal fun convertIto1() {
        val roman = Roman()
        val number = roman.convert("I")
        assertEquals(1,number)

    }

    @Test
    internal fun convertVto5() {
        val roman = Roman()
        val number = roman.convert("V")
        assertEquals(5,number)

    }
    @Test
    internal fun convertXto10() {
        val roman = Roman()
        val number = roman.convert("X")
        assertEquals(10,number)

    }

    @Test
    internal fun convertLto50() {
        val roman = Roman()
        val number = roman.convert("L")
        assertEquals(50,number)

    }

    @Test
    internal fun convertCto100() {
        val roman = Roman()
        val number = roman.convert("C")
        assertEquals(100,number)

    }

    @Test
    internal fun convertDto500() {
        val roman = Roman()
        val number = roman.convert("D")
        assertEquals(500,number)

    }

    @Test
    internal fun convertMto1000() {
        val roman = Roman()
        val number = roman.convert("M")
        assertEquals(1000,number)

    }

    @Test
    internal fun convertXXto20() {
        val roman = Roman()
        val number = roman.convert("XX")
        assertEquals(20,number)

    }

    @Test
    internal fun convertIVto4() {
        val roman = Roman()
        val number = roman.convert("IV")
        assertEquals(4,number)

    }

    @Test
    internal fun convertIXto9() {
        val roman = Roman()
        val number = roman.convert("IX")
        assertEquals(9,number)

    }

    @Test
    internal fun convertXLIXto49() {
        val roman = Roman()
        val number = roman.convert("XLIX")
        assertEquals(49,number)

    }

    @Test
    internal fun convertXCto90() {
        val roman = Roman()
        val number = roman.convert("XC")
        assertEquals(90,number)

    }

    @Test
    internal fun convertCDto400() {
        val roman = Roman()
        val number = roman.convert("CD")
        assertEquals(400,number)

    }

    @Test
    internal fun convertCMto900() {
        val roman = Roman()
        val number = roman.convert("CM")
        assertEquals(900,number)

    }


}
