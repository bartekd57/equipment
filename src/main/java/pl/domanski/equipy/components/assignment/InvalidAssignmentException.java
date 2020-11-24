package pl.domanski.equipy.components.assignment;

class InvalidAssignmentException extends RuntimeException {
    public InvalidAssignmentException(String message) {
        super(message);
    }
}