public class ErrorInfo {
    private final String message;
    private final String cause;

    public ErrorInfo(String message, String cause) {
        this.message = message;
        this.cause = cause;
    }

    public void log(Log logger) {
        logger.log("message" + message + " cause" + cause);
    }
}
