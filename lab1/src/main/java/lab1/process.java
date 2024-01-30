package lab1;

import java.util.Random;

public class process {

    int pid;
    int size;
    byte[] data;
    int start;
    int priority = 1;
    int state = 1;
    int cputime = 1;

    public process(int pid, int size) {
        this.pid = pid;
        this.size = size;
        Random rd = new Random();
        rd.nextBytes(this.data);
    }
}