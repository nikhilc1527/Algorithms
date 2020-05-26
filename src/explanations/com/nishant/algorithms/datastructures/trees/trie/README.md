Tries are a data strucure that can find if a string exists in O(length of the string). It can also insert the string in O(length of the string). On top of that, it can check if a string with a certain prefix exists in O(length of the prefix), which is why it sometimes 
has the name prefix tree (as you see in the explanation, it is in the form of a tree).

A trie is in the form of a tree, where every node holds a character and an int which represents the frequency of that node. The root node has a null character, or any character since you never use the root. Let's say you insert the word "app." Then the tree will look 
like this:

    nil
     |
     a
     |
     p
     |
     p

As you can see, it adds every character in a line. Now if you add the word "apple," then it looks like this:

    nil
     |
     a
     |
     p
     |
     p
     |
     |
     e

It adds the extra "le" at the end. Note we still remember the original "app" becuase the frequency of the 'p' node is 1. Then when you add "ape":

     nil
      |
      a
      |
      p
     / \
    e   p
        |
        l
        |
        e

It creates another branch with the 'e'. Now whenever you check if the tree contains a string, you travel down the tree with the string and check if the result has a frequency higher than one.