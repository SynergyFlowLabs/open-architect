package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {jj.b.ANNOTATION_CLASS})
@jj.e(jj.a.BINARY)
public @interface z0 {

    public enum a {
        WARNING,
        ERROR;

        static {
            int i10 = 3 >> 0;
        }
    }

    a level() default a.ERROR;
}
