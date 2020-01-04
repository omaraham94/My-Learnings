public class Test1 {
    public static void main(String[] args) {
        TestEnum.Color color = TestEnum.Color.RED;

        System.out.println(color);
    }
}

class TestEnum {
    enum Color {
        RED("hello");
        private String hello;

        Color(String str) {
            this.hello = str;
        }

        public String getHello() {
            return this.hello;
        }
    }
}
