public interface Log {
    void log(String text);

    class Local implements Log {

        @Override
        public void log(String text) {
            System.out.println(text);
        }
    }
}
