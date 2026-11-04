package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {jj.b.FIELD, jj.b.FUNCTION})
@jj.e(jj.a.BINARY)
public @interface t {
    String prefix() default "";
}
