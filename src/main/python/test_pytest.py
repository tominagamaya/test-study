# -*- coding: utf-8 -*-

import pytest
from FizzBuzz import fizzbuzz


@pytest.fixture(scope="module", autouse=True)
def fixture_1():
    return "1"


@pytest.fixture(scope="module", autouse=True)
def fixture_fizz():
    return "Fizz"


@pytest.fixture(scope="module", autouse=True)
def fixture_buzz():
    return "Buzz"


@pytest.fixture(scope="module", autouse=True)
def fixture_fizz_buzz():
    return "FizzBuzz"


class TestFizzBuzz(object):
    @pytest.mark.parametrize("num, expected", [
        (1, fixture_1()),
        (3, fixture_fizz()),
        (5, fixture_buzz()),
        (15, fixture_fizz_buzz())
    ])
    def test_success(self, num, expected):
        result = fizzbuzz(num)
        assert result == expected


if __name__ == '__main__':
    pytest.main()
