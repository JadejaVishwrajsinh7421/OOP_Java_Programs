public class stringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");        // Hello World
        sb.insert(5, " Bro");       // Hello Bro World
        sb.replace(0, 5, "Hi");     // Hi Bro World
        sb.delete(2, 6);            // HiWorld
        sb.reverse();               // dlroW iH

        System.out.println(sb);
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());
    }
}
// main points to know
// Mutable sequence of characters (like StringBuffer).

// NOT thread-safe → no synchronized methods.

// Faster than StringBuffer if you don’t need multithreading safety.

// Introduced in Java 5 as a performance-optimized alternative for single-threaded use.


// | Method                     | Description                   | Example                  |
// | -------------------------- | ----------------------------- | ------------------------ |
// | `append(str)`              | Adds at the end               | `sb.append(" World")`    |
// | `insert(offset, str)`      | Inserts at given index        | `sb.insert(5, " Bro")`   |
// | `replace(start, end, str)` | Replaces text between indexes | `sb.replace(0, 5, "Hi")` |
// | `delete(start, end)`       | Deletes chars between indexes | `sb.delete(0, 3)`        |
// | `deleteCharAt(index)`      | Deletes one char              | `sb.deleteCharAt(2)`     |
// | `reverse()`                | Reverses string               | `sb.reverse()`           |
// | `capacity()`               | Current capacity              | `sb.capacity()`          |
// | `ensureCapacity(min)`      | Sets min capacity             | `sb.ensureCapacity(50)`  |
// | `setCharAt(index, ch)`     | Changes one character         | `sb.setCharAt(0, 'H')`   |
// | `length()`                 | Current length (chars used)   | `sb.length()`            |
// | `charAt(index)`            | Returns character at index    | `sb.charAt(1)`           |
// | `substring(start, end)`    | Extracts part as String       | `sb.substring(0, 5)`     |

