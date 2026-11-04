package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.PACKAGE, ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {jj.b.FILE, jj.b.ANNOTATION_CLASS, jj.b.CLASS, jj.b.ANNOTATION_CLASS, jj.b.CONSTRUCTOR, jj.b.FUNCTION, jj.b.PROPERTY_GETTER, jj.b.PROPERTY_SETTER, jj.b.FIELD})
@jj.e(jj.a.BINARY)
public @interface Keep {
}
