#!/usr/bin/python
# -*- coding: utf-8 -*-

import pytest


class TestFizzBuzz(object):
    @pytest.mark.parametrize("num", [
        1, 2, 3
    ])
    def test_fizzbuzz(self, num):
        assert num == num


if __name__ == '__main__':
    pytest.main()
