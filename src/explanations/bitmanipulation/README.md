NOTE: In Python, all integers are assumed to be 32 bit unsigned integers.

Bit Manipulation is manipulating the bits of a number. Computers store all numbers internally as binary because inside a computer, it can only
represent 0's and 1's representing powered wires and not powered wires. Each language has it's own set of data types, like int, float, char,
etc. Every data type has a different number of bytes, and each byte has 8 bits, where each bit can store either 0 or 1. For example, in Java
an int has 4 bytes, or 32 bits. We can easily calculate the largest possible value by doing (2 ^ 31) - 1. The reason we are doing 2 ^ 31 instead
of 2 ^ 32 is because the first bit is used for the sign. If the first bit, usually called the signed bit, is 0, it means the number is positive.
If the signed bit is 1, it means the number is negative.

These languages also gave a number of tools to help manipulate these bits. Here are a few operators:

a & b (a and b): The and of two numbers looks at each bit individually. For each bit, the resulting numbers bit at that index is the and of the two previous bits.
The and of two bits is 1 if both bits are 1. For example: 2 & 6 = 2. For the first pair is 0 and 1, which results in 0. The next pair, 1 and 1, which is 1, and the
last pair, 0 and 0, is 0. So the resulting number is 0 1 0, which is 2.

0 1 0
1 1 0
↓ ↓ ↓
0 1 0 (2)

a | b (a or b): Almost the same as and, except when comparing bits it uses or instead of and. The or of two bits is 1 if at least of of the bits is 1. For example,
2 | 6 = 6.

0 1 0
1 1 0
↓ ↓ ↓
1 1 0 (6)

a ^ b (a XOR b): Similar to the previous two, except compares two bits using XOR. The XOR of two bits is 1 if the two bits are different, that is, one bit is 1
and one is 0. For example, 2 ^ 6 = 4.

0 1 0
1 1 0
↓ ↓ ↓
1 0 0 (4)

~a (complement of a): Flips all the bits of a in the resulting number. For example, ~5 = -6.

00000000000000000000000000000101
11111111111111111111111111111010 (-6)

a >> b (a signed shift right b): Shifts all of the bits of a right by b. The bits at the end that "falls of the edge" get excluded from the result. Shift right
does not shift the signed bit (the signed bit stays in the same place. For example, 10 >> 2 = 2.

1 0 1 0
    1 0



Usually, the only needed shift right amount is 1 (10 >> 1).

a << b (a shift left b): Shifts all of the bits of a left by b. The bits that appear at the end because of the empty slots become 0's. For example, 5 << 1 = 10.

1 0 1
1 0 1 0 (10)

Usually, the only needed shift left amount is 1 (5 << 1).

a >>> b (unsigned shift right): Same as shift right except shifts the signed bit too.

The Utility class provides a few implementations on commonly used operations. Here are a few patterns and tricks it uses, as well as a few other ones that are
useful:

1. To get the first bit of any number a, use a & 1. All the other bits gets (anded?) with 0, except the single 1. If the first bit was 0, 0 and
2 returns 0. If first bit was 1, 1 and 1 returns 1.
3. To get the ith bit of any number a, use (a >> i) & 1. Simply shifts the bit to become the first bit, then gets the first bit using and 1.
4. a ^ a = 0. Since it is (XORed?) with itself, and XOR checks for a difference, everything outputs 0.
5. a ^ 0 = a. The 0's XOR 0 stays 0, and the 1's XOR 0 stays 1.
6. a & 0 = 0. And requires both bits to be 1. Since there are no 1's present in the number 0, everything becomes 0.
7. a | 0 = a. All the 0's or 0 stays 0, and the 1's or 0 stay 1. So, everything stays the same.
8. a | 1 sets the first bit to 1. According to the previous rule, everything before the 1 stays the same. If the first bit is 0, it becomes 1, and if the first bit
is 1, it stays 1.
9. a | (1 << i). Moves the position of the 1 to the correct location, and then according to the previous rule it sets it to 1.
10. a & ~0 = a. The complement of 0 is a number where all bits are 1. For each bit, the 0's and 1 stays 0, and the 1's and 1 stays 1.
11. a & ~1 sets the first bit to 0, also called clearing the first bit. The complement of 1 is a number where all bits are one except the first one, which is 0.
According to the previous rule, all the one bits makes sure everything else stays the same, except for the 0 bit. The 0's and 0 stays 0, and the 1's and 0 becomes 0.
12. a & ~(1 << i) clears the ith bit. According to the previous rule, keeping a one as the first bit, clears the first bit. Moving the first bit to the ith location
clears the ith bit.
13. a ^ b ^ a = b. Since XOR is commutative, we can rearrange this to (a ^ a) ^ b. According to property 4, the a ^ a becomes 0. So, this becomes 0 ^ b. According to
property 5, the solution becomes b.