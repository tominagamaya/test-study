import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzUnitTest {

    public static class 正常系 {
        FizzBuzz fizzBuzz = new FizzBuzz();

        @Test
        public void 引数が1の場合は1を返す() {
            assertEquals("1", fizzBuzz.fizzBuzz(1));
        }

        @Test
        public void 引数が3の場合はFizzを返す() {
            assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
        }

        @Test
        public void 引数が5の場合はBuzzを返す() {
            assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
        }

        @Test
        public void 引数が15の場合はFizzBuzzを返す() {
            assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
        }
    }

    public static class test {
        TestRepository testRepository = new TestRepository();
        TestData expected = new TestData();
        TestData non_expected = new TestData();

        @Test
        public void 投入から永続化をして削除するテスト() {
            insert();
            save();
            delete();
        }

        @Test
        public void 投入するテスト() {
            insert();
            TestData actual = testRepository.getData();
            assert expected == actual;
        }

        @Test
        public void 永続化するテスト() {
            insert();
            save();
            TestData actual = testRepository.getData();
            assert expected == actual;
        }

        @Test
        public void 削除するテスト() {
            insert();
            save();
            delete();
            TestData actual = testRepository.getData();

            assert expected == actual;
        }

    }


    public static void save() {

    }

    public static void delete() {

    }

    private static void insert() {

    }

}

