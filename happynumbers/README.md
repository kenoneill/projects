# Happy Numbers#
Yes numbers can be happy too!!

What's a Happy Number? Well, pick a number. Now square its digits and add them together. Is the result 1? 
Your number is Happy! Is the result 4? Your number is Unhappy! 

But what if your result isn't either 1 or 4? Well, you take that new number and you square the digits and add them 
together, just like you did with the original number. And you keep doing this until you reach either 1 or 4!

Example, the number 836 is a happy number because
* 8\*8 + 3\*3 + 6\*6 = 109
* 1\*1 + 0\*0 + 9\*9 = 82
* 8\*8 + 2\*2 = 68
* 6\*6 + 8\*8 = 100
* 1\*1 + 0\*0 + 0\*0 = 1 -> **HAPPY!!!**

837 is not happy
* 8\*8 + 3\*3 + 7\*7 = 122
* 1\*1 + 2\*2 + 2\*2 = 9
* 9\*9 = 81
* 8\*8 + 1\*1 = 65
* 6\*6 + 5\*5 = 61
* 6\*6 + 1\*1 = 37
* 3\*3 + 7\*7 = 58
* 5\*5 + 8\*8 = 89
* 8\*8 + 9\*9 = 145
* 1\*1 + 4\*4 + 5\*5 = 42
* 4\*4 + 2\*2 = 20
* 2\*2 + 0\*0 = 4 -> **UNHAPPY!!!**
* 4\*4 = 16
* 1\*1 + 6\*6 = 37 -> **Repeated**
* 6\*6 + 1\*1 = 37 -> **Repeated**
* 3\*3 + 7\*7 = 58 -> **Repeated**
* 5\*5 + 8\*8 = 89 -> **Repeated**
* 8\*8 + 9\*9 = 145 -> **Repeated**
* 1\*1 + 4\*4 + 5\*5 = 42 -> **Repeated**
* 4\*4 + 2\*2 = 20 -> **Repeated**
* 2\*2 + 0\*0 = 4 -> **UNHAPPY!!!**
* 4\*4 = 16 -> **Repeated**
* 1\*1 + 6\*6 = 37 -> **Repeated**
* 6\*6 + 1\*1 = 37 -> **Repeated**
* 3\*3 + 7\*7 = 58 -> **Repeated**
* 5\*5 + 8\*8 = 89 -> **Repeated**
* 8\*8 + 9\*9 = 145 -> **Repeated**
* 1\*1 + 4\*4 + 5\*5 = 42 -> **Repeated**
* 4\*4 + 2\*2 = 20 -> **Repeated**

Once you get a 4, you will keep repeating tha same pattern, 16 -> 37 -> 58 -> 89 -> 145 -> 42 -> 20 -> 4.
Once you get 1, you will be stuck on 1, use these as your exit conditions.

Write some code to calculate this, up to 1000.
There are tests provided that have all the happy numbers up to 1000.

## Bonus material ## 
* Notice that there is no difference in 836, 863, 386, 368, 638, and 683, all of them are happy. Therefore once we
identify a happy (or unhappy number) we know that any number than contains just those digits will also be happy or 
unhappy. 

* How else would you speed this up.

* You probably did this using iteration. Try rewriting it as a recursive function.

 