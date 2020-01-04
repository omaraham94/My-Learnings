package Testing;

public class Test {
    private interface IHelp {
        void callHelp(String help);
        void recieveHelp(String name);
    }

    private class Test1 implements IHelp {
        @Override
        public void callHelp(String help) {

        }

        @Override
        public void recieveHelp(String name) {

        }
    }
    abstract class hello implements IHelp {
        @Override
        public void callHelp(String help) {

        }

        @Override
        public void recieveHelp(String name) {

        }
    }
}
