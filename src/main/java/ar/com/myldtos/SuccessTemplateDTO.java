package ar.com.myldtos;

public class SuccessTemplateDTO {
    private final String message;

    public SuccessTemplateDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
