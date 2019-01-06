# Daily Coding Problems (Java Solutions)

I use the following terms to analyze each algorithm:

* **Time complexity**: Amount of time it takes to run an algorithm.
* **Space complexity**: Extra space or temporary space used by an algorithm (sometimes also referred to auxiliary space).

## Problems

| Day | Domain | Given | Problem | Solution |
|-----|--------|-------|---------|----------|
| 1   | Lists | List of numbers and a number k | Check whether any two numbers from the list add up to k. | [Link](/src/main/java/com/mwrod/daily/day1/Day1.java) |
| 2   | Arrays | Array of numbers | Build a new array such that each element at index i of the new array is the product of all the numbers in the given array except the one at i. | [Link](/src/main/java/com/mwrod/daily/day2/Day2.java) | 
| 3   | Trees | Root to a binary tree | Implement `serialize(root)`, which serializes the tree into a string, and `deserialize(s)`, which deserializes the string back into the tree. | [Link](/src/main/java/com/mwrod/daily/day3/Day3.java) |
| 4   | Arrays | Array of numbers | Find the lowest positive integer that does not exist in the array in linear time and constant space. The array can contain duplicates or negative numbers. | [Link](/src/main/java/com/mwrod/daily/day4/Day4.java) |
| 5   | Functional | Function cons | Implement `car` and `cdr`, with `cons(a, b)` construcing a pair, `car(pair)` returning the first and `cdr(pair)` returning the last element of that pair. | * |
| 6   | Lists | - | Implement an XOR linked list; it has an add(element) which adds the element to the end, and a get(index) which returns the node at index. | ** |
| 7   | Dynamic Programming | Encoded message | Count the number of ways the encoded message can be decoded with a mapping of a = 1, ..., z = 26. | [Link](/src/main/java/com/mwrod/daily/day7/Day7.java) |
| 8   | Trees | Root to a binary tree | Count the number of unival ("universal value") subtrees. | [Link](/src/main/java/com/mwrod/daily/day8/Day8.java) | 

\* Only for functional programming languages.

** Not possible with a programming language without pointers like Java.
