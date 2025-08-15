public class stringBufferDemo {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World"); // Hello World
        System.out.println(sb);
        sb.insert(5, " Bro"); // Hello Bro World
        System.out.println(sb);
        sb.replace(0, 5, "Hi"); // Hi Bro World
        System.out.println(sb);
        sb.delete(2, 6); // HiWorld
        System.out.println(sb);
        sb.reverse(); // dlroW iH
        System.out.println(sb);

        System.out.println("Capacity: " + sb.capacity());
    }
}
