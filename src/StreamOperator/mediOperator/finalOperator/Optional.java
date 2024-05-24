package StreamOperator.mediOperator.finalOperator;

public final class Optional<T> {
    private final T value;

    private Optional(T value) {
        this.value = value;
    }

    public static <T> Optional<T> ofNullable(T value) {
        return new Optional<>(value);
    }

    public T get() {
        if (value == null) {
            throw new NullPointerException("Value is null");
        }
        return value;
    }

    public boolean isPresent() {
        return value != null;
    }
}
