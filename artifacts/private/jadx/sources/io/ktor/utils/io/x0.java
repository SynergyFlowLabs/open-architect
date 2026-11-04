package io.ktor.utils.io;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@o0
@Retention(RetentionPolicy.SOURCE)
@jj.f(allowedTargets = {jj.b.CLASS, jj.b.ANNOTATION_CLASS, jj.b.CONSTRUCTOR, jj.b.FUNCTION, jj.b.PROPERTY, jj.b.PROPERTY_SETTER, jj.b.TYPEALIAS})
@jj.e(jj.a.SOURCE)
public @interface x0 {
    String version();
}
