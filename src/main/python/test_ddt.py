import unittest

from ddt import ddt, data, unpack

from src.main.python import FizzBuzz


@ddt
class testBuzzFizz(unittest.TestCase):
    @data([1, "1"], [3, "Fizz"], [5, "Buzz"], [15, "FizzBuzz"])
    @unpack
    def test_buzzfizz(self, num, expected):
        result = FizzBuzz.fizzbuzz(num)
        self.assertEquals(expected, result)
