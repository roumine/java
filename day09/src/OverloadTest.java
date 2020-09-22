public class OverloadTest {
    public static void main(String[] args) {
        OverloadExer test = new OverloadExer();

        test.mOL(2);
        test.mOL(3,4);
        test.mOL("test");
        System.out.println(test.max(2,3));
        System.out.println(test.max(2.2,4.4));
        System.out.println(test.max(5.2,5.4,5.3));

    }
}
