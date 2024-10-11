package groupc.backend.application.exception;

public class RecordNotFoundException extends RuntimeException {
    public RecordNotFoundException(Long id) {
        super("Record not found with an id: " + id);
    }
}
