import spock.lang.Specification
import spock.lang.Unroll

class FizzBuzzTest extends Specification {

    @Unroll
    def "FizzBuzzのテスト_#num"() {
        setup:
        def sut = new FizzBuzz()

        expect:
        sut.fizzBuzz(num) == result

        where:
        num || result
        1   || "1"
        3   || "Fizz"
        5   || "Buzz"
        15  || "FizzBuzz"
    }
}

