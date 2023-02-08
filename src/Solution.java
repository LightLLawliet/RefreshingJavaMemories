public class Solution {

    public static void main(String[] args) {
        final Log log = new Log.Local();
        Executor executor = new Executor();
        DataCallback callback = new DataCallback() {
            @Override
            public void returnSuccess(DataContainer dataContainer) {
                dataContainer.show();
            }

            @Override
            public void returnError(ErrorInfo errorInfo) {
                errorInfo.log(log);
            }
        };
        executor.execute(callback);
    }
}
