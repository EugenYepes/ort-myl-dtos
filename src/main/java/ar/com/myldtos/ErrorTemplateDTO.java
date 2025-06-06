package ar.com.myldtos;

public class ErrorTemplateDTO {
    private final int code;
    private final String message;
    private final Object details;

    public ErrorTemplateDTO(int code, String message, Object details) {
        this.code = code;
        this.message = message;
        this.details = details;
    }

    public ErrorTemplateDTO(int code, String message) {
        this(code, message, null);
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getDetails() {
        return details;
    }
}
