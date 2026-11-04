package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@jj.c
@Documented
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {jj.b.ANNOTATION_CLASS, jj.b.CLASS, jj.b.FUNCTION, jj.b.PROPERTY_GETTER, jj.b.PROPERTY_SETTER, jj.b.CONSTRUCTOR, jj.b.FIELD, jj.b.FILE})
@jj.e(jj.a.BINARY)
public @interface w0 {
    int api() default 1;

    int value() default 1;
}
