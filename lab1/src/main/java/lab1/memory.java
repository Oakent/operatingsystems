package lab1;

public class memory {

    int memorysize;
    int offset;
    byte[] mem;
    int freespace;

    public memory(int size) {
        memorysize = size;
        offset = 0;
        mem = new byte[size];
        freespace = size;
    }

    static byte[] readMemory(int offset, int size, byte[] mem) {
        byte[] data;
        data = new byte[size];
        for (int i = 0; i < size; i++) {
            data[i] = mem[offset + i];
        }
        return data;

    }

    static void writeMemory(int offset, byte[] data, int size, int freespace, byte[] mem) {
        if (offset + size > freespace) {
            System.out.println("Error: Out of bounds");
            return;
        }
        for (int i = 0; i < size; i++) {
            mem[offset + i] = data[i];
        }
        freespace -= size;
        offset += size;
    }
}
