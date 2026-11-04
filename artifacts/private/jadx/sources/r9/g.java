package r9;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface g {

    @Target({ElementType.METHOD})
    public @interface a {
        String reason() default "";
    }

    String value() default "";
}
