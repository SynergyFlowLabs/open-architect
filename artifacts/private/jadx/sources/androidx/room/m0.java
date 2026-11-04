package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({})
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {})
@jj.e(jj.a.BINARY)
public @interface m0 {
    String entityColumn() default "";

    String parentColumn() default "";

    Class<?> value();
}
