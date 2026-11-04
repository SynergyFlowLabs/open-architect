package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.SOURCE)
@jj.f(allowedTargets = {jj.b.CONSTRUCTOR, jj.b.FIELD, jj.b.FUNCTION, jj.b.PROPERTY_GETTER, jj.b.PROPERTY_SETTER, jj.b.VALUE_PARAMETER, jj.b.ANNOTATION_CLASS, jj.b.CLASS})
@jj.e(jj.a.SOURCE)
public @interface s {
    String message();
}
