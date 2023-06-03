package common.packets;


import java.io.Serializable;
import java.util.Date;

public class Packet implements Serializable {
    public int num;
    public String bob;
    public Date date;
    public String word;
    public Packet(int num,String bob, Date date,String word)
    {
        this.num=num;
        this.bob=bob;
        this.date=date;
        this.word=word;
    }

    @Override
    public String toString() {
        return "Packet{" +
                "num=" + num +
                ", bob='" + bob + '\'' +
                ", date=" + date +
                ", word='" + word + '\'' +
                '}';
    }
}
