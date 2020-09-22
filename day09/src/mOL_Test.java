public class mOL_Test {
    public static void main(String[] args) {
        mOL test = new mOL();

        System.out.println(test.mOL(2));
        System.out.println(test.mOL(3,4));
        test.mOL("test");
        System.out.println(test.max(2,3));
        System.out.println(test.max(2.2,4.4));
        System.out.println(test.max(5.2,5.4,5.3));

    }
}
