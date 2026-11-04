package oj;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes11.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.SOURCE)
@jj.f(allowedTargets = {jj.b.FUNCTION, jj.b.PROPERTY_GETTER, jj.b.PROPERTY_SETTER, jj.b.CONSTRUCTOR})
@jj.e(jj.a.SOURCE)
public @interface v {
    Class<? extends Throwable>[] exceptionClasses();
}
