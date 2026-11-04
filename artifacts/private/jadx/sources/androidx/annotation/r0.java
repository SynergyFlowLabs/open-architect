package androidx.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {jj.b.CLASS, jj.b.PROPERTY, jj.b.LOCAL_VARIABLE, jj.b.VALUE_PARAMETER, jj.b.CONSTRUCTOR, jj.b.FUNCTION, jj.b.PROPERTY_GETTER, jj.b.PROPERTY_SETTER, jj.b.FILE, jj.b.TYPEALIAS})
@jj.e(jj.a.BINARY)
public @interface r0 {
    Class<? extends Annotation>[] markerClass();
}
