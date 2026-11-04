package kotlin;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes11.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {jj.b.CLASS, jj.b.PROPERTY, jj.b.CONSTRUCTOR, jj.b.FUNCTION, jj.b.TYPEALIAS})
@jj.e(jj.a.BINARY)
public @interface m2 {
    Class<? extends Annotation>[] markerClass();
}
