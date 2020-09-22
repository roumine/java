public class OverloadExer {
    //三个重载函数mOL
    public void mOL(int m){
        System.out.println(m * m);
    }

    public void mOL(int m,int n){
        System.out.println(m * n);
    }

    public void mOL(String m){
        System.out.println(m);
    }

    //三个重载函数max
    public int max(int m, int n){
        return (m > n)? m : n;

    }

    public double max(double m, double n){
        return (m > n)? m : n;
    }

    public double max(double m, double n, double l){
        double max = (m > n)? m : n;
        return (max > l)? max : l;
    }
}