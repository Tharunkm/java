package week8;
class InvalidCountryException extends Exception {
    public InvalidCountryException() {
        super();
    }

    public InvalidCountryException(String message) {
        super(message);
    }
}