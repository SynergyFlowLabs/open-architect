package q3;

import androidx.annotation.NonNull;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface b {

    @Target({})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
        int mask() default 0;

        @NonNull
        String name();

        int value();
    }

    @NonNull
    a[] intMapping() default {};

    @NonNull
    String value();
}
