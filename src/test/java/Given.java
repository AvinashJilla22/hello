import java.lang.annotation.*;

public @interface Given {
    String value();

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    @StepDefinitionAnnotations
    @Documented
    public @interface Givens {
        Given[] value();
    }
}