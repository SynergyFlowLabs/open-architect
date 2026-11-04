package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.SOURCE)
@jj.f(allowedTargets = {jj.b.ANNOTATION_CLASS})
@jj.e(jj.a.SOURCE)
public @interface k0 {
    boolean flag() default false;

    boolean open() default false;

    long[] value() default {};
}
