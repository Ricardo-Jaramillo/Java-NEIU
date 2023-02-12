public class MyFileDemo {

    public static void main(String[] args) {
        String[] arr = {"25", "13", "7"};

        MyFile a = new MyFile();
        MyFile b = new MyFile("test2.png");

        System.out.println(b.getName());
        System.out.println(b.getName());

        System.out.println(a.totalBytes(arr));
    }
}
