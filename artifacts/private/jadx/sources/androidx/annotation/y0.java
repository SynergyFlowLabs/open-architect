package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.SOURCE)
@jj.f(allowedTargets = {jj.b.ANNOTATION_CLASS, jj.b.CLASS, jj.b.FIELD, jj.b.FUNCTION, jj.b.PROPERTY_GETTER, jj.b.PROPERTY_SETTER, jj.b.CONSTRUCTOR})
@jj.e(jj.a.SOURCE)
public @interface y0 {
    String enforcement();

    String name();
}
