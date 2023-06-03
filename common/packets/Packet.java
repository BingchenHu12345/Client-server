package common.packets;


import java.io.Serializable;
import java.util.Date;

public class Packet implements Serializable {
    public int num;
    public String name;
    public Date date;
    public String word;
    public Packet(int num,String bob, Date date,String word)
    {
        this.num=num;
        this.name=name;
        this.date=date;
        this.word=word;
    }

    @Override
    public String toString() {
        return "Packet{" +
                "num=" + num +
                ", bob='" + name + '\'' +
                ", date=" + date +
                ", word='" + word + '\'' +
                '}';
    }
}
