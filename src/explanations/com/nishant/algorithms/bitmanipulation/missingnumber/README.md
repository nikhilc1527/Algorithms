Problem: Given an array of numbers numbered 0, 1, 2... n - 1, one element is missing. Find the missing number. Use bit manipulation, and solve in O(N).

Example:

Input(0, 5, 3, 2, 4)
Output(1)

Solution: We know that a ^ a = 0 and 0 ^ a = a. If the array we were given was complete, that is, the array had all the numbers from 0... n - 1, then if we kept a
XOR variable and XORed it with all the indices and all the elements in the array, we would get a final answer of 0. For example, for (0, 1, 2, 3, 4, 5) (the numbers
can appear in any order, it would still work):

XOR = (0 ^ 0) ^ (1 ^ 1) ^ (2 ^ 2) ^ (3 ^ 3) ^ (4 ^ 4) ^ (5 ^ 5)
    = 0 ^ 0 ^ 0 ^ 0 ^ 0 ^ 0
    = 0

If the elements appeared in another order, lets say, (4, 2, 3, 5, 1, 0):

XOR = (0 ^ 4) ^ (1 ^ 2) ^ (2 ^ 3) ^ (3 ^ 5) ^ (4 ^ 1) ^ (5 ^ 0)

and since XOR is commutative, we can rearrange the numbers to look like what we had before. However, in our example, one of the elements is missing. If we had this
array: (0, 1, 2, 4, 5) we would get this XOR

XOR = (0 ^ 0) ^ (1 ^ 1) ^ (2 ^ 2) ^ (3 ^ 4) ^ (4 ^ 5)

It starts out fine, cancelling out fine, but then it starts to group wrong numbers together. However, we can just group the numbers wrongly grouped with the next
number, like this:

XOR = (0 ^ 0) ^ (1 ^ 1) ^ (2 ^ 2) ^ 3 ^ (4 ^ 4) ^ 5

Everything got grouped correctly except to numbers: the missing number (the one we want), and the last element in the array. We know that a ^ b ^ a = b. In this
case, we have 3 ^ 5, but want to get rid of the 5. All we need to do is XOR the result with the last element, which happens to be the size of the array, and then
we have our answer.