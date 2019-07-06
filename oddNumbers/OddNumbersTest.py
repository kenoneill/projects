import unittest
from OddNumbers import odd_numbers


class MyTestCase(unittest.TestCase):
    def test_simple_case(self):
        self.assertEqual({1}, odd_numbers(2))

    def test_odd_numbers_up_limit(self):
        self.assertEqual({1, 3, 5, 7, 9}, odd_numbers(10))


if __name__ == '__main__':
    unittest.main()
