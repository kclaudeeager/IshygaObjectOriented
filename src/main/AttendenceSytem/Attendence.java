package main.AttendenceSytem;
// a generic turple class to hold attendence for astudent
public class Attendence<S,D,A>{
    private final S s;
    private final D d;
    private final A a;
    public Attendence(S s, D d, A a) {
        this.s = s;
        this.d = d;
        this.a = a;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Attendence other = (Attendence) obj;
        if (a == null) {
            if (other.a != null)
                return false;
        } else if (!a.equals(other.a))
            return false;
        if (d == null) {
            if (other.d != null)
                return false;
        } else if (!d.equals(other.d))
            return false;
        if (s == null) {
            if (other.s != null)
                return false;
        } else if (!s.equals(other.s))
            return false;
        return true;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((a == null) ? 0 : a.hashCode());
        result = prime * result + ((d == null) ? 0 : d.hashCode());
        result = prime * result + ((s == null) ? 0 : s.hashCode());
        return result;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "("+s+","+d+","+a+")";

    }
    public S getS() {
        return s;
    }
    public D getD() {
        return d;
    }
    public A getA() {
        return a;
    }
    


}