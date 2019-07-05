import unittest
from Reverse import reverse


class ReverseTest(unittest.TestCase):
    def test_simple_case_single_letter(self):
        self.assertEqual('a', reverse("a"))

    def test_multiple_characters(self):
        self.assertEqual("cba", reverse("abc"))

    def test_multiple_characters_with_spaces(self):
        self.assertEqual("jih fed cba", reverse("abc def hij"))

    def test_multiple_characters_is_a_palindrome(self):
        self.assertEqual("abba", reverse("abba"))


if __name__ == '__main__':
    unittest.main()
