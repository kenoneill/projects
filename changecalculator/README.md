# Change Calculator #
Can you write some code to correctly determine the number of coins required when giving 
someone change from a purchase. Example if you spent €100 on an item worth €99.89, you would 
expect to get back 1 Ten Cent and 1 1 Cent coin.

Assume that the algorithm will always minimise the number of coins returned, ie 1 Ten Cent coin rather 
than 2 Five Cent coins.      
You should very quickly realise that there is a limit on the number of any particular coin 
that could be returned in a bundle of change.

There are tests provided that will test combinations up to €1, you should start with the first test and comment out the
rest. Once you have one passing, move onto the next 

## Bonus Material ## 
* Try to maximise the number of coins returned, rather than minimise, but at the same time don't return all 1 Cent coins
* Change the input to take a map of what coins the purchaser is handing over, see if some of the coins can be returned
* Add a till that has an initial amount of coins, and the change program has to take account of what is in the till.   