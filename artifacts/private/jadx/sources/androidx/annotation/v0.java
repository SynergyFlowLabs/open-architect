package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@jj.f(allowedTargets = {jj.b.FUNCTION, jj.b.FIELD, jj.b.CONSTRUCTOR})
public @interface v0 {
    String expression();

    String[] imports() default {};
}
