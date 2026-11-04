package kotlin;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes11.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@e1(version = "1.3")
@Retention(RetentionPolicy.SOURCE)
@jj.f(allowedTargets = {jj.b.CLASS, jj.b.PROPERTY, jj.b.LOCAL_VARIABLE, jj.b.VALUE_PARAMETER, jj.b.CONSTRUCTOR, jj.b.FUNCTION, jj.b.PROPERTY_GETTER, jj.b.PROPERTY_SETTER, jj.b.EXPRESSION, jj.b.FILE, jj.b.TYPEALIAS})
@jj.e(jj.a.SOURCE)
public @interface s0 {
    Class<? extends Annotation>[] markerClass();
}
