Counting Sort is one of the few sorts that manages to sort in O(N). The catch is that it sorts in O(N + Some Really Big Number), where that really big number is the largest
in the given array, often in the ten thousands. Also, it can only sort integers. src.Algorithms.Main.com.nishant.algorithms.Sorting objects is possible, but only if the hash code of a smaller object is smaller than the
hash code of a larger object. You'll figure out why once I explain the algorithm. The algorithms is as follows: create a new array, with a size of the largest number in the
array. You can see immediately there will be a problem if the largest number is super super big, lets say integer max value. Then we will get a memory overflow. Anyways, we
then scan the given array once, and for every element E, you increment the value in count with the index as E; that is, count[E]++. You can now see why we used a size
of the maximum number, because if we had an array size 5 and there was an element 6 in the given array, then there would be an index out of bounds exception because you are
accessing the 6th element of an array size 5. After you finish incrementing all the values, you scan through those value, and every time you see that a value is larger than 1,
you know that an element exists there. You put that element into that array and decrement that value until the value at that index is 0. Because you use the element as the
index, if you scan through the array, everything will be naturally ordered, and sorted.

An improvement can be made, where you can create an array smaller size and allow negative numbers. The counting array will be of size max - min + 1 (the extra +1 because of
zero based indexing). Then for each element E, you increment count[E - min], and when acceding index i, you do arr[j] = i + min.