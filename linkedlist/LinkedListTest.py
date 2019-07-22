import unittest

from MyLinkedList import MyLinkedList


class LinkedListTest(unittest.TestCase):
    def test_empty_list_contains_nothing(self):
        obj_under_test = MyLinkedList()
        self.assertEquals(0, obj_under_test.get_size())
        self.assertEquals(True, obj_under_test.isEmpty())


if __name__ == '__main__':
    unittest.main()
