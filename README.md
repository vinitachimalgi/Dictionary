# Dictionary in Java
The following project implements a dictionary using Java.
Functionality available:
1. Adding a word to dictionary along with its meaning
2. updating a word's meaning
3. Delete a word and its meaning
4. search for a word's meaning

The data structure used to add words is **Trie**. It is an efficient information reTRIEval data structure. The other option to realize a
dictionary would be binary search trees, but a well balanced BST will need time proportional to M * log N, where M is maximum string
length and N is number of keys in tree.Using Trie, we can search the key in O(M) time.
Tries are more space efficient when they contain a large number of short keys, because nodes are shared between keys with common 
initial subsequences.

Since a dictionary is often used to search meanings of words, we chose to favor time complexity instead of space and went ahead with
tries. 


