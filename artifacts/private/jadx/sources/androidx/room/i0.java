package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {jj.b.FUNCTION})
@jj.e(jj.a.BINARY)
public @interface i0 {
    Class<?> entity() default Object.class;

    @t0
    int onConflict() default 3;
}
