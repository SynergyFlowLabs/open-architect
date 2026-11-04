package d1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface g {
    int limit() default Integer.MAX_VALUE;

    Class<? extends h<?>> provider();
}
