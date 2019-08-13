import java.io.Serializable;

public class ClassForSer implements Serializable {
    String s;
    int i;
    double d;

    public ClassForSer(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    public String toString(){
        return "s=" + s + "; i=" + i + "; d=" + d;
    }
}