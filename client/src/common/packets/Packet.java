package common.packets;


import java.io.Serializable;

public class Packet implements Serializable {
    public int num;
    public Packet(int num)
    {
        this.num=num;
    }
}
