import unittest
from CountVowels import CountVowels


class CountVowelsTest(unittest.TestCase):
    def test_something(self):
        expected = {"a": 0, "e": 0, "i": 0, "o": 0, "u": 0}
        obj_under_test = CountVowels()
        self.assertEqual(expected, obj_under_test.count("Rhythm"))


if __name__ == '__main__':
    unittest.main()
