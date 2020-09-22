public class mOL {
    public int mOL(int m){
        return m * m;
    }

    public int mOL(int m,int n){
        return m * n;
    }

    public void mOL(String m){
        System.out.println(m);
    }

    public int max(int m, int n){
        if (m > n){
            return m;
        }
        else {
            return n;
        }
    }

    public double max(double m, double n){
        if (m > n){
            return m;
        }
        else {
            return n;
        }
    }

    public double max(double m, double n, double l){
        if (m > n){
            if (m > l) return m;
            else return l;
        }
        else {
            if (n > l) return n;
            else return l;
        }

    }
}


