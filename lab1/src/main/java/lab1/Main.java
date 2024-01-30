package lab1;

public class Main {
    public static void main(String[] args) {
        memory mem = new memory(128);
        process p1 = new process(1, 2);
        mem.writeMemory(0, p1.data, p1.size, 0, null);
    }
}