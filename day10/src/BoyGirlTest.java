public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy1 = new Boy("Hu",22);
        Girl girl1 = new Girl("Li",24);

        boy1.marry(girl1);
        boy1.shout();

        Girl girl2 = new Girl("Qi",26);
        int compare = girl2.compare(girl1);
        System.out.println(compare);
    }
}
